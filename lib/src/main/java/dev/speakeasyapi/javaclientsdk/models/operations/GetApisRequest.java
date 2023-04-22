/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetApisRequest {
    /**
     * Metadata to filter Apis on
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, String[]> metadata;
    public GetApisRequest withMetadata(java.util.Map<String, String[]> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Configuration for filter operations
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    public GetApisOp op;
    public GetApisRequest withOp(GetApisOp op) {
        this.op = op;
        return this;
    }
    

    public GetApisRequest(){}
}
