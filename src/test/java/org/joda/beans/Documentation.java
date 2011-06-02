/*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.beans;

import java.util.Map;

import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class Documentation<T> extends DirectBean {

    /** The type. */
    @PropertyDefinition
    private String type;
    /** The surname. */
    @PropertyDefinition
    private T content;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code Documentation}.
     * @param <R>  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R> Documentation.Meta<R> meta() {
        return Documentation.Meta.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Documentation.Meta<T> metaBean() {
        return Documentation.Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case 3575610:  // type
                return getType();
            case 951530617:  // content
                return getContent();
        }
        return super.propertyGet(propertyName);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case 3575610:  // type
                setType((String) newValue);
                return;
            case 951530617:  // content
                setContent((T) newValue);
                return;
        }
        super.propertySet(propertyName, newValue);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Documentation<?> other = (Documentation<?>) obj;
            return JodaBeanUtils.equal(getType(), other.getType()) &&
                    JodaBeanUtils.equal(getContent(), other.getContent());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash += hash * 31 + JodaBeanUtils.hashCode(getType());
        hash += hash * 31 + JodaBeanUtils.hashCode(getContent());
        return hash;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the type.
     * @return the value of the property
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * @param type  the new value of the property
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the the {@code type} property.
     * @return the property, not null
     */
    public final Property<String> type() {
        return metaBean().type().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the surname.
     * @return the value of the property
     */
    public T getContent() {
        return content;
    }

    /**
     * Sets the surname.
     * @param content  the new value of the property
     */
    public void setContent(T content) {
        this.content = content;
    }

    /**
     * Gets the the {@code content} property.
     * @return the property, not null
     */
    public final Property<T> content() {
        return metaBean().content().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Documentation}.
     */
    public static class Meta<T> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code type} property.
         */
        private final MetaProperty<String> type = DirectMetaProperty.ofReadWrite(
                this, "type", Documentation.class, String.class);
        /**
         * The meta-property for the {@code content} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<T> content = (DirectMetaProperty) DirectMetaProperty.ofReadWrite(
                this, "content", Documentation.class, Object.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<Object>> map = new DirectMetaPropertyMap(
                this, null,
                "type",
                "content");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3575610:  // type
                    return type;
                case 951530617:  // content
                    return content;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public Documentation<T> createBean() {
            return new Documentation<T>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends Documentation<T>> beanType() {
            return (Class) Documentation.class;
        }

        @Override
        public Map<String, MetaProperty<Object>> metaPropertyMap() {
            return map;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code type} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> type() {
            return type;
        }

        /**
         * The meta-property for the {@code content} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<T> content() {
            return content;
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
