/*
 * Copyright (C) 2015 Hamburg Sud and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.hpalm.infrastructure;

public class HpAlmException extends Exception {

	private static final long serialVersionUID = 4846509671368177356L;

	private String id;

	public HpAlmException(String message) {
		super(message);
	}

	public HpAlmException(String message, String id) {
		super(message);
		this.id = id;
	}

	public HpAlmException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getHpAlmId() {
		return id;
	}

}
