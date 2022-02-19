package ca.uhn.fhir.batch2.model;

/*-
 * #%L
 * HAPI FHIR JPA Server - Batch2 Task Processor
 * %%
 * Copyright (C) 2014 - 2022 Smile CDR, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.commons.lang3.Validate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WorkChunkData {

	private Map<String, Object> myData;

	/**
	 * Constructor
	 */
	public WorkChunkData() {
		this(new HashMap<>());
	}

	/**
	 * Constructor
	 */
	public WorkChunkData(Map<String, Object> theData) {
		myData = theData;
	}

	public Map<String, Object> asMap() {
		return myData;
	}

	public void put(String theKey, String theValue) {
		Validate.notNull(theKey);
		myData.put(theKey, theValue);
	}

	public static WorkChunkData withData(String theKey, Object theValue) {
		return new WorkChunkData(Collections.singletonMap(theKey, theValue));
	}
}