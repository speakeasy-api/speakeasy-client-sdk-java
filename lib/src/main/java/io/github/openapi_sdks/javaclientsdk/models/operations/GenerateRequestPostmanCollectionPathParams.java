package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class GenerateRequestPostmanCollectionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    public String requestID;
    public GenerateRequestPostmanCollectionPathParams withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    
}