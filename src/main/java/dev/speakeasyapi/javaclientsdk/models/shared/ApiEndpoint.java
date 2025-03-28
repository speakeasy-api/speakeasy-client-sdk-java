/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.speakeasyapi.javaclientsdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
/**
 * ApiEndpoint - An ApiEndpoint is a description of an Endpoint for an API.
 */

public class ApiEndpoint {

    /**
     * The ID of this ApiEndpoint. This is a hash of the method and path.
     */
    @JsonProperty("api_endpoint_id")
    private String apiEndpointId;

    /**
     * The ID of the Api this ApiEndpoint belongs to.
     */
    @JsonProperty("api_id")
    private String apiId;

    /**
     * Creation timestamp.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * A detailed description of the ApiEndpoint.
     */
    @JsonProperty("description")
    private String description;

    /**
     * A human-readable name for the ApiEndpoint.
     */
    @JsonProperty("display_name")
    private String displayName;

    /**
     * Determines if the endpoint was found in the OpenAPI spec associated with the parent Api.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matched")
    private Optional<Boolean> matched;

    /**
     * HTTP verb.
     */
    @JsonProperty("method")
    private String method;

    /**
     * Path that handles this Api.
     */
    @JsonProperty("path")
    private String path;

    /**
     * Last update timestamp.
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    /**
     * The version ID of the Api this ApiEndpoint belongs to.
     */
    @JsonProperty("version_id")
    private String versionId;

    /**
     * The workspace ID this ApiEndpoint belongs to.
     */
    @JsonProperty("workspace_id")
    private String workspaceId;

    @JsonCreator
    public ApiEndpoint(
            @JsonProperty("api_endpoint_id") String apiEndpointId,
            @JsonProperty("api_id") String apiId,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("description") String description,
            @JsonProperty("display_name") String displayName,
            @JsonProperty("matched") Optional<Boolean> matched,
            @JsonProperty("method") String method,
            @JsonProperty("path") String path,
            @JsonProperty("updated_at") OffsetDateTime updatedAt,
            @JsonProperty("version_id") String versionId,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(apiEndpointId, "apiEndpointId");
        Utils.checkNotNull(apiId, "apiId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(matched, "matched");
        Utils.checkNotNull(method, "method");
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(versionId, "versionId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.apiEndpointId = apiEndpointId;
        this.apiId = apiId;
        this.createdAt = createdAt;
        this.description = description;
        this.displayName = displayName;
        this.matched = matched;
        this.method = method;
        this.path = path;
        this.updatedAt = updatedAt;
        this.versionId = versionId;
        this.workspaceId = workspaceId;
    }
    
    public ApiEndpoint(
            String apiEndpointId,
            String apiId,
            OffsetDateTime createdAt,
            String description,
            String displayName,
            String method,
            String path,
            OffsetDateTime updatedAt,
            String versionId,
            String workspaceId) {
        this(apiEndpointId, apiId, createdAt, description, displayName, Optional.empty(), method, path, updatedAt, versionId, workspaceId);
    }

    /**
     * The ID of this ApiEndpoint. This is a hash of the method and path.
     */
    @JsonIgnore
    public String apiEndpointId() {
        return apiEndpointId;
    }

    /**
     * The ID of the Api this ApiEndpoint belongs to.
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
     * A detailed description of the ApiEndpoint.
     */
    @JsonIgnore
    public String description() {
        return description;
    }

    /**
     * A human-readable name for the ApiEndpoint.
     */
    @JsonIgnore
    public String displayName() {
        return displayName;
    }

    /**
     * Determines if the endpoint was found in the OpenAPI spec associated with the parent Api.
     */
    @JsonIgnore
    public Optional<Boolean> matched() {
        return matched;
    }

    /**
     * HTTP verb.
     */
    @JsonIgnore
    public String method() {
        return method;
    }

    /**
     * Path that handles this Api.
     */
    @JsonIgnore
    public String path() {
        return path;
    }

    /**
     * Last update timestamp.
     */
    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    /**
     * The version ID of the Api this ApiEndpoint belongs to.
     */
    @JsonIgnore
    public String versionId() {
        return versionId;
    }

    /**
     * The workspace ID this ApiEndpoint belongs to.
     */
    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of this ApiEndpoint. This is a hash of the method and path.
     */
    public ApiEndpoint withApiEndpointId(String apiEndpointId) {
        Utils.checkNotNull(apiEndpointId, "apiEndpointId");
        this.apiEndpointId = apiEndpointId;
        return this;
    }

    /**
     * The ID of the Api this ApiEndpoint belongs to.
     */
    public ApiEndpoint withApiId(String apiId) {
        Utils.checkNotNull(apiId, "apiId");
        this.apiId = apiId;
        return this;
    }

    /**
     * Creation timestamp.
     */
    public ApiEndpoint withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * A detailed description of the ApiEndpoint.
     */
    public ApiEndpoint withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * A human-readable name for the ApiEndpoint.
     */
    public ApiEndpoint withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * Determines if the endpoint was found in the OpenAPI spec associated with the parent Api.
     */
    public ApiEndpoint withMatched(boolean matched) {
        Utils.checkNotNull(matched, "matched");
        this.matched = Optional.ofNullable(matched);
        return this;
    }

    /**
     * Determines if the endpoint was found in the OpenAPI spec associated with the parent Api.
     */
    public ApiEndpoint withMatched(Optional<Boolean> matched) {
        Utils.checkNotNull(matched, "matched");
        this.matched = matched;
        return this;
    }

    /**
     * HTTP verb.
     */
    public ApiEndpoint withMethod(String method) {
        Utils.checkNotNull(method, "method");
        this.method = method;
        return this;
    }

    /**
     * Path that handles this Api.
     */
    public ApiEndpoint withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * Last update timestamp.
     */
    public ApiEndpoint withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The version ID of the Api this ApiEndpoint belongs to.
     */
    public ApiEndpoint withVersionId(String versionId) {
        Utils.checkNotNull(versionId, "versionId");
        this.versionId = versionId;
        return this;
    }

    /**
     * The workspace ID this ApiEndpoint belongs to.
     */
    public ApiEndpoint withWorkspaceId(String workspaceId) {
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
        ApiEndpoint other = (ApiEndpoint) o;
        return 
            Objects.deepEquals(this.apiEndpointId, other.apiEndpointId) &&
            Objects.deepEquals(this.apiId, other.apiId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.displayName, other.displayName) &&
            Objects.deepEquals(this.matched, other.matched) &&
            Objects.deepEquals(this.method, other.method) &&
            Objects.deepEquals(this.path, other.path) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.versionId, other.versionId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiEndpointId,
            apiId,
            createdAt,
            description,
            displayName,
            matched,
            method,
            path,
            updatedAt,
            versionId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiEndpoint.class,
                "apiEndpointId", apiEndpointId,
                "apiId", apiId,
                "createdAt", createdAt,
                "description", description,
                "displayName", displayName,
                "matched", matched,
                "method", method,
                "path", path,
                "updatedAt", updatedAt,
                "versionId", versionId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String apiEndpointId;
 
        private String apiId;
 
        private OffsetDateTime createdAt;
 
        private String description;
 
        private String displayName;
 
        private Optional<Boolean> matched = Optional.empty();
 
        private String method;
 
        private String path;
 
        private OffsetDateTime updatedAt;
 
        private String versionId;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of this ApiEndpoint. This is a hash of the method and path.
         */
        public Builder apiEndpointId(String apiEndpointId) {
            Utils.checkNotNull(apiEndpointId, "apiEndpointId");
            this.apiEndpointId = apiEndpointId;
            return this;
        }

        /**
         * The ID of the Api this ApiEndpoint belongs to.
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
         * A detailed description of the ApiEndpoint.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * A human-readable name for the ApiEndpoint.
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        /**
         * Determines if the endpoint was found in the OpenAPI spec associated with the parent Api.
         */
        public Builder matched(boolean matched) {
            Utils.checkNotNull(matched, "matched");
            this.matched = Optional.ofNullable(matched);
            return this;
        }

        /**
         * Determines if the endpoint was found in the OpenAPI spec associated with the parent Api.
         */
        public Builder matched(Optional<Boolean> matched) {
            Utils.checkNotNull(matched, "matched");
            this.matched = matched;
            return this;
        }

        /**
         * HTTP verb.
         */
        public Builder method(String method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }

        /**
         * Path that handles this Api.
         */
        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
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
         * The version ID of the Api this ApiEndpoint belongs to.
         */
        public Builder versionId(String versionId) {
            Utils.checkNotNull(versionId, "versionId");
            this.versionId = versionId;
            return this;
        }

        /**
         * The workspace ID this ApiEndpoint belongs to.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public ApiEndpoint build() {
            return new ApiEndpoint(
                apiEndpointId,
                apiId,
                createdAt,
                description,
                displayName,
                matched,
                method,
                path,
                updatedAt,
                versionId,
                workspaceId);
        }
    }
}

