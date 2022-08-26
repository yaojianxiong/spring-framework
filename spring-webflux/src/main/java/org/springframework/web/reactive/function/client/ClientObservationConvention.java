/*
 * Copyright 2002-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.reactive.function.client;

import io.micrometer.observation.Observation;

/**
 * Interface for an {@link Observation.ObservationConvention} related to client HTTP exchanges.
 * @author Brian Clozel
 * @since 6.0
 */
public interface ClientObservationConvention extends Observation.ObservationConvention<ClientObservationContext> {

	@Override
	default boolean supportsContext(Observation.Context context) {
		return context instanceof ClientObservationContext;
	}

}