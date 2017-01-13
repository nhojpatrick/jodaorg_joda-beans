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
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class WeirdFormat
        implements Bean {

    @PropertyDefinition
    private String forename1="";
    @PropertyDefinition
    private String forename2 ="";
    @PropertyDefinition
    private String forename3= "";
    @PropertyDefinition
    private String forename4 = "";
    @PropertyDefinition
    private String forename5="=";

    /**
     * Creates an instance.
     */
    public WeirdFormat() {
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code WeirdFormat}.
     * @return the meta-bean, not null
     */
    public static WeirdFormat.Meta meta() {
        return WeirdFormat.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(WeirdFormat.Meta.INSTANCE);
    }

    @Override
    public WeirdFormat.Meta metaBean() {
        return WeirdFormat.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename1.
     * @return the value of the property
     */
    public String getForename1() {
        return forename1;
    }

    /**
     * Sets the forename1.
     * @param forename1  the new value of the property
     */
    public void setForename1(String forename1) {
        this.forename1 = forename1;
    }

    /**
     * Gets the the {@code forename1} property.
     * @return the property, not null
     */
    public final Property<String> forename1() {
        return metaBean().forename1().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename2.
     * @return the value of the property
     */
    public String getForename2() {
        return forename2;
    }

    /**
     * Sets the forename2.
     * @param forename2  the new value of the property
     */
    public void setForename2(String forename2) {
        this.forename2 = forename2;
    }

    /**
     * Gets the the {@code forename2} property.
     * @return the property, not null
     */
    public final Property<String> forename2() {
        return metaBean().forename2().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename3.
     * @return the value of the property
     */
    public String getForename3() {
        return forename3;
    }

    /**
     * Sets the forename3.
     * @param forename3  the new value of the property
     */
    public void setForename3(String forename3) {
        this.forename3 = forename3;
    }

    /**
     * Gets the the {@code forename3} property.
     * @return the property, not null
     */
    public final Property<String> forename3() {
        return metaBean().forename3().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename4.
     * @return the value of the property
     */
    public String getForename4() {
        return forename4;
    }

    /**
     * Sets the forename4.
     * @param forename4  the new value of the property
     */
    public void setForename4(String forename4) {
        this.forename4 = forename4;
    }

    /**
     * Gets the the {@code forename4} property.
     * @return the property, not null
     */
    public final Property<String> forename4() {
        return metaBean().forename4().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename5.
     * @return the value of the property
     */
    public String getForename5() {
        return forename5;
    }

    /**
     * Sets the forename5.
     * @param forename5  the new value of the property
     */
    public void setForename5(String forename5) {
        this.forename5 = forename5;
    }

    /**
     * Gets the the {@code forename5} property.
     * @return the property, not null
     */
    public final Property<String> forename5() {
        return metaBean().forename5().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public WeirdFormat clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            WeirdFormat other = (WeirdFormat) obj;
            return JodaBeanUtils.equal(getForename1(), other.getForename1()) &&
                    JodaBeanUtils.equal(getForename2(), other.getForename2()) &&
                    JodaBeanUtils.equal(getForename3(), other.getForename3()) &&
                    JodaBeanUtils.equal(getForename4(), other.getForename4()) &&
                    JodaBeanUtils.equal(getForename5(), other.getForename5());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getForename1());
        hash = hash * 31 + JodaBeanUtils.hashCode(getForename2());
        hash = hash * 31 + JodaBeanUtils.hashCode(getForename3());
        hash = hash * 31 + JodaBeanUtils.hashCode(getForename4());
        hash = hash * 31 + JodaBeanUtils.hashCode(getForename5());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(192);
        buf.append("WeirdFormat{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("forename1").append('=').append(JodaBeanUtils.toString(getForename1())).append(',').append(' ');
        buf.append("forename2").append('=').append(JodaBeanUtils.toString(getForename2())).append(',').append(' ');
        buf.append("forename3").append('=').append(JodaBeanUtils.toString(getForename3())).append(',').append(' ');
        buf.append("forename4").append('=').append(JodaBeanUtils.toString(getForename4())).append(',').append(' ');
        buf.append("forename5").append('=').append(JodaBeanUtils.toString(getForename5())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code WeirdFormat}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code forename1} property.
         */
        private final MetaProperty<String> forename1 = DirectMetaProperty.ofReadWrite(
                this, "forename1", WeirdFormat.class, String.class);
        /**
         * The meta-property for the {@code forename2} property.
         */
        private final MetaProperty<String> forename2 = DirectMetaProperty.ofReadWrite(
                this, "forename2", WeirdFormat.class, String.class);
        /**
         * The meta-property for the {@code forename3} property.
         */
        private final MetaProperty<String> forename3 = DirectMetaProperty.ofReadWrite(
                this, "forename3", WeirdFormat.class, String.class);
        /**
         * The meta-property for the {@code forename4} property.
         */
        private final MetaProperty<String> forename4 = DirectMetaProperty.ofReadWrite(
                this, "forename4", WeirdFormat.class, String.class);
        /**
         * The meta-property for the {@code forename5} property.
         */
        private final MetaProperty<String> forename5 = DirectMetaProperty.ofReadWrite(
                this, "forename5", WeirdFormat.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "forename1",
                "forename2",
                "forename3",
                "forename4",
                "forename5");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 1593991114:  // forename1
                    return forename1;
                case 1593991115:  // forename2
                    return forename2;
                case 1593991116:  // forename3
                    return forename3;
                case 1593991117:  // forename4
                    return forename4;
                case 1593991118:  // forename5
                    return forename5;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends WeirdFormat> builder() {
            return new DirectBeanBuilder<WeirdFormat>(new WeirdFormat());
        }

        @Override
        public Class<? extends WeirdFormat> beanType() {
            return WeirdFormat.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code forename1} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> forename1() {
            return forename1;
        }

        /**
         * The meta-property for the {@code forename2} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> forename2() {
            return forename2;
        }

        /**
         * The meta-property for the {@code forename3} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> forename3() {
            return forename3;
        }

        /**
         * The meta-property for the {@code forename4} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> forename4() {
            return forename4;
        }

        /**
         * The meta-property for the {@code forename5} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> forename5() {
            return forename5;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 1593991114:  // forename1
                    return ((WeirdFormat) bean).getForename1();
                case 1593991115:  // forename2
                    return ((WeirdFormat) bean).getForename2();
                case 1593991116:  // forename3
                    return ((WeirdFormat) bean).getForename3();
                case 1593991117:  // forename4
                    return ((WeirdFormat) bean).getForename4();
                case 1593991118:  // forename5
                    return ((WeirdFormat) bean).getForename5();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 1593991114:  // forename1
                    ((WeirdFormat) bean).setForename1((String) newValue);
                    return;
                case 1593991115:  // forename2
                    ((WeirdFormat) bean).setForename2((String) newValue);
                    return;
                case 1593991116:  // forename3
                    ((WeirdFormat) bean).setForename3((String) newValue);
                    return;
                case 1593991117:  // forename4
                    ((WeirdFormat) bean).setForename4((String) newValue);
                    return;
                case 1593991118:  // forename5
                    ((WeirdFormat) bean).setForename5((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
