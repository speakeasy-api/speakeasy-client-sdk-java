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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * GithubPublishingPRResponse - Open generation PRs pending publishing
 */

public class GithubPublishingPRResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pending_version")
    private Optional<String> pendingVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pull_request")
    private Optional<String> pullRequest;

    /**
     * This can only be populated when the github app is installed for a repo
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pull_request_metadata")
    private Optional<? extends PullRequestMetadata> pullRequestMetadata;

    @JsonCreator
    public GithubPublishingPRResponse(
            @JsonProperty("pending_version") Optional<String> pendingVersion,
            @JsonProperty("pull_request") Optional<String> pullRequest,
            @JsonProperty("pull_request_metadata") Optional<? extends PullRequestMetadata> pullRequestMetadata) {
        Utils.checkNotNull(pendingVersion, "pendingVersion");
        Utils.checkNotNull(pullRequest, "pullRequest");
        Utils.checkNotNull(pullRequestMetadata, "pullRequestMetadata");
        this.pendingVersion = pendingVersion;
        this.pullRequest = pullRequest;
        this.pullRequestMetadata = pullRequestMetadata;
    }
    
    public GithubPublishingPRResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> pendingVersion() {
        return pendingVersion;
    }

    @JsonIgnore
    public Optional<String> pullRequest() {
        return pullRequest;
    }

    /**
     * This can only be populated when the github app is installed for a repo
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PullRequestMetadata> pullRequestMetadata() {
        return (Optional<PullRequestMetadata>) pullRequestMetadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GithubPublishingPRResponse withPendingVersion(String pendingVersion) {
        Utils.checkNotNull(pendingVersion, "pendingVersion");
        this.pendingVersion = Optional.ofNullable(pendingVersion);
        return this;
    }

    public GithubPublishingPRResponse withPendingVersion(Optional<String> pendingVersion) {
        Utils.checkNotNull(pendingVersion, "pendingVersion");
        this.pendingVersion = pendingVersion;
        return this;
    }

    public GithubPublishingPRResponse withPullRequest(String pullRequest) {
        Utils.checkNotNull(pullRequest, "pullRequest");
        this.pullRequest = Optional.ofNullable(pullRequest);
        return this;
    }

    public GithubPublishingPRResponse withPullRequest(Optional<String> pullRequest) {
        Utils.checkNotNull(pullRequest, "pullRequest");
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * This can only be populated when the github app is installed for a repo
     */
    public GithubPublishingPRResponse withPullRequestMetadata(PullRequestMetadata pullRequestMetadata) {
        Utils.checkNotNull(pullRequestMetadata, "pullRequestMetadata");
        this.pullRequestMetadata = Optional.ofNullable(pullRequestMetadata);
        return this;
    }

    /**
     * This can only be populated when the github app is installed for a repo
     */
    public GithubPublishingPRResponse withPullRequestMetadata(Optional<? extends PullRequestMetadata> pullRequestMetadata) {
        Utils.checkNotNull(pullRequestMetadata, "pullRequestMetadata");
        this.pullRequestMetadata = pullRequestMetadata;
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
        GithubPublishingPRResponse other = (GithubPublishingPRResponse) o;
        return 
            Objects.deepEquals(this.pendingVersion, other.pendingVersion) &&
            Objects.deepEquals(this.pullRequest, other.pullRequest) &&
            Objects.deepEquals(this.pullRequestMetadata, other.pullRequestMetadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            pendingVersion,
            pullRequest,
            pullRequestMetadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GithubPublishingPRResponse.class,
                "pendingVersion", pendingVersion,
                "pullRequest", pullRequest,
                "pullRequestMetadata", pullRequestMetadata);
    }
    
    public final static class Builder {
 
        private Optional<String> pendingVersion = Optional.empty();
 
        private Optional<String> pullRequest = Optional.empty();
 
        private Optional<? extends PullRequestMetadata> pullRequestMetadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder pendingVersion(String pendingVersion) {
            Utils.checkNotNull(pendingVersion, "pendingVersion");
            this.pendingVersion = Optional.ofNullable(pendingVersion);
            return this;
        }

        public Builder pendingVersion(Optional<String> pendingVersion) {
            Utils.checkNotNull(pendingVersion, "pendingVersion");
            this.pendingVersion = pendingVersion;
            return this;
        }

        public Builder pullRequest(String pullRequest) {
            Utils.checkNotNull(pullRequest, "pullRequest");
            this.pullRequest = Optional.ofNullable(pullRequest);
            return this;
        }

        public Builder pullRequest(Optional<String> pullRequest) {
            Utils.checkNotNull(pullRequest, "pullRequest");
            this.pullRequest = pullRequest;
            return this;
        }

        /**
         * This can only be populated when the github app is installed for a repo
         */
        public Builder pullRequestMetadata(PullRequestMetadata pullRequestMetadata) {
            Utils.checkNotNull(pullRequestMetadata, "pullRequestMetadata");
            this.pullRequestMetadata = Optional.ofNullable(pullRequestMetadata);
            return this;
        }

        /**
         * This can only be populated when the github app is installed for a repo
         */
        public Builder pullRequestMetadata(Optional<? extends PullRequestMetadata> pullRequestMetadata) {
            Utils.checkNotNull(pullRequestMetadata, "pullRequestMetadata");
            this.pullRequestMetadata = pullRequestMetadata;
            return this;
        }
        
        public GithubPublishingPRResponse build() {
            return new GithubPublishingPRResponse(
                pendingVersion,
                pullRequest,
                pullRequestMetadata);
        }
    }
}

