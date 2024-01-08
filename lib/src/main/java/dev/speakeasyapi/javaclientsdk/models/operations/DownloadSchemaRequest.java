/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;


public class DownloadSchemaRequest {
    /**
     * The ID of the Api to download the schema for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;

    public DownloadSchemaRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;

    public DownloadSchemaRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public DownloadSchemaRequest(@JsonProperty("apiID") String apiID, @JsonProperty("versionID") String versionID) {
        this.apiID = apiID;
        this.versionID = versionID;
  }
}
