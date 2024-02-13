/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * Api - An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
 */

public class Api {

    /**
     * The ID of this Api. This is a human-readable name (subject to change).
     */
    @JsonProperty("api_id")
    private String apiId;

    /**
     * Creation timestamp.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * A detailed description of the Api.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Determines if all the endpoints within the Api are found in the OpenAPI spec associated with the Api.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    private Optional<? extends Boolean> matched;

    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta_data")
    private Optional<? extends java.util.Map<String, java.util.List<String>>> metaData;

    /**
     * Last update timestamp.
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    /**
     * The version ID of this Api. This is semantic version identifier.
     */
    @JsonProperty("version_id")
    private String versionId;

    /**
     * The workspace ID this Api belongs to.
     */
    @JsonProperty("workspace_id")
    private String workspaceId;

    public Api(
            @JsonProperty("api_id") String apiId,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("description") String description,
            @JsonProperty("matched") Optional<? extends Boolean> matched,
            @JsonProperty("meta_data") Optional<? extends java.util.Map<String, java.util.List<String>>> metaData,
            @JsonProperty("updated_at") OffsetDateTime updatedAt,
            @JsonProperty("version_id") String versionId,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(apiId, "apiId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(matched, "matched");
        Utils.checkNotNull(metaData, "metaData");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(versionId, "versionId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.description = description;
        this.matched = matched;
        this.metaData = metaData;
        this.updatedAt = updatedAt;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
    }

    /**
     * The ID of this Api. This is a human-readable name (subject to change).
     */
    public String apiId() {
        return apiId;
    }

    /**
     * Creation timestamp.
     */
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * A detailed description of the Api.
     */
    public String description() {
        return description;
    }

    /**
     * Determines if all the endpoints within the Api are found in the OpenAPI spec associated with the Api.
     */
    public Optional<? extends Boolean> matched() {
        return matched;
    }

    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    public Optional<? extends java.util.Map<String, java.util.List<String>>> metaData() {
        return metaData;
    }

    /**
     * Last update timestamp.
     */
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    /**
     * The version ID of this Api. This is semantic version identifier.
     */
    public String versionId() {
        return versionId;
    }

    /**
     * The workspace ID this Api belongs to.
     */
    public String workspaceId() {
        return workspaceId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of this Api. This is a human-readable name (subject to change).
     */
    public Api withApiId(String apiId) {
        Utils.checkNotNull(apiId, "apiId");
        this.apiId = apiId;
        return this;
    }

    /**
     * Creation timestamp.
     */
    public Api withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * A detailed description of the Api.
     */
    public Api withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Determines if all the endpoints within the Api are found in the OpenAPI spec associated with the Api.
     */
    public Api withMatched(boolean matched) {
        Utils.checkNotNull(matched, "matched");
        this.matched = Optional.ofNullable(matched);
        return this;
    }
    
    /**
     * Determines if all the endpoints within the Api are found in the OpenAPI spec associated with the Api.
     */
    public Api withMatched(Optional<? extends Boolean> matched) {
        Utils.checkNotNull(matched, "matched");
        this.matched = matched;
        return this;
    }

    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    public Api withMetaData(java.util.Map<String, java.util.List<String>> metaData) {
        Utils.checkNotNull(metaData, "metaData");
        this.metaData = Optional.ofNullable(metaData);
        return this;
    }
    
    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    public Api withMetaData(Optional<? extends java.util.Map<String, java.util.List<String>>> metaData) {
        Utils.checkNotNull(metaData, "metaData");
        this.metaData = metaData;
        return this;
    }

    /**
     * Last update timestamp.
     */
    public Api withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The version ID of this Api. This is semantic version identifier.
     */
    public Api withVersionId(String versionId) {
        Utils.checkNotNull(versionId, "versionId");
        this.versionId = versionId;
        return this;
    }

    /**
     * The workspace ID this Api belongs to.
     */
    public Api withWorkspaceId(String workspaceId) {
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
        Api other = (Api) o;
        return 
            java.util.Objects.deepEquals(this.apiId, other.apiId) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.matched, other.matched) &&
            java.util.Objects.deepEquals(this.metaData, other.metaData) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.versionId, other.versionId) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiId,
            createdAt,
            description,
            matched,
            metaData,
            updatedAt,
            versionId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Api.class,
                "apiId", apiId,
                "createdAt", createdAt,
                "description", description,
                "matched", matched,
                "metaData", metaData,
                "updatedAt", updatedAt,
                "versionId", versionId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String apiId;
 
        private OffsetDateTime createdAt;
 
        private String description;
 
        private Optional<? extends Boolean> matched = Optional.empty();
 
        private Optional<? extends java.util.Map<String, java.util.List<String>>> metaData = Optional.empty();
 
        private OffsetDateTime updatedAt;
 
        private String versionId;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of this Api. This is a human-readable name (subject to change).
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
         * A detailed description of the Api.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Determines if all the endpoints within the Api are found in the OpenAPI spec associated with the Api.
         */
        public Builder matched(boolean matched) {
            Utils.checkNotNull(matched, "matched");
            this.matched = Optional.ofNullable(matched);
            return this;
        }
        
        /**
         * Determines if all the endpoints within the Api are found in the OpenAPI spec associated with the Api.
         */
        public Builder matched(Optional<? extends Boolean> matched) {
            Utils.checkNotNull(matched, "matched");
            this.matched = matched;
            return this;
        }

        /**
         * A set of values associated with a meta_data key. This field is only set on get requests.
         */
        public Builder metaData(java.util.Map<String, java.util.List<String>> metaData) {
            Utils.checkNotNull(metaData, "metaData");
            this.metaData = Optional.ofNullable(metaData);
            return this;
        }
        
        /**
         * A set of values associated with a meta_data key. This field is only set on get requests.
         */
        public Builder metaData(Optional<? extends java.util.Map<String, java.util.List<String>>> metaData) {
            Utils.checkNotNull(metaData, "metaData");
            this.metaData = metaData;
            return this;
        }

        /**
         * Last update timestamp.
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The version ID of this Api. This is semantic version identifier.
         */
        public Builder versionId(String versionId) {
            Utils.checkNotNull(versionId, "versionId");
            this.versionId = versionId;
            return this;
        }

        /**
         * The workspace ID this Api belongs to.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public Api build() {
            return new Api(
                apiId,
                createdAt,
                description,
                matched,
                metaData,
                updatedAt,
                versionId,
                workspaceId);
        }
    }
}

