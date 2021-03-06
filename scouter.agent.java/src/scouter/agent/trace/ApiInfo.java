/*
 *  Copyright 2015 the original author or authors.
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
package scouter.agent.trace;

public class ApiInfo {
	public String className;
	public String methodName;
	public String methodDesc;
	public Object _this;
	public Object[] arg;

	public ApiInfo(String className, String methodName, String methodDesc, Object _this, Object[] arg) {
		super();
		this.className = className;
		this.methodName = methodName;
		this.methodDesc = methodDesc;
		this._this = _this;
		this.arg = arg;
	}

}