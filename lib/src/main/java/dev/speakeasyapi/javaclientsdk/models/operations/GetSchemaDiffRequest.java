/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetSchemaDiffRequest {
    /**
     * The ID of the Api to retrieve schemas for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    public String apiID;
    public GetSchemaDiffRequest withApiID(String apiID) {
        this.apiID = apiID;
        return this;
    }
    
    /**
     * The base revision ID of the schema to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=baseRevisionID")
    public String baseRevisionID;
    public GetSchemaDiffRequest withBaseRevisionID(String baseRevisionID) {
        this.baseRevisionID = baseRevisionID;
        return this;
    }
    
    /**
     * The target revision ID of the schema to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=targetRevisionID")
    public String targetRevisionID;
    public GetSchemaDiffRequest withTargetRevisionID(String targetRevisionID) {
        this.targetRevisionID = targetRevisionID;
        return this;
    }
    
    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    public String versionID;
    public GetSchemaDiffRequest withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    
    public GetSchemaDiffRequest(@JsonProperty("apiID") String apiID, @JsonProperty("baseRevisionID") String baseRevisionID, @JsonProperty("targetRevisionID") String targetRevisionID, @JsonProperty("versionID") String versionID) {
        this.apiID = apiID;
        this.baseRevisionID = baseRevisionID;
        this.targetRevisionID = targetRevisionID;
        this.versionID = versionID;
  }
}
