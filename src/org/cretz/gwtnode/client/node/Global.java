/*
 * Copyright 2011 Chad Retz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.cretz.gwtnode.client.node;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The node.js
 * <a href="http://nodejs.org/docs/v0.2.6/api.html#global-objects-44">Global</a>
 * namespace
 * 
 * @author Chad Retz
 */
public class Global extends JavaScriptObject {
    
    public static final native Global get() /*-{
        return global;
    }-*/;

    protected Global() {
    }
    
    public final native Process process() /*-{
        return process;
    }-*/;
    
    public final native <T extends NodeJsModule> T require(String name) /*-{
        return require(name);
    }-*/;
    
    public final native JsArrayString requirePaths() /*-{
        return require.paths;
    }-*/;
    
    public final native String filename() /*-{
        return __filename;
    }-*/;
    
    public final native String dirname() /*-{
        return __dirname;
    }-*/;
    
    //TODO: module
}