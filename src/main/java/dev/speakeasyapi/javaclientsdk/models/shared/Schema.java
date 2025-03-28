/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.speakeasyapi.javaclientsdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
/**
 * Schema - A Schema represents an API schema for a particular Api and Version.
 */

public class Schema {

    /**
     * The ID of the Api this Schema belongs to.
     */
    @JsonProperty("api_id")
    private String apiId;

    /**
     * Creation timestamp.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * A detailed description of the Schema.
     */
    @JsonProperty("description")
    private String description;

    /**
     * An ID referencing this particular revision of the Schema.
     */
    @JsonProperty("revision_id")
    private String revisionId;

    /**
     * The version ID of the Api this Schema belongs to.
     */
    @JsonProperty("version_id")
    private String versionId;

    /**
     * The workspace ID this Schema belongs to.
     */
    @JsonProperty("workspace_id")
    private String workspaceId;

    @JsonCreator
    public Schema(
            @JsonProperty("api_id") String apiId,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("description") String description,
            @JsonProperty("revision_id") String revisionId,
            @JsonProperty("version_id") String versionId,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(apiId, "apiId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(revisionId, "revisionId");
        Utils.checkNotNull(versionId, "versionId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.description = description;
        this.revisionId = revisionId;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
    }

    /**
     * The ID of the Api this Schema belongs to.
     */
    @JsonIgnore
    public String apiId() {
        return apiId;
    }

    /**
     * Creation timestamp.
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * A detailed description of the Schema.
     */
    @JsonIgnore
    public String description() {
        return description;
    }

    /**
     * An ID referencing this particular revision of the Schema.
     */
    @JsonIgnore
    public String revisionId() {
        return revisionId;
    }

    /**
     * The version ID of the Api this Schema belongs to.
     */
    @JsonIgnore
    public String versionId() {
        return versionId;
    }

    /**
     * The workspace ID this Schema belongs to.
     */
    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the Api this Schema belongs to.
     */
    public Schema withApiId(String apiId) {
        Utils.checkNotNull(apiId, "apiId");
        this.apiId = apiId;
        return this;
    }

    /**
     * Creation timestamp.
     */
    public Schema withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * A detailed description of the Schema.
     */
    public Schema withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * An ID referencing this particular revision of the Schema.
     */
    public Schema withRevisionId(String revisionId) {
        Utils.checkNotNull(revisionId, "revisionId");
        this.revisionId = revisionId;
        return this;
    }

    /**
     * The version ID of the Api this Schema belongs to.
     */
    public Schema withVersionId(String versionId) {
        Utils.checkNotNull(versionId, "versionId");
        this.versionId = versionId;
        return this;
    }

    /**
     * The workspace ID this Schema belongs to.
     */
    public Schema withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Schema other = (Schema) o;
        return 
            Objects.deepEquals(this.apiId, other.apiId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.revisionId, other.revisionId) &&
            Objects.deepEquals(this.versionId, other.versionId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiId,
            createdAt,
            description,
            revisionId,
            versionId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Schema.class,
                "apiId", apiId,
                "createdAt", createdAt,
                "description", description,
                "revisionId", revisionId,
                "versionId", versionId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String apiId;
 
        private OffsetDateTime createdAt;
 
        private String description;
 
        private String revisionId;
 
        private String versionId;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Api this Schema belongs to.
         */
        public Builder apiId(String apiId) {
            Utils.checkNotNull(apiId, "apiId");
            this.apiId = apiId;
            return this;
        }

        /**
         * Creation timestamp.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * A detailed description of the Schema.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * An ID referencing this particular revision of the Schema.
         */
        public Builder revisionId(String revisionId) {
            Utils.checkNotNull(revisionId, "revisionId");
            this.revisionId = revisionId;
            return this;
        }

        /**
         * The version ID of the Api this Schema belongs to.
         */
        public Builder versionId(String versionId) {
            Utils.checkNotNull(versionId, "versionId");
            this.versionId = versionId;
            return this;
        }

        /**
         * The workspace ID this Schema belongs to.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public Schema build() {
            return new Schema(
                apiId,
                createdAt,
                description,
                revisionId,
                versionId,
                workspaceId);
        }
    }
}

