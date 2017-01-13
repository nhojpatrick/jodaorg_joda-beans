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
package org.joda.beans;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation defining which constructor is to be used to create the object
 * in for code generation of immutable beans.
 * <p>
 * The constructor must have the same arguments and types as the properties
 * as exposed by the builder. They must also be in the same order.
 * The constructor is responsible for maintaining the invariants of the class,
 * such as validation.
 * <p>
 * For example, a property type of 'ImmutableList&lt;Foo&gt;' will have a builder
 * type of 'List&lt;Foo&gt;', thus the constructor must also use 'List'.
 * <p>
 * If no constructor specifies this annotation then a constructor will be generated.
 * In many cases it is easiest to generate the constructor, then move it outside
 * the autogenerated block and annotate it.
 * 
 * @author Stephen Colebourne
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.CONSTRUCTOR)
public @interface ImmutableConstructor {

}
