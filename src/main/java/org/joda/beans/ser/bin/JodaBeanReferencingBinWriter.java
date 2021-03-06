/*
 *  Copyright 2001-present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.ser.bin;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.joda.beans.Bean;
import org.joda.beans.ImmutableBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.ser.JodaBeanSer;
import org.joda.beans.ser.SerIterator;
import org.joda.beans.ser.SerOptional;
import org.joda.beans.ser.SerTypeMapper;
import org.joda.beans.ser.bin.BeanReferences.ClassInfo;
import org.joda.beans.ser.bin.BeanReferences.Ref;

/**
 * Provides the ability for a Joda-Bean to written to the referencing binary format.
 */
class JodaBeanReferencingBinWriter extends AbstractBinWriter {

    private BeanReferences references;

    // creates an instance
    JodaBeanReferencingBinWriter(JodaBeanSer settings, OutputStream output) {
        super(settings, output);
    }

    //-----------------------------------------------------------------------
    // writes the bean
    void write(ImmutableBean bean) throws IOException {
        // sets up the map of beans - classes & classSerializationCount
        references = BeanReferences.find(bean, settings);

        // write array of 4 items - Version, Ref Count, Class Info, Root Bean
        output.writeArrayHeader(4);
        output.writeInt(2);
        writeClassDescriptions(references);
        writeRootBean(bean, true);
    }

    // determines what beans occur more than once and setup references
    private void writeClassDescriptions(BeanReferences references) throws IOException {
        // write out ref count first, which is the number of instances that are referenced
        output.writeInt(references.getReferences().size());

        // write map of class name to a list of metatype names (which is empty if not a bean)
        List<ClassInfo> classInfos = references.getClassInfoList();
        output.writeMapHeader(classInfos.size());
        for (ClassInfo classInfo : classInfos) {
            // known types parameter is null as we never serialize the class names again
            String className = SerTypeMapper.encodeType(classInfo.type, settings, null, null);
            output.writeString(className);

            output.writeArrayHeader(classInfo.metaProperties.length);
            for (MetaProperty<?> property : classInfo.metaProperties) {
                output.writeString(property.name());
            }
        }
    }

    //-----------------------------------------------------------------------
    @Override
    void writeBean(Bean bean, Class<?> declaredType, RootType rootTypeFlag) throws IOException {
        Ref ref = references.getReferences().get(bean);
        if (ref != null) {
            if (ref.hasBeenSerialized) {
                output.writePositiveExtensionInt(MsgPack.JODA_TYPE_REF, ref.position);
                return;
            }
            output.writeMapHeader(1);
            output.writePositiveExtensionInt(MsgPack.JODA_TYPE_REF_KEY, ref.position);
        }

        ClassInfo classInfo = references.getClassInfo(bean.getClass());
        MetaProperty<?>[] props = classInfo.metaProperties;
        int count = props.length;
        Object[] values = new Object[count];
        int size = 0;
        for (MetaProperty<?> prop : props) {
            Object value = SerOptional.extractValue(prop, bean);
            values[size++] = value;
        }

        if (rootTypeFlag == RootType.ROOT_WITH_TYPE || (rootTypeFlag == RootType.NOT_ROOT && bean.getClass() != declaredType)) {
            output.writeArrayHeader(size + 1);
            output.writePositiveExtensionInt(MsgPack.JODA_TYPE_BEAN, classInfo.position);
        } else {
            output.writeArrayHeader(size);
        }

        for (int i = 0; i < size; i++) {
            MetaProperty<?> prop = props[i];
            Object value = values[i];

            Class<?> propType = SerOptional.extractType(prop, bean.getClass());

            if (value == null) {
                output.writeNil();
                continue;
            }

            if (value instanceof Bean) {
                if (settings.getConverter().isConvertible(value.getClass())) {
                    writeSimple(propType, value);
                } else {
                    writeBean((Bean) value, propType, RootType.NOT_ROOT);
                }
            } else {
                SerIterator itemIterator = settings.getIteratorFactory().create(value, prop, bean.getClass());
                if (itemIterator != null) {
                    writeElements(itemIterator);
                } else {
                    writeSimple(propType, value);
                }
            }
        }
        if (ref != null) {
            ref.sent();
        }
    }

    @Override
    void writeMetaPropertyReference(String metaTypeName) throws IOException {
        Ref ref = references.getReferences().get(metaTypeName);
        if (ref != null) {
            if (ref.hasBeenSerialized) {
                output.writePositiveExtensionInt(MsgPack.JODA_TYPE_META, ref.position);
            } else {
                output.writeMapHeader(1);
                output.writePositiveExtensionInt(MsgPack.JODA_TYPE_REF_KEY, ref.position);
                output.writeExtensionString(MsgPack.JODA_TYPE_META, metaTypeName);
                ref.sent();
            }
        } else {
            output.writeExtensionString(MsgPack.JODA_TYPE_META, metaTypeName);
        }
    }

    @Override
    Class<?> getAndSerializeEffectiveTypeIfRequired(Object value, Class<?> declaredType) throws IOException {
        Ref ref = references.getReferences().get(value);
        if (ref != null && ref.hasBeenSerialized) {
            // Don't need to change types if using a reference
            return declaredType;
        }
        Class<?> realType = value.getClass();
        Class<?> effectiveType = declaredType;
        if (declaredType == Object.class) {
            if (realType != String.class) {
                effectiveType = settings.getConverter().findTypedConverter(realType).getEffectiveType();
                ClassInfo classInfo = references.getClassInfo(effectiveType);
                output.writeMapHeader(1);
                output.writePositiveExtensionInt(MsgPack.JODA_TYPE_DATA, classInfo.position);
            } else {
                effectiveType = realType;
            }
        } else if (!settings.getConverter().isConvertible(declaredType)) {
            effectiveType = settings.getConverter().findTypedConverter(realType).getEffectiveType();
            ClassInfo classInfo = references.getClassInfo(effectiveType);
            output.writeMapHeader(1);
            output.writePositiveExtensionInt(MsgPack.JODA_TYPE_DATA, classInfo.position);
        }
        return effectiveType;
    }

    @Override
    void writeObjectAsString(Object value, Class<?> effectiveType) throws IOException {
        Ref ref = references.getReferences().get(value);
        if (ref != null && ref.hasBeenSerialized) {
            output.writePositiveExtensionInt(MsgPack.JODA_TYPE_REF, ref.position);
        } else {
            String converted = settings.getConverter().convertToString(effectiveType, value);
            if (converted == null) {
                throw new IllegalArgumentException("Unable to write because converter returned a null string: " + value);
            }
            if (ref != null) {
                output.writeMapHeader(1);
                output.writePositiveExtensionInt(MsgPack.JODA_TYPE_REF_KEY, ref.position);
                output.writeString(converted);
                ref.sent();
            } else {
                output.writeString(converted);
            }
        }
    }

}
