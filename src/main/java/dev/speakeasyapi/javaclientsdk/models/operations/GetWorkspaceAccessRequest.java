/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetWorkspaceAccessRequest {

    /**
     * Unique identifier of the generation target.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=genLockId")
    private Optional<String> genLockId;

    /**
     * Skip side-effects like incrementing metrics.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=passive")
    private Optional<Boolean> passive;

    /**
     * The type of the generated target.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=targetType")
    private Optional<String> targetType;

    @JsonCreator
    public GetWorkspaceAccessRequest(
            Optional<String> genLockId,
            Optional<Boolean> passive,
            Optional<String> targetType) {
        Utils.checkNotNull(genLockId, "genLockId");
        Utils.checkNotNull(passive, "passive");
        Utils.checkNotNull(targetType, "targetType");
        this.genLockId = genLockId;
        this.passive = passive;
        this.targetType = targetType;
    }
    
    public GetWorkspaceAccessRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier of the generation target.
     */
    @JsonIgnore
    public Optional<String> genLockId() {
        return genLockId;
    }

    /**
     * Skip side-effects like incrementing metrics.
     */
    @JsonIgnore
    public Optional<Boolean> passive() {
        return passive;
    }

    /**
     * The type of the generated target.
     */
    @JsonIgnore
    public Optional<String> targetType() {
        return targetType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the generation target.
     */
    public GetWorkspaceAccessRequest withGenLockId(String genLockId) {
        Utils.checkNotNull(genLockId, "genLockId");
        this.genLockId = Optional.ofNullable(genLockId);
        return this;
    }

    /**
     * Unique identifier of the generation target.
     */
    public GetWorkspaceAccessRequest withGenLockId(Optional<String> genLockId) {
        Utils.checkNotNull(genLockId, "genLockId");
        this.genLockId = genLockId;
        return this;
    }

    /**
     * Skip side-effects like incrementing metrics.
     */
    public GetWorkspaceAccessRequest withPassive(boolean passive) {
        Utils.checkNotNull(passive, "passive");
        this.passive = Optional.ofNullable(passive);
        return this;
    }

    /**
     * Skip side-effects like incrementing metrics.
     */
    public GetWorkspaceAccessRequest withPassive(Optional<Boolean> passive) {
        Utils.checkNotNull(passive, "passive");
        this.passive = passive;
        return this;
    }

    /**
     * The type of the generated target.
     */
    public GetWorkspaceAccessRequest withTargetType(String targetType) {
        Utils.checkNotNull(targetType, "targetType");
        this.targetType = Optional.ofNullable(targetType);
        return this;
    }

    /**
     * The type of the generated target.
     */
    public GetWorkspaceAccessRequest withTargetType(Optional<String> targetType) {
        Utils.checkNotNull(targetType, "targetType");
        this.targetType = targetType;
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
        GetWorkspaceAccessRequest other = (GetWorkspaceAccessRequest) o;
        return 
            Objects.deepEquals(this.genLockId, other.genLockId) &&
            Objects.deepEquals(this.passive, other.passive) &&
            Objects.deepEquals(this.targetType, other.targetType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            genLockId,
            passive,
            targetType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceAccessRequest.class,
                "genLockId", genLockId,
                "passive", passive,
                "targetType", targetType);
    }
    
    public final static class Builder {
 
        private Optional<String> genLockId = Optional.empty();
 
        private Optional<Boolean> passive = Optional.empty();
 
        private Optional<String> targetType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the generation target.
         */
        public Builder genLockId(String genLockId) {
            Utils.checkNotNull(genLockId, "genLockId");
            this.genLockId = Optional.ofNullable(genLockId);
            return this;
        }

        /**
         * Unique identifier of the generation target.
         */
        public Builder genLockId(Optional<String> genLockId) {
            Utils.checkNotNull(genLockId, "genLockId");
            this.genLockId = genLockId;
            return this;
        }

        /**
         * Skip side-effects like incrementing metrics.
         */
        public Builder passive(boolean passive) {
            Utils.checkNotNull(passive, "passive");
            this.passive = Optional.ofNullable(passive);
            return this;
        }

        /**
         * Skip side-effects like incrementing metrics.
         */
        public Builder passive(Optional<Boolean> passive) {
            Utils.checkNotNull(passive, "passive");
            this.passive = passive;
            return this;
        }

        /**
         * The type of the generated target.
         */
        public Builder targetType(String targetType) {
            Utils.checkNotNull(targetType, "targetType");
            this.targetType = Optional.ofNullable(targetType);
            return this;
        }

        /**
         * The type of the generated target.
         */
        public Builder targetType(Optional<String> targetType) {
            Utils.checkNotNull(targetType, "targetType");
            this.targetType = targetType;
            return this;
        }
        
        public GetWorkspaceAccessRequest build() {
            return new GetWorkspaceAccessRequest(
                genLockId,
                passive,
                targetType);
        }
    }
}

