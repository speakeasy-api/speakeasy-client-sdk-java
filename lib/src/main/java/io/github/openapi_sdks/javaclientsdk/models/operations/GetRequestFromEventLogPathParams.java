package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class GetRequestFromEventLogPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    public String requestID;
    public GetRequestFromEventLogPathParams withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    
}