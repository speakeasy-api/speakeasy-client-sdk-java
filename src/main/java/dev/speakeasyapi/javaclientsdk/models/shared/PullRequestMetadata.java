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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * PullRequestMetadata - This can only be populated when the github app is installed for a repo
 */

public class PullRequestMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base_branch")
    private Optional<String> baseBranch;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_merge")
    private Optional<Boolean> canMerge;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    /**
     * truncated to first 1000 characters
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("head_branch")
    private Optional<String> headBranch;

    /**
     * List of github labels
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("labels")
    private Optional<? extends List<String>> labels;

    /**
     * List of github handles
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requested_reviewers")
    private Optional<? extends List<String>> requestedReviewers;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<String> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonCreator
    public PullRequestMetadata(
            @JsonProperty("base_branch") Optional<String> baseBranch,
            @JsonProperty("can_merge") Optional<Boolean> canMerge,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("head_branch") Optional<String> headBranch,
            @JsonProperty("labels") Optional<? extends List<String>> labels,
            @JsonProperty("requested_reviewers") Optional<? extends List<String>> requestedReviewers,
            @JsonProperty("status") Optional<String> status,
            @JsonProperty("title") Optional<String> title) {
        Utils.checkNotNull(baseBranch, "baseBranch");
        Utils.checkNotNull(canMerge, "canMerge");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(headBranch, "headBranch");
        Utils.checkNotNull(labels, "labels");
        Utils.checkNotNull(requestedReviewers, "requestedReviewers");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(title, "title");
        this.baseBranch = baseBranch;
        this.canMerge = canMerge;
        this.createdAt = createdAt;
        this.description = description;
        this.headBranch = headBranch;
        this.labels = labels;
        this.requestedReviewers = requestedReviewers;
        this.status = status;
        this.title = title;
    }
    
    public PullRequestMetadata() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> baseBranch() {
        return baseBranch;
    }

    @JsonIgnore
    public Optional<Boolean> canMerge() {
        return canMerge;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * truncated to first 1000 characters
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> headBranch() {
        return headBranch;
    }

    /**
     * List of github labels
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> labels() {
        return (Optional<List<String>>) labels;
    }

    /**
     * List of github handles
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> requestedReviewers() {
        return (Optional<List<String>>) requestedReviewers;
    }

    @JsonIgnore
    public Optional<String> status() {
        return status;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PullRequestMetadata withBaseBranch(String baseBranch) {
        Utils.checkNotNull(baseBranch, "baseBranch");
        this.baseBranch = Optional.ofNullable(baseBranch);
        return this;
    }

    public PullRequestMetadata withBaseBranch(Optional<String> baseBranch) {
        Utils.checkNotNull(baseBranch, "baseBranch");
        this.baseBranch = baseBranch;
        return this;
    }

    public PullRequestMetadata withCanMerge(boolean canMerge) {
        Utils.checkNotNull(canMerge, "canMerge");
        this.canMerge = Optional.ofNullable(canMerge);
        return this;
    }

    public PullRequestMetadata withCanMerge(Optional<Boolean> canMerge) {
        Utils.checkNotNull(canMerge, "canMerge");
        this.canMerge = canMerge;
        return this;
    }

    public PullRequestMetadata withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public PullRequestMetadata withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * truncated to first 1000 characters
     */
    public PullRequestMetadata withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * truncated to first 1000 characters
     */
    public PullRequestMetadata withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public PullRequestMetadata withHeadBranch(String headBranch) {
        Utils.checkNotNull(headBranch, "headBranch");
        this.headBranch = Optional.ofNullable(headBranch);
        return this;
    }

    public PullRequestMetadata withHeadBranch(Optional<String> headBranch) {
        Utils.checkNotNull(headBranch, "headBranch");
        this.headBranch = headBranch;
        return this;
    }

    /**
     * List of github labels
     */
    public PullRequestMetadata withLabels(List<String> labels) {
        Utils.checkNotNull(labels, "labels");
        this.labels = Optional.ofNullable(labels);
        return this;
    }

    /**
     * List of github labels
     */
    public PullRequestMetadata withLabels(Optional<? extends List<String>> labels) {
        Utils.checkNotNull(labels, "labels");
        this.labels = labels;
        return this;
    }

    /**
     * List of github handles
     */
    public PullRequestMetadata withRequestedReviewers(List<String> requestedReviewers) {
        Utils.checkNotNull(requestedReviewers, "requestedReviewers");
        this.requestedReviewers = Optional.ofNullable(requestedReviewers);
        return this;
    }

    /**
     * List of github handles
     */
    public PullRequestMetadata withRequestedReviewers(Optional<? extends List<String>> requestedReviewers) {
        Utils.checkNotNull(requestedReviewers, "requestedReviewers");
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public PullRequestMetadata withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public PullRequestMetadata withStatus(Optional<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public PullRequestMetadata withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public PullRequestMetadata withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
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
        PullRequestMetadata other = (PullRequestMetadata) o;
        return 
            Objects.deepEquals(this.baseBranch, other.baseBranch) &&
            Objects.deepEquals(this.canMerge, other.canMerge) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.headBranch, other.headBranch) &&
            Objects.deepEquals(this.labels, other.labels) &&
            Objects.deepEquals(this.requestedReviewers, other.requestedReviewers) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            baseBranch,
            canMerge,
            createdAt,
            description,
            headBranch,
            labels,
            requestedReviewers,
            status,
            title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PullRequestMetadata.class,
                "baseBranch", baseBranch,
                "canMerge", canMerge,
                "createdAt", createdAt,
                "description", description,
                "headBranch", headBranch,
                "labels", labels,
                "requestedReviewers", requestedReviewers,
                "status", status,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<String> baseBranch = Optional.empty();
 
        private Optional<Boolean> canMerge = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> headBranch = Optional.empty();
 
        private Optional<? extends List<String>> labels = Optional.empty();
 
        private Optional<? extends List<String>> requestedReviewers = Optional.empty();
 
        private Optional<String> status = Optional.empty();
 
        private Optional<String> title = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder baseBranch(String baseBranch) {
            Utils.checkNotNull(baseBranch, "baseBranch");
            this.baseBranch = Optional.ofNullable(baseBranch);
            return this;
        }

        public Builder baseBranch(Optional<String> baseBranch) {
            Utils.checkNotNull(baseBranch, "baseBranch");
            this.baseBranch = baseBranch;
            return this;
        }

        public Builder canMerge(boolean canMerge) {
            Utils.checkNotNull(canMerge, "canMerge");
            this.canMerge = Optional.ofNullable(canMerge);
            return this;
        }

        public Builder canMerge(Optional<Boolean> canMerge) {
            Utils.checkNotNull(canMerge, "canMerge");
            this.canMerge = canMerge;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * truncated to first 1000 characters
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * truncated to first 1000 characters
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder headBranch(String headBranch) {
            Utils.checkNotNull(headBranch, "headBranch");
            this.headBranch = Optional.ofNullable(headBranch);
            return this;
        }

        public Builder headBranch(Optional<String> headBranch) {
            Utils.checkNotNull(headBranch, "headBranch");
            this.headBranch = headBranch;
            return this;
        }

        /**
         * List of github labels
         */
        public Builder labels(List<String> labels) {
            Utils.checkNotNull(labels, "labels");
            this.labels = Optional.ofNullable(labels);
            return this;
        }

        /**
         * List of github labels
         */
        public Builder labels(Optional<? extends List<String>> labels) {
            Utils.checkNotNull(labels, "labels");
            this.labels = labels;
            return this;
        }

        /**
         * List of github handles
         */
        public Builder requestedReviewers(List<String> requestedReviewers) {
            Utils.checkNotNull(requestedReviewers, "requestedReviewers");
            this.requestedReviewers = Optional.ofNullable(requestedReviewers);
            return this;
        }

        /**
         * List of github handles
         */
        public Builder requestedReviewers(Optional<? extends List<String>> requestedReviewers) {
            Utils.checkNotNull(requestedReviewers, "requestedReviewers");
            this.requestedReviewers = requestedReviewers;
            return this;
        }

        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }
        
        public PullRequestMetadata build() {
            return new PullRequestMetadata(
                baseBranch,
                canMerge,
                createdAt,
                description,
                headBranch,
                labels,
                requestedReviewers,
                status,
                title);
        }
    }
}

