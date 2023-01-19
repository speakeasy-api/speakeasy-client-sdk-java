package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
public class GeneratePostmanCollectionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GeneratePostmanCollectionPathParams withApiId(String apiID) {
        this.apiID = apiID;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GeneratePostmanCollectionPathParams withVersionId(String versionID) {
        this.versionID = versionID;
        return this;
    }
}