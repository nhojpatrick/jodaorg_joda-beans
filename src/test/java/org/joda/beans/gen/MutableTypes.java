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

import java.util.ArrayList;
import java.util.List;
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
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class MutableTypes<T extends Comparable<T>> implements Bean {

    // not supported, the other two options below are good enough
//    @PropertyDefinition(validate = "notNull")
//    private final List<?> listWild = new ArrayList<Object>();
    @PropertyDefinition
    private List<?> listWildNullable;
    @PropertyDefinition(validate = "notNull", type = "List<?>")
    private final List<Object> listWildPublic = new ArrayList<>();

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code MutableTypes}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static MutableTypes.Meta meta() {
        return MutableTypes.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code MutableTypes}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Comparable<R>> MutableTypes.Meta<R> metaMutableTypes(Class<R> cls) {
        return MutableTypes.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(MutableTypes.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public MutableTypes.Meta<T> metaBean() {
        return MutableTypes.Meta.INSTANCE;
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
     * Gets the listWildNullable.
     * @return the value of the property
     */
    public List<?> getListWildNullable() {
        return listWildNullable;
    }

    /**
     * Sets the listWildNullable.
     * @param listWildNullable  the new value of the property
     */
    public void setListWildNullable(List<?> listWildNullable) {
        this.listWildNullable = listWildNullable;
    }

    /**
     * Gets the the {@code listWildNullable} property.
     * @return the property, not null
     */
    public Property<List<?>> listWildNullable() {
        return metaBean().listWildNullable().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the listWildPublic.
     * @return the value of the property, not null
     */
    public List<?> getListWildPublic() {
        return listWildPublic;
    }

    /**
     * Sets the listWildPublic.
     * @param listWildPublic  the new value of the property, not null
     */
    public void setListWildPublic(List<?> listWildPublic) {
        JodaBeanUtils.notNull(listWildPublic, "listWildPublic");
        this.listWildPublic.clear();
        this.listWildPublic.addAll(listWildPublic);
    }

    /**
     * Gets the the {@code listWildPublic} property.
     * @return the property, not null
     */
    public Property<List<?>> listWildPublic() {
        return metaBean().listWildPublic().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public MutableTypes<T> clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            MutableTypes<?> other = (MutableTypes<?>) obj;
            return JodaBeanUtils.equal(getListWildNullable(), other.getListWildNullable()) &&
                    JodaBeanUtils.equal(getListWildPublic(), other.getListWildPublic());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getListWildNullable());
        hash = hash * 31 + JodaBeanUtils.hashCode(getListWildPublic());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("MutableTypes{");
        buf.append("listWildNullable").append('=').append(getListWildNullable()).append(',').append(' ');
        buf.append("listWildPublic").append('=').append(JodaBeanUtils.toString(getListWildPublic()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code MutableTypes}.
     * @param <T>  the type
     */
    public static final class Meta<T extends Comparable<T>> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code listWildNullable} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<?>> listWildNullable = DirectMetaProperty.ofReadWrite(
                this, "listWildNullable", MutableTypes.class, (Class) List.class);
        /**
         * The meta-property for the {@code listWildPublic} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<?>> listWildPublic = DirectMetaProperty.ofReadWrite(
                this, "listWildPublic", MutableTypes.class, (Class) List.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "listWildNullable",
                "listWildPublic");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -911478519:  // listWildNullable
                    return listWildNullable;
                case -355160559:  // listWildPublic
                    return listWildPublic;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends MutableTypes<T>> builder() {
            return new DirectBeanBuilder<>(new MutableTypes<T>());
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends MutableTypes<T>> beanType() {
            return (Class) MutableTypes.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code listWildNullable} property.
         * @return the meta-property, not null
         */
        public MetaProperty<List<?>> listWildNullable() {
            return listWildNullable;
        }

        /**
         * The meta-property for the {@code listWildPublic} property.
         * @return the meta-property, not null
         */
        public MetaProperty<List<?>> listWildPublic() {
            return listWildPublic;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -911478519:  // listWildNullable
                    return ((MutableTypes<?>) bean).getListWildNullable();
                case -355160559:  // listWildPublic
                    return ((MutableTypes<?>) bean).getListWildPublic();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -911478519:  // listWildNullable
                    ((MutableTypes<T>) bean).setListWildNullable((List<?>) newValue);
                    return;
                case -355160559:  // listWildPublic
                    ((MutableTypes<T>) bean).setListWildPublic((List<?>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notNull(((MutableTypes<?>) bean).listWildPublic, "listWildPublic");
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
