/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;


public class DownloadSchemaRevisionRequest {
    /**
     * The ID of the Api to retrieve schemas for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;

    public DownloadSchemaRevisionRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The revision ID of the schema to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revisionID")
    public String revisionID;

    public DownloadSchemaRevisionRequest withRevisionID(String revisionID) {
        this.revisionID = revisionID;
        return this;
    }
    
    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;

    public DownloadSchemaRevisionRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public DownloadSchemaRevisionRequest(@JsonProperty("apiID") String apiID, @JsonProperty("revisionID") String revisionID, @JsonProperty("versionID") String versionID) {
        this.apiID = apiID;
        this.revisionID = revisionID;
        this.versionID = versionID;
  }
}
