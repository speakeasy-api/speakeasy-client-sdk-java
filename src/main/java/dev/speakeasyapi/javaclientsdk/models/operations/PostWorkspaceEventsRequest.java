/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.CliEvent;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PostWorkspaceEventsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private List<CliEvent> requestBody;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_id")
    private Optional<String> workspaceId;

    @JsonCreator
    public PostWorkspaceEventsRequest(
            List<CliEvent> requestBody,
            Optional<String> workspaceId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.requestBody = requestBody;
        this.workspaceId = workspaceId;
    }
    
    public PostWorkspaceEventsRequest(
            List<CliEvent> requestBody) {
        this(requestBody, Optional.empty());
    }

    @JsonIgnore
    public List<CliEvent> requestBody() {
        return requestBody;
    }

    /**
     * Unique identifier of the workspace.
     */
    @JsonIgnore
    public Optional<String> workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostWorkspaceEventsRequest withRequestBody(List<CliEvent> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public PostWorkspaceEventsRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = Optional.ofNullable(workspaceId);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public PostWorkspaceEventsRequest withWorkspaceId(Optional<String> workspaceId) {
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
        PostWorkspaceEventsRequest other = (PostWorkspaceEventsRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostWorkspaceEventsRequest.class,
                "requestBody", requestBody,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private List<CliEvent> requestBody;
 
        private Optional<String> workspaceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(List<CliEvent> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = Optional.ofNullable(workspaceId);
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceId(Optional<String> workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public PostWorkspaceEventsRequest build() {
            return new PostWorkspaceEventsRequest(
                requestBody,
                workspaceId);
        }
    }
}

