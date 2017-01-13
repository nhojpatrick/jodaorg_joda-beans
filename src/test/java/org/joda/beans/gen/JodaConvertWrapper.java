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
 * Wraps {@code JodaConvertBean}, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class JodaConvertWrapper extends DirectBean {

    /**
     * The base value.
     */
    @PropertyDefinition
    private JodaConvertBean bean;
    /**
     * The extra value.
     */
    @PropertyDefinition
    private String description;

    public JodaConvertWrapper() {
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code JodaConvertWrapper}.
     * @return the meta-bean, not null
     */
    public static JodaConvertWrapper.Meta meta() {
        return JodaConvertWrapper.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(JodaConvertWrapper.Meta.INSTANCE);
    }

    @Override
    public JodaConvertWrapper.Meta metaBean() {
        return JodaConvertWrapper.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the base value.
     * @return the value of the property
     */
    public JodaConvertBean getBean() {
        return bean;
    }

    /**
     * Sets the base value.
     * @param bean  the new value of the property
     */
    public void setBean(JodaConvertBean bean) {
        this.bean = bean;
    }

    /**
     * Gets the the {@code bean} property.
     * @return the property, not null
     */
    public final Property<JodaConvertBean> bean() {
        return metaBean().bean().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the extra value.
     * @return the value of the property
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the extra value.
     * @param description  the new value of the property
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the the {@code description} property.
     * @return the property, not null
     */
    public final Property<String> description() {
        return metaBean().description().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public JodaConvertWrapper clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            JodaConvertWrapper other = (JodaConvertWrapper) obj;
            return JodaBeanUtils.equal(getBean(), other.getBean()) &&
                    JodaBeanUtils.equal(getDescription(), other.getDescription());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getBean());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDescription());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("JodaConvertWrapper{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("bean").append('=').append(JodaBeanUtils.toString(getBean())).append(',').append(' ');
        buf.append("description").append('=').append(JodaBeanUtils.toString(getDescription())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code JodaConvertWrapper}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code bean} property.
         */
        private final MetaProperty<JodaConvertBean> bean = DirectMetaProperty.ofReadWrite(
                this, "bean", JodaConvertWrapper.class, JodaConvertBean.class);
        /**
         * The meta-property for the {@code description} property.
         */
        private final MetaProperty<String> description = DirectMetaProperty.ofReadWrite(
                this, "description", JodaConvertWrapper.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "bean",
                "description");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3019696:  // bean
                    return bean;
                case -1724546052:  // description
                    return description;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends JodaConvertWrapper> builder() {
            return new DirectBeanBuilder<JodaConvertWrapper>(new JodaConvertWrapper());
        }

        @Override
        public Class<? extends JodaConvertWrapper> beanType() {
            return JodaConvertWrapper.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code bean} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<JodaConvertBean> bean() {
            return bean;
        }

        /**
         * The meta-property for the {@code description} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> description() {
            return description;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3019696:  // bean
                    return ((JodaConvertWrapper) bean).getBean();
                case -1724546052:  // description
                    return ((JodaConvertWrapper) bean).getDescription();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3019696:  // bean
                    ((JodaConvertWrapper) bean).setBean((JodaConvertBean) newValue);
                    return;
                case -1724546052:  // description
                    ((JodaConvertWrapper) bean).setDescription((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
