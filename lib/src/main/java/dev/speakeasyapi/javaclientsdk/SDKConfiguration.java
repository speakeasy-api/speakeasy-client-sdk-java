/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.util.Map;
import java.util.HashMap;

class SDKConfiguration {
	public SecuritySource securitySource;	
    
	public HTTPClient defaultClient;
	public String serverUrl;
	public String server;
	public String language = "java";
	public String openapiDocVersion = "0.4.0";
	public String sdkVersion = "7.0.3";
	public String genVersion = "2.250.16";
	public String userAgent = "speakeasy-sdk/java 7.0.3 2.250.16 0.4.0 dev.speakeasyapi.javaclientsdk";
	public Map<String, Map<String, Map<String, java.lang.Object>>> globals = new HashMap<>(){{
		put("parameters", new HashMap<>());
	}};
	
}