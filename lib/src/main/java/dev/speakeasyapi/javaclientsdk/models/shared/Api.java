/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * Api - An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
 */
public class Api {
    /**
     * The ID of this Api. This is a human-readable name (subject to change).
     */
    @JsonProperty("api_id")
    public String apiId;
    public Api withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    
    /**
     * Creation timestamp.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Api withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * A detailed description of the Api.
     */
    @JsonProperty("description")
    public String description;
    public Api withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Determines if all the endpoints within the Api are found in the OpenAPI spec associated with the Api.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    public Boolean matched;
    public Api withMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    
    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta_data")
    public java.util.Map<String, String[]> metaData;
    public Api withMetaData(java.util.Map<String, String[]> metaData) {
        this.metaData = metaData;
        return this;
    }
    
    /**
     * Last update timestamp.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public Api withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * The version ID of this Api. This is semantic version identifier.
     */
    @JsonProperty("version_id")
    public String versionId;
    public Api withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    
    /**
     * The workspace ID this Api belongs to.
     */
    @JsonProperty("workspace_id")
    public String workspaceId;
    public Api withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public Api(@JsonProperty("api_id") String apiId, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("description") String description, @JsonProperty("updated_at") OffsetDateTime updatedAt, @JsonProperty("version_id") String versionId, @JsonProperty("workspace_id") String workspaceId) {
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.description = description;
        this.updatedAt = updatedAt;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
  }
}
