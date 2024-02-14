/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;


public class FindApiEndpointRequest {
    /**
     * The ID of the Api the ApiEndpoint belongs to.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;

    public FindApiEndpointRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The displayName of the ApiEndpoint to find (set by operationId from OpenAPI schema).
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=displayName")
    public String displayName;

    public FindApiEndpointRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    /**
     * The version ID of the Api the ApiEndpoint belongs to.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;

    public FindApiEndpointRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public FindApiEndpointRequest(@JsonProperty("apiID") String apiID, @JsonProperty("displayName") String displayName, @JsonProperty("versionID") String versionID) {
        this.apiID = apiID;
        this.displayName = displayName;
        this.versionID = versionID;
  }
}
