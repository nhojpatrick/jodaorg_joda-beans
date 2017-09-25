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
import java.util.NoSuchElementException;

import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.MinimalMetaBean;

/**
 * Mock minimal bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "minimal", constructorScope = "package")
public final class MinimalImmutableSimple implements ImmutableBean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private final int number;
    /**
     * The text.
     */
    @PropertyDefinition
    private final String text;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code MinimalImmutableSimple}.
     */
    private static final TypedMetaBean<MinimalImmutableSimple> META_BEAN =
            MinimalMetaBean.of(
                    MinimalImmutableSimple.class,
                    new String[] {
                            "number",
                            "text"},
                    () -> new MinimalImmutableSimple.Builder(),
                    b -> b.getNumber(),
                    b -> b.getText());

    /**
     * The meta-bean for {@code MinimalImmutableSimple}.
     * @return the meta-bean, not null
     */
    public static TypedMetaBean<MinimalImmutableSimple> meta() {
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
     * @return the builder, not null
     */
    public static MinimalImmutableSimple.Builder builder() {
        return new MinimalImmutableSimple.Builder();
    }

    /**
     * Creates an instance.
     * @param number  the value of the property
     * @param text  the value of the property
     */
    MinimalImmutableSimple(
            int number,
            String text) {
        this.number = number;
        this.text = text;
    }

    @Override
    public TypedMetaBean<MinimalImmutableSimple> metaBean() {
        return META_BEAN;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public int getNumber() {
        return number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the text.
     * @return the value of the property
     */
    public String getText() {
        return text;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            MinimalImmutableSimple other = (MinimalImmutableSimple) obj;
            return (number == other.number) &&
                    JodaBeanUtils.equal(text, other.text);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(number);
        hash = hash * 31 + JodaBeanUtils.hashCode(text);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("MinimalImmutableSimple{");
        buf.append("number").append('=').append(number).append(',').append(' ');
        buf.append("text").append('=').append(JodaBeanUtils.toString(text));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code MinimalImmutableSimple}.
     */
    public static final class Builder extends DirectFieldsBeanBuilder<MinimalImmutableSimple> {

        private int number;
        private String text;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(MinimalImmutableSimple beanToCopy) {
            this.number = beanToCopy.getNumber();
            this.text = beanToCopy.getText();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case 3556653:  // text
                    return text;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    this.number = (Integer) newValue;
                    break;
                case 3556653:  // text
                    this.text = (String) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public MinimalImmutableSimple build() {
            return new MinimalImmutableSimple(
                    number,
                    text);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the number.
         * @param number  the new value
         * @return this, for chaining, not null
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Sets the text.
         * @param text  the new value
         * @return this, for chaining, not null
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(96);
            buf.append("MinimalImmutableSimple.Builder{");
            buf.append("number").append('=').append(JodaBeanUtils.toString(number)).append(',').append(' ');
            buf.append("text").append('=').append(JodaBeanUtils.toString(text));
            buf.append('}');
            return buf.toString();
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
