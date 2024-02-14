/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.DateTimeDeserializer;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * VersionMetadata - A set of keys and associated values, attached to a particular version of an Api.
 */

public class VersionMetadata {
    /**
     * The ID of the Api this Metadata belongs to.
     */
    @JsonProperty("api_id")
    public String apiId;

    public VersionMetadata withApiId(String apiId) {
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

    public VersionMetadata withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The key for this metadata.
     */
    @JsonProperty("meta_key")
    public String metaKey;

    public VersionMetadata withMetaKey(String metaKey) {
        this.metaKey = metaKey;
        return this;
    }
    
    /**
     * One of the values for this metadata.
     */
    @JsonProperty("meta_value")
    public String metaValue;

    public VersionMetadata withMetaValue(String metaValue) {
        this.metaValue = metaValue;
        return this;
    }
    
    /**
     * The version ID of the Api this Metadata belongs to.
     */
    @JsonProperty("version_id")
    public String versionId;

    public VersionMetadata withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    
    /**
     * The workspace ID this Metadata belongs to.
     */
    @JsonProperty("workspace_id")
    public String workspaceId;

    public VersionMetadata withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public VersionMetadata(@JsonProperty("api_id") String apiId, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("meta_key") String metaKey, @JsonProperty("meta_value") String metaValue, @JsonProperty("version_id") String versionId, @JsonProperty("workspace_id") String workspaceId) {
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.metaKey = metaKey;
        this.metaValue = metaValue;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
  }
}