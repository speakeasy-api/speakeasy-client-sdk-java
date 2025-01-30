/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * UnboundedRequest - An UnboundedRequest represents the HAR content capture by Speakeasy when logging a request.
 */

public class UnboundedRequest {

    /**
     * Creation timestamp.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The HAR content of the request.
     */
    @JsonProperty("har")
    private String har;

    /**
     * The size of the HAR content in bytes.
     */
    @JsonProperty("har_size_bytes")
    private long harSizeBytes;

    /**
     * The ID of this request.
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * The workspace ID this request was made to.
     */
    @JsonProperty("workspace_id")
    private String workspaceId;

    @JsonCreator
    public UnboundedRequest(
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("har") String har,
            @JsonProperty("har_size_bytes") long harSizeBytes,
            @JsonProperty("request_id") String requestId,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(har, "har");
        Utils.checkNotNull(harSizeBytes, "harSizeBytes");
        Utils.checkNotNull(requestId, "requestId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.createdAt = createdAt;
        this.har = har;
        this.harSizeBytes = harSizeBytes;
        this.requestId = requestId;
        this.workspaceId = workspaceId;
    }

    /**
     * Creation timestamp.
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * The HAR content of the request.
     */
    @JsonIgnore
    public String har() {
        return har;
    }

    /**
     * The size of the HAR content in bytes.
     */
    @JsonIgnore
    public long harSizeBytes() {
        return harSizeBytes;
    }

    /**
     * The ID of this request.
     */
    @JsonIgnore
    public String requestId() {
        return requestId;
    }

    /**
     * The workspace ID this request was made to.
     */
    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Creation timestamp.
     */
    public UnboundedRequest withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The HAR content of the request.
     */
    public UnboundedRequest withHar(String har) {
        Utils.checkNotNull(har, "har");
        this.har = har;
        return this;
    }

    /**
     * The size of the HAR content in bytes.
     */
    public UnboundedRequest withHarSizeBytes(long harSizeBytes) {
        Utils.checkNotNull(harSizeBytes, "harSizeBytes");
        this.harSizeBytes = harSizeBytes;
        return this;
    }

    /**
     * The ID of this request.
     */
    public UnboundedRequest withRequestId(String requestId) {
        Utils.checkNotNull(requestId, "requestId");
        this.requestId = requestId;
        return this;
    }

    /**
     * The workspace ID this request was made to.
     */
    public UnboundedRequest withWorkspaceId(String workspaceId) {
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
        UnboundedRequest other = (UnboundedRequest) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.har, other.har) &&
            Objects.deepEquals(this.harSizeBytes, other.harSizeBytes) &&
            Objects.deepEquals(this.requestId, other.requestId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            har,
            harSizeBytes,
            requestId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnboundedRequest.class,
                "createdAt", createdAt,
                "har", har,
                "harSizeBytes", harSizeBytes,
                "requestId", requestId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String har;
 
        private Long harSizeBytes;
 
        private String requestId;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
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
         * The HAR content of the request.
         */
        public Builder har(String har) {
            Utils.checkNotNull(har, "har");
            this.har = har;
            return this;
        }

        /**
         * The size of the HAR content in bytes.
         */
        public Builder harSizeBytes(long harSizeBytes) {
            Utils.checkNotNull(harSizeBytes, "harSizeBytes");
            this.harSizeBytes = harSizeBytes;
            return this;
        }

        /**
         * The ID of this request.
         */
        public Builder requestId(String requestId) {
            Utils.checkNotNull(requestId, "requestId");
            this.requestId = requestId;
            return this;
        }

        /**
         * The workspace ID this request was made to.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public UnboundedRequest build() {
            return new UnboundedRequest(
                createdAt,
                har,
                harSizeBytes,
                requestId,
                workspaceId);
        }
    }
}

