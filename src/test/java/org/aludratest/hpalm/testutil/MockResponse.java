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
package org.aludratest.hpalm.testutil;

import java.util.LinkedHashMap;
import java.util.Map;

public class MockResponse {

	private Map<String, String> headers = new LinkedHashMap<String, String>();

	private int returnCode;

	private String data;

	public void setHeader(String header, String value) {
		headers.put(header, value);
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getReturnCode() {
		return returnCode;
	}

	public String getData() {
		return data;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

}
