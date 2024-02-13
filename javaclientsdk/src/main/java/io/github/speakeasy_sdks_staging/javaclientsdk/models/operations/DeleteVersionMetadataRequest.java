/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;


public class DeleteVersionMetadataRequest {
    /**
     * The ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;

    public DeleteVersionMetadataRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The key of the metadata to delete.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaKey")
    public String metaKey;

    public DeleteVersionMetadataRequest withMetaKey(String metaKey) {
        this.metaKey = metaKey;
        return this;
    }
    
    /**
     * The value of the metadata to delete.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaValue")
    public String metaValue;

    public DeleteVersionMetadataRequest withMetaValue(String metaValue) {
        this.metaValue = metaValue;
        return this;
    }
    
    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;

    public DeleteVersionMetadataRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public DeleteVersionMetadataRequest(@JsonProperty("apiID") String apiID, @JsonProperty("metaKey") String metaKey, @JsonProperty("metaValue") String metaValue, @JsonProperty("versionID") String versionID) {
        this.apiID = apiID;
        this.metaKey = metaKey;
        this.metaValue = metaValue;
        this.versionID = versionID;
  }
}
