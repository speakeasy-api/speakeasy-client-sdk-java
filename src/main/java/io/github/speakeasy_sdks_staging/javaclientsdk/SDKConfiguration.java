/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.util.Map;
import java.util.HashMap;

class SDKConfiguration {
	public SecuritySource securitySource;	
    
	public HTTPClient defaultClient;
	public String serverUrl;
	public String server;
	public String language = "java";
	public String openapiDocVersion = "0.4.0";
	public String sdkVersion = "7.6.3";
	public String genVersion = "2.259.1";
	public String userAgent = "speakeasy-sdk/java 7.6.3 2.259.1 0.4.0 io.github.speakeasy_sdks_staging.javaclientsdk";
	public Map<String, Map<String, Map<String, java.lang.Object>>> globals = new HashMap<>(){{
		put("parameters", new HashMap<>());
	}};
	
}