package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class GenerateOpenApiSpecPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GenerateOpenApiSpecPathParams withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GenerateOpenApiSpecPathParams withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
}