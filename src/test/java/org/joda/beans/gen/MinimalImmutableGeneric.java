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

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.MinimalMetaBean;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/**
 * Mock minimal bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "minimal")
public final class MinimalImmutableGeneric<T extends Number> implements ImmutableBean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private final T number;
    /**
     * The number.
     */
    @PropertyDefinition
    private final List<T> list;
    /**
     * The number.
     */
    @PropertyDefinition
    private final Map<String, T> map;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code MinimalImmutableGeneric}.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private static final MetaBean META_BEAN =
            MinimalMetaBean.of(
                    MinimalImmutableGeneric.class,
                    new String[] {
                            "number",
                            "list",
                            "map"},
                    () -> new MinimalImmutableGeneric.Builder(),
                    b -> b.getNumber(),
                    b -> b.getList(),
                    b -> b.getMap());

    /**
     * The meta-bean for {@code MinimalImmutableGeneric}.
     * @return the meta-bean, not null
     */
    public static MetaBean meta() {
        return META_BEAN;
    }

    static {
        MetaBean.register(META_BEAN);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <T>  the type
     * @return the builder, not null
     */
    public static <T extends Number> MinimalImmutableGeneric.Builder<T> builder() {
        return new MinimalImmutableGeneric.Builder<>();
    }

    private MinimalImmutableGeneric(
            T number,
            List<T> list,
            Map<String, T> map) {
        this.number = number;
        this.list = (list != null ? ImmutableList.copyOf(list) : null);
        this.map = (map != null ? ImmutableMap.copyOf(map) : null);
    }

    @Override
    @SuppressWarnings("unchecked")
    public TypedMetaBean<MinimalImmutableGeneric<T>> metaBean() {
        return (TypedMetaBean<MinimalImmutableGeneric<T>>) META_BEAN;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public T getNumber() {
        return number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public List<T> getList() {
        return list;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public Map<String, T> getMap() {
        return map;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<T> toBuilder() {
        return new Builder<>(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            MinimalImmutableGeneric<?> other = (MinimalImmutableGeneric<?>) obj;
            return JodaBeanUtils.equal(number, other.number) &&
                    JodaBeanUtils.equal(list, other.list) &&
                    JodaBeanUtils.equal(map, other.map);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(number);
        hash = hash * 31 + JodaBeanUtils.hashCode(list);
        hash = hash * 31 + JodaBeanUtils.hashCode(map);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("MinimalImmutableGeneric{");
        buf.append("number").append('=').append(number).append(',').append(' ');
        buf.append("list").append('=').append(list).append(',').append(' ');
        buf.append("map").append('=').append(JodaBeanUtils.toString(map));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code MinimalImmutableGeneric}.
     * @param <T>  the type
     */
    public static final class Builder<T extends Number> extends DirectFieldsBeanBuilder<MinimalImmutableGeneric<T>> {

        private T number;
        private List<T> list;
        private Map<String, T> map;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(MinimalImmutableGeneric<T> beanToCopy) {
            this.number = beanToCopy.getNumber();
            this.list = (beanToCopy.getList() != null ? ImmutableList.copyOf(beanToCopy.getList()) : null);
            this.map = (beanToCopy.getMap() != null ? ImmutableMap.copyOf(beanToCopy.getMap()) : null);
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case 3322014:  // list
                    return list;
                case 107868:  // map
                    return map;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder<T> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    this.number = (T) newValue;
                    break;
                case 3322014:  // list
                    this.list = (List<T>) newValue;
                    break;
                case 107868:  // map
                    this.map = (Map<String, T>) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<T> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public MinimalImmutableGeneric<T> build() {
            return new MinimalImmutableGeneric<>(
                    number,
                    list,
                    map);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the number.
         * @param number  the new value
         * @return this, for chaining, not null
         */
        public Builder<T> number(T number) {
            this.number = number;
            return this;
        }

        /**
         * Sets the number.
         * @param list  the new value
         * @return this, for chaining, not null
         */
        public Builder<T> list(List<T> list) {
            this.list = list;
            return this;
        }

        /**
         * Sets the {@code list} property in the builder
         * from an array of objects.
         * @param list  the new value
         * @return this, for chaining, not null
         */
        @SafeVarargs
        public final Builder<T> list(T... list) {
            return list(ImmutableList.copyOf(list));
        }

        /**
         * Sets the number.
         * @param map  the new value
         * @return this, for chaining, not null
         */
        public Builder<T> map(Map<String, T> map) {
            this.map = map;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(128);
            buf.append("MinimalImmutableGeneric.Builder{");
            buf.append("number").append('=').append(JodaBeanUtils.toString(number)).append(',').append(' ');
            buf.append("list").append('=').append(JodaBeanUtils.toString(list)).append(',').append(' ');
            buf.append("map").append('=').append(JodaBeanUtils.toString(map));
            buf.append('}');
            return buf.toString();
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
