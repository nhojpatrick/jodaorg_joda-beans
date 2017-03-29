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

import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock sub person, a generic sub-class of a non-generic superclass.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(metaScope = "public")
public class SubPerson<T> extends DirectBean {

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code SubPerson}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static SubPerson.Meta meta() {
        return SubPerson.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code SubPerson}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R> SubPerson.Meta<R> metaSubPerson(Class<R> cls) {
        return SubPerson.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(SubPerson.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public SubPerson.Meta<T> metaBean() {
        return SubPerson.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    @Override
    public SubPerson<T> clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(32);
        buf.append("SubPerson{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code SubPerson}.
     * @param <T>  the type
     */
    public static class Meta<T> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null);

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        public BeanBuilder<? extends SubPerson<T>> builder() {
            return new DirectBeanBuilder<>(new SubPerson<T>());
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends SubPerson<T>> beanType() {
            return (Class) SubPerson.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
