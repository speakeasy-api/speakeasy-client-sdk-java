/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GenerateRequestPostmanCollectionRequest {
    /**
     * The ID of the request to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    public String requestID;
    public GenerateRequestPostmanCollectionRequest withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    
    public GenerateRequestPostmanCollectionRequest(@JsonProperty("requestID") String requestID) {
        this.requestID = requestID;
  }
}
