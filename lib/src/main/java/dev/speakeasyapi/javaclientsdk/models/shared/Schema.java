/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * Schema - A Schema represents an API schema for a particular Api and Version.
 */

public class Schema {
    /**
     * The ID of the Api this Schema belongs to.
     */
    @JsonProperty("api_id")
    public String apiId;

    public Schema withApiId(String apiId) {
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

    public Schema withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * A detailed description of the Schema.
     */
    @JsonProperty("description")
    public String description;

    public Schema withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * An ID referencing this particular revision of the Schema.
     */
    @JsonProperty("revision_id")
    public String revisionId;

    public Schema withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    
    /**
     * The version ID of the Api this Schema belongs to.
     */
    @JsonProperty("version_id")
    public String versionId;

    public Schema withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    
    /**
     * The workspace ID this Schema belongs to.
     */
    @JsonProperty("workspace_id")
    public String workspaceId;

    public Schema withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public Schema(@JsonProperty("api_id") String apiId, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("description") String description, @JsonProperty("revision_id") String revisionId, @JsonProperty("version_id") String versionId, @JsonProperty("workspace_id") String workspaceId) {
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.description = description;
        this.revisionId = revisionId;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
  }
}
