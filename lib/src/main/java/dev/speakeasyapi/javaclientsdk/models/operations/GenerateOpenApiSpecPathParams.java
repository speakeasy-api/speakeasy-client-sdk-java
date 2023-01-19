package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
public class GenerateOpenApiSpecPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GenerateOpenApiSpecPathParams withApiId(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GenerateOpenApiSpecPathParams withVersionId(String versionID) {
        this.versionID = versionID;
        return this;
    }
}