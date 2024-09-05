/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.InteractionType;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class SearchWorkspaceEventsRequest {

    /**
     * A specific gen lock ID for the events.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=generate_gen_lock_id")
    private Optional<String> generateGenLockId;

    /**
     * Specified interaction type for events.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=interaction_type")
    private Optional<? extends InteractionType> interactionType;

    /**
     * Unique identifier of the lint report digest.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=lint_report_digest")
    private Optional<String> lintReportDigest;

    /**
     * Unique identifier of the openapi diff report digest.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=openapi_diff_report_digest")
    private Optional<String> openapiDiffReportDigest;

    /**
     * Unique identifier of the source revision digest.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source_revision_digest")
    private Optional<String> sourceRevisionDigest;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<String> workspaceID;

    @JsonCreator
    public SearchWorkspaceEventsRequest(
            Optional<String> generateGenLockId,
            Optional<? extends InteractionType> interactionType,
            Optional<String> lintReportDigest,
            Optional<String> openapiDiffReportDigest,
            Optional<String> sourceRevisionDigest,
            Optional<String> workspaceID) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        Utils.checkNotNull(interactionType, "interactionType");
        Utils.checkNotNull(lintReportDigest, "lintReportDigest");
        Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.generateGenLockId = generateGenLockId;
        this.interactionType = interactionType;
        this.lintReportDigest = lintReportDigest;
        this.openapiDiffReportDigest = openapiDiffReportDigest;
        this.sourceRevisionDigest = sourceRevisionDigest;
        this.workspaceID = workspaceID;
    }
    
    public SearchWorkspaceEventsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A specific gen lock ID for the events.
     */
    @JsonIgnore
    public Optional<String> generateGenLockId() {
        return generateGenLockId;
    }

    /**
     * Specified interaction type for events.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InteractionType> interactionType() {
        return (Optional<InteractionType>) interactionType;
    }

    /**
     * Unique identifier of the lint report digest.
     */
    @JsonIgnore
    public Optional<String> lintReportDigest() {
        return lintReportDigest;
    }

    /**
     * Unique identifier of the openapi diff report digest.
     */
    @JsonIgnore
    public Optional<String> openapiDiffReportDigest() {
        return openapiDiffReportDigest;
    }

    /**
     * Unique identifier of the source revision digest.
     */
    @JsonIgnore
    public Optional<String> sourceRevisionDigest() {
        return sourceRevisionDigest;
    }

    /**
     * Unique identifier of the workspace.
     */
    @JsonIgnore
    public Optional<String> workspaceID() {
        return workspaceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A specific gen lock ID for the events.
     */
    public SearchWorkspaceEventsRequest withGenerateGenLockId(String generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = Optional.ofNullable(generateGenLockId);
        return this;
    }

    /**
     * A specific gen lock ID for the events.
     */
    public SearchWorkspaceEventsRequest withGenerateGenLockId(Optional<String> generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = generateGenLockId;
        return this;
    }

    /**
     * Specified interaction type for events.
     */
    public SearchWorkspaceEventsRequest withInteractionType(InteractionType interactionType) {
        Utils.checkNotNull(interactionType, "interactionType");
        this.interactionType = Optional.ofNullable(interactionType);
        return this;
    }

    /**
     * Specified interaction type for events.
     */
    public SearchWorkspaceEventsRequest withInteractionType(Optional<? extends InteractionType> interactionType) {
        Utils.checkNotNull(interactionType, "interactionType");
        this.interactionType = interactionType;
        return this;
    }

    /**
     * Unique identifier of the lint report digest.
     */
    public SearchWorkspaceEventsRequest withLintReportDigest(String lintReportDigest) {
        Utils.checkNotNull(lintReportDigest, "lintReportDigest");
        this.lintReportDigest = Optional.ofNullable(lintReportDigest);
        return this;
    }

    /**
     * Unique identifier of the lint report digest.
     */
    public SearchWorkspaceEventsRequest withLintReportDigest(Optional<String> lintReportDigest) {
        Utils.checkNotNull(lintReportDigest, "lintReportDigest");
        this.lintReportDigest = lintReportDigest;
        return this;
    }

    /**
     * Unique identifier of the openapi diff report digest.
     */
    public SearchWorkspaceEventsRequest withOpenapiDiffReportDigest(String openapiDiffReportDigest) {
        Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
        this.openapiDiffReportDigest = Optional.ofNullable(openapiDiffReportDigest);
        return this;
    }

    /**
     * Unique identifier of the openapi diff report digest.
     */
    public SearchWorkspaceEventsRequest withOpenapiDiffReportDigest(Optional<String> openapiDiffReportDigest) {
        Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
        this.openapiDiffReportDigest = openapiDiffReportDigest;
        return this;
    }

    /**
     * Unique identifier of the source revision digest.
     */
    public SearchWorkspaceEventsRequest withSourceRevisionDigest(String sourceRevisionDigest) {
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        this.sourceRevisionDigest = Optional.ofNullable(sourceRevisionDigest);
        return this;
    }

    /**
     * Unique identifier of the source revision digest.
     */
    public SearchWorkspaceEventsRequest withSourceRevisionDigest(Optional<String> sourceRevisionDigest) {
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        this.sourceRevisionDigest = sourceRevisionDigest;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public SearchWorkspaceEventsRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public SearchWorkspaceEventsRequest withWorkspaceID(Optional<String> workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = workspaceID;
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
        SearchWorkspaceEventsRequest other = (SearchWorkspaceEventsRequest) o;
        return 
            Objects.deepEquals(this.generateGenLockId, other.generateGenLockId) &&
            Objects.deepEquals(this.interactionType, other.interactionType) &&
            Objects.deepEquals(this.lintReportDigest, other.lintReportDigest) &&
            Objects.deepEquals(this.openapiDiffReportDigest, other.openapiDiffReportDigest) &&
            Objects.deepEquals(this.sourceRevisionDigest, other.sourceRevisionDigest) &&
            Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            generateGenLockId,
            interactionType,
            lintReportDigest,
            openapiDiffReportDigest,
            sourceRevisionDigest,
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchWorkspaceEventsRequest.class,
                "generateGenLockId", generateGenLockId,
                "interactionType", interactionType,
                "lintReportDigest", lintReportDigest,
                "openapiDiffReportDigest", openapiDiffReportDigest,
                "sourceRevisionDigest", sourceRevisionDigest,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private Optional<String> generateGenLockId = Optional.empty();
 
        private Optional<? extends InteractionType> interactionType = Optional.empty();
 
        private Optional<String> lintReportDigest = Optional.empty();
 
        private Optional<String> openapiDiffReportDigest = Optional.empty();
 
        private Optional<String> sourceRevisionDigest = Optional.empty();
 
        private Optional<String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A specific gen lock ID for the events.
         */
        public Builder generateGenLockId(String generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = Optional.ofNullable(generateGenLockId);
            return this;
        }

        /**
         * A specific gen lock ID for the events.
         */
        public Builder generateGenLockId(Optional<String> generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = generateGenLockId;
            return this;
        }

        /**
         * Specified interaction type for events.
         */
        public Builder interactionType(InteractionType interactionType) {
            Utils.checkNotNull(interactionType, "interactionType");
            this.interactionType = Optional.ofNullable(interactionType);
            return this;
        }

        /**
         * Specified interaction type for events.
         */
        public Builder interactionType(Optional<? extends InteractionType> interactionType) {
            Utils.checkNotNull(interactionType, "interactionType");
            this.interactionType = interactionType;
            return this;
        }

        /**
         * Unique identifier of the lint report digest.
         */
        public Builder lintReportDigest(String lintReportDigest) {
            Utils.checkNotNull(lintReportDigest, "lintReportDigest");
            this.lintReportDigest = Optional.ofNullable(lintReportDigest);
            return this;
        }

        /**
         * Unique identifier of the lint report digest.
         */
        public Builder lintReportDigest(Optional<String> lintReportDigest) {
            Utils.checkNotNull(lintReportDigest, "lintReportDigest");
            this.lintReportDigest = lintReportDigest;
            return this;
        }

        /**
         * Unique identifier of the openapi diff report digest.
         */
        public Builder openapiDiffReportDigest(String openapiDiffReportDigest) {
            Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
            this.openapiDiffReportDigest = Optional.ofNullable(openapiDiffReportDigest);
            return this;
        }

        /**
         * Unique identifier of the openapi diff report digest.
         */
        public Builder openapiDiffReportDigest(Optional<String> openapiDiffReportDigest) {
            Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
            this.openapiDiffReportDigest = openapiDiffReportDigest;
            return this;
        }

        /**
         * Unique identifier of the source revision digest.
         */
        public Builder sourceRevisionDigest(String sourceRevisionDigest) {
            Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
            this.sourceRevisionDigest = Optional.ofNullable(sourceRevisionDigest);
            return this;
        }

        /**
         * Unique identifier of the source revision digest.
         */
        public Builder sourceRevisionDigest(Optional<String> sourceRevisionDigest) {
            Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
            this.sourceRevisionDigest = sourceRevisionDigest;
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceID(String workspaceID) {
            Utils.checkNotNull(workspaceID, "workspaceID");
            this.workspaceID = Optional.ofNullable(workspaceID);
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceID(Optional<String> workspaceID) {
            Utils.checkNotNull(workspaceID, "workspaceID");
            this.workspaceID = workspaceID;
            return this;
        }
        
        public SearchWorkspaceEventsRequest build() {
            return new SearchWorkspaceEventsRequest(
                generateGenLockId,
                interactionType,
                lintReportDigest,
                openapiDiffReportDigest,
                sourceRevisionDigest,
                workspaceID);
        }
    }
}

