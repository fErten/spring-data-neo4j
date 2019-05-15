/*
 * Copyright (c) 2019 "Neo4j,"
 * Neo4j Sweden AB [https://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.core.schema;

import org.apiguardian.api.API;

/**
 * Provides minimal information how to map class attributes to the properties of a node or a relationship.
 * <p>
 * Spring Data's persistent properties have slightly different semantics. They have an entity centric approach of properties.
 * Spring Data properties contain - if not marked otherwise - also associations.
 * <p>
 * Associations between different node types can be queried on the {@link Schema} itself.
 *
 * @author Michael J. Simons
 * @since 1.0
 */
@API(status = API.Status.INTERNAL, since = "1.0")
public interface GraphPropertyDescription {

	/**
	 * @return The name of the attribute of the mapped class
	 */
	String getFieldName();

	/**
	 * @return The name of the property as stored in the graph.
	 */
	String getPropertyName();

	/**
	 * @return True if this property is the id property.
	 */
	boolean isIdProperty();
}
