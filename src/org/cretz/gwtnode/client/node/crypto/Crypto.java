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
package org.cretz.gwtnode.client.node.crypto;

import org.cretz.gwtnode.client.node.Global;
import org.cretz.gwtnode.client.node.NodeJsModule;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The node.js
 * <a href="http://nodejs.org/docs/v0.2.6/api.html#crypto-238">Crypto</a>
 * module.
 * 
 * @author Chad Retz
 */
public class Crypto extends JavaScriptObject implements NodeJsModule {

    private static Crypto instance;
    
    public static Crypto get() {
        if (instance == null) {
            instance = Global.get().require("crypto");
        }
        return instance;
    }
    
    protected Crypto() {
    }
    
    public final native Credentials createCredentials(CredentialsDetails details) /*-{
        return this.createCredentials(details);
    }-*/;
    
    public final native Hash createHash(String algorithm) /*-{
        return this.createHash(algorithm);
    }-*/;

    public final native Hmac createHmac(String algorithm, String key) /*-{
        return this.createHmac(algorithm, key);
    }-*/;

    public final native Cipher createCipher(String algorithm, String key) /*-{
        return this.createCipher(algorithm, key);
    }-*/;

    public final native Decipher createDecipher(String algorithm, String key) /*-{
        return this.createDecipher(algorithm, key);
    }-*/;

    public final native Signer createSign(String algorithm) /*-{
        return this.createSign(algorithm);
    }-*/;

    public final native Verifier createVerify(String algorithm) /*-{
        return this.createVerify(algorithm);
    }-*/;
    
}