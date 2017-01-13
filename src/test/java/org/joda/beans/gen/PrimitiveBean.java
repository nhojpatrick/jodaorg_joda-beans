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
package org.joda.beans.gen;

import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class PrimitiveBean extends DirectBean {

    @PropertyDefinition
    private long valueLong;
    @PropertyDefinition
    private int valueInt;
    @PropertyDefinition
    private short valueShort;
    @PropertyDefinition
    private byte valueByte;
    @PropertyDefinition
    private double valueDouble;
    @PropertyDefinition
    private float valueFloat;
    @PropertyDefinition
    private char valueChar;
    @PropertyDefinition
    private boolean valueBoolean;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code PrimitiveBean}.
     * @return the meta-bean, not null
     */
    public static PrimitiveBean.Meta meta() {
        return PrimitiveBean.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(PrimitiveBean.Meta.INSTANCE);
    }

    @Override
    public PrimitiveBean.Meta metaBean() {
        return PrimitiveBean.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueLong.
     * @return the value of the property
     */
    public long getValueLong() {
        return valueLong;
    }

    /**
     * Sets the valueLong.
     * @param valueLong  the new value of the property
     */
    public void setValueLong(long valueLong) {
        this.valueLong = valueLong;
    }

    /**
     * Gets the the {@code valueLong} property.
     * @return the property, not null
     */
    public final Property<Long> valueLong() {
        return metaBean().valueLong().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueInt.
     * @return the value of the property
     */
    public int getValueInt() {
        return valueInt;
    }

    /**
     * Sets the valueInt.
     * @param valueInt  the new value of the property
     */
    public void setValueInt(int valueInt) {
        this.valueInt = valueInt;
    }

    /**
     * Gets the the {@code valueInt} property.
     * @return the property, not null
     */
    public final Property<Integer> valueInt() {
        return metaBean().valueInt().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueShort.
     * @return the value of the property
     */
    public short getValueShort() {
        return valueShort;
    }

    /**
     * Sets the valueShort.
     * @param valueShort  the new value of the property
     */
    public void setValueShort(short valueShort) {
        this.valueShort = valueShort;
    }

    /**
     * Gets the the {@code valueShort} property.
     * @return the property, not null
     */
    public final Property<Short> valueShort() {
        return metaBean().valueShort().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueByte.
     * @return the value of the property
     */
    public byte getValueByte() {
        return valueByte;
    }

    /**
     * Sets the valueByte.
     * @param valueByte  the new value of the property
     */
    public void setValueByte(byte valueByte) {
        this.valueByte = valueByte;
    }

    /**
     * Gets the the {@code valueByte} property.
     * @return the property, not null
     */
    public final Property<Byte> valueByte() {
        return metaBean().valueByte().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueDouble.
     * @return the value of the property
     */
    public double getValueDouble() {
        return valueDouble;
    }

    /**
     * Sets the valueDouble.
     * @param valueDouble  the new value of the property
     */
    public void setValueDouble(double valueDouble) {
        this.valueDouble = valueDouble;
    }

    /**
     * Gets the the {@code valueDouble} property.
     * @return the property, not null
     */
    public final Property<Double> valueDouble() {
        return metaBean().valueDouble().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueFloat.
     * @return the value of the property
     */
    public float getValueFloat() {
        return valueFloat;
    }

    /**
     * Sets the valueFloat.
     * @param valueFloat  the new value of the property
     */
    public void setValueFloat(float valueFloat) {
        this.valueFloat = valueFloat;
    }

    /**
     * Gets the the {@code valueFloat} property.
     * @return the property, not null
     */
    public final Property<Float> valueFloat() {
        return metaBean().valueFloat().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueChar.
     * @return the value of the property
     */
    public char getValueChar() {
        return valueChar;
    }

    /**
     * Sets the valueChar.
     * @param valueChar  the new value of the property
     */
    public void setValueChar(char valueChar) {
        this.valueChar = valueChar;
    }

    /**
     * Gets the the {@code valueChar} property.
     * @return the property, not null
     */
    public final Property<Character> valueChar() {
        return metaBean().valueChar().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the valueBoolean.
     * @return the value of the property
     */
    public boolean isValueBoolean() {
        return valueBoolean;
    }

    /**
     * Sets the valueBoolean.
     * @param valueBoolean  the new value of the property
     */
    public void setValueBoolean(boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
    }

    /**
     * Gets the the {@code valueBoolean} property.
     * @return the property, not null
     */
    public final Property<Boolean> valueBoolean() {
        return metaBean().valueBoolean().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public PrimitiveBean clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            PrimitiveBean other = (PrimitiveBean) obj;
            return (getValueLong() == other.getValueLong()) &&
                    (getValueInt() == other.getValueInt()) &&
                    (getValueShort() == other.getValueShort()) &&
                    (getValueByte() == other.getValueByte()) &&
                    JodaBeanUtils.equal(getValueDouble(), other.getValueDouble()) &&
                    JodaBeanUtils.equal(getValueFloat(), other.getValueFloat()) &&
                    (getValueChar() == other.getValueChar()) &&
                    (isValueBoolean() == other.isValueBoolean());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getValueLong());
        hash = hash * 31 + JodaBeanUtils.hashCode(getValueInt());
        hash = hash * 31 + JodaBeanUtils.hashCode(getValueShort());
        hash = hash * 31 + JodaBeanUtils.hashCode(getValueByte());
        hash = hash * 31 + JodaBeanUtils.hashCode(getValueDouble());
        hash = hash * 31 + JodaBeanUtils.hashCode(getValueFloat());
        hash = hash * 31 + JodaBeanUtils.hashCode(getValueChar());
        hash = hash * 31 + JodaBeanUtils.hashCode(isValueBoolean());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(288);
        buf.append("PrimitiveBean{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("valueLong").append('=').append(JodaBeanUtils.toString(getValueLong())).append(',').append(' ');
        buf.append("valueInt").append('=').append(JodaBeanUtils.toString(getValueInt())).append(',').append(' ');
        buf.append("valueShort").append('=').append(JodaBeanUtils.toString(getValueShort())).append(',').append(' ');
        buf.append("valueByte").append('=').append(JodaBeanUtils.toString(getValueByte())).append(',').append(' ');
        buf.append("valueDouble").append('=').append(JodaBeanUtils.toString(getValueDouble())).append(',').append(' ');
        buf.append("valueFloat").append('=').append(JodaBeanUtils.toString(getValueFloat())).append(',').append(' ');
        buf.append("valueChar").append('=').append(JodaBeanUtils.toString(getValueChar())).append(',').append(' ');
        buf.append("valueBoolean").append('=').append(JodaBeanUtils.toString(isValueBoolean())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code PrimitiveBean}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code valueLong} property.
         */
        private final MetaProperty<Long> valueLong = DirectMetaProperty.ofReadWrite(
                this, "valueLong", PrimitiveBean.class, Long.TYPE);
        /**
         * The meta-property for the {@code valueInt} property.
         */
        private final MetaProperty<Integer> valueInt = DirectMetaProperty.ofReadWrite(
                this, "valueInt", PrimitiveBean.class, Integer.TYPE);
        /**
         * The meta-property for the {@code valueShort} property.
         */
        private final MetaProperty<Short> valueShort = DirectMetaProperty.ofReadWrite(
                this, "valueShort", PrimitiveBean.class, Short.TYPE);
        /**
         * The meta-property for the {@code valueByte} property.
         */
        private final MetaProperty<Byte> valueByte = DirectMetaProperty.ofReadWrite(
                this, "valueByte", PrimitiveBean.class, Byte.TYPE);
        /**
         * The meta-property for the {@code valueDouble} property.
         */
        private final MetaProperty<Double> valueDouble = DirectMetaProperty.ofReadWrite(
                this, "valueDouble", PrimitiveBean.class, Double.TYPE);
        /**
         * The meta-property for the {@code valueFloat} property.
         */
        private final MetaProperty<Float> valueFloat = DirectMetaProperty.ofReadWrite(
                this, "valueFloat", PrimitiveBean.class, Float.TYPE);
        /**
         * The meta-property for the {@code valueChar} property.
         */
        private final MetaProperty<Character> valueChar = DirectMetaProperty.ofReadWrite(
                this, "valueChar", PrimitiveBean.class, Character.TYPE);
        /**
         * The meta-property for the {@code valueBoolean} property.
         */
        private final MetaProperty<Boolean> valueBoolean = DirectMetaProperty.ofReadWrite(
                this, "valueBoolean", PrimitiveBean.class, Boolean.TYPE);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "valueLong",
                "valueInt",
                "valueShort",
                "valueByte",
                "valueDouble",
                "valueFloat",
                "valueChar",
                "valueBoolean");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -765940851:  // valueLong
                    return valueLong;
                case -1410184002:  // valueInt
                    return valueInt;
                case 2031894923:  // valueShort
                    return valueShort;
                case -766228967:  // valueByte
                    return valueByte;
                case -1858576222:  // valueDouble
                    return valueDouble;
                case 2020007787:  // valueFloat
                    return valueFloat;
                case -766216089:  // valueChar
                    return valueChar;
                case 733421943:  // valueBoolean
                    return valueBoolean;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends PrimitiveBean> builder() {
            return new DirectBeanBuilder<PrimitiveBean>(new PrimitiveBean());
        }

        @Override
        public Class<? extends PrimitiveBean> beanType() {
            return PrimitiveBean.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code valueLong} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Long> valueLong() {
            return valueLong;
        }

        /**
         * The meta-property for the {@code valueInt} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> valueInt() {
            return valueInt;
        }

        /**
         * The meta-property for the {@code valueShort} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Short> valueShort() {
            return valueShort;
        }

        /**
         * The meta-property for the {@code valueByte} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Byte> valueByte() {
            return valueByte;
        }

        /**
         * The meta-property for the {@code valueDouble} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> valueDouble() {
            return valueDouble;
        }

        /**
         * The meta-property for the {@code valueFloat} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Float> valueFloat() {
            return valueFloat;
        }

        /**
         * The meta-property for the {@code valueChar} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Character> valueChar() {
            return valueChar;
        }

        /**
         * The meta-property for the {@code valueBoolean} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> valueBoolean() {
            return valueBoolean;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -765940851:  // valueLong
                    return ((PrimitiveBean) bean).getValueLong();
                case -1410184002:  // valueInt
                    return ((PrimitiveBean) bean).getValueInt();
                case 2031894923:  // valueShort
                    return ((PrimitiveBean) bean).getValueShort();
                case -766228967:  // valueByte
                    return ((PrimitiveBean) bean).getValueByte();
                case -1858576222:  // valueDouble
                    return ((PrimitiveBean) bean).getValueDouble();
                case 2020007787:  // valueFloat
                    return ((PrimitiveBean) bean).getValueFloat();
                case -766216089:  // valueChar
                    return ((PrimitiveBean) bean).getValueChar();
                case 733421943:  // valueBoolean
                    return ((PrimitiveBean) bean).isValueBoolean();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -765940851:  // valueLong
                    ((PrimitiveBean) bean).setValueLong((Long) newValue);
                    return;
                case -1410184002:  // valueInt
                    ((PrimitiveBean) bean).setValueInt((Integer) newValue);
                    return;
                case 2031894923:  // valueShort
                    ((PrimitiveBean) bean).setValueShort((Short) newValue);
                    return;
                case -766228967:  // valueByte
                    ((PrimitiveBean) bean).setValueByte((Byte) newValue);
                    return;
                case -1858576222:  // valueDouble
                    ((PrimitiveBean) bean).setValueDouble((Double) newValue);
                    return;
                case 2020007787:  // valueFloat
                    ((PrimitiveBean) bean).setValueFloat((Float) newValue);
                    return;
                case -766216089:  // valueChar
                    ((PrimitiveBean) bean).setValueChar((Character) newValue);
                    return;
                case 733421943:  // valueBoolean
                    ((PrimitiveBean) bean).setValueBoolean((Boolean) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
