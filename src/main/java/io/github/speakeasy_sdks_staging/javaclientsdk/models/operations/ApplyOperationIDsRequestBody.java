/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ApplyOperationIDsRequestBody - Apply options
 */

public class ApplyOperationIDsRequestBody {

    /**
     * Whether to apply the suggestions as an overlay or replace the existing operationIDs. Default: false
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("as_overlay")
    private Optional<Boolean> asOverlay;

    @JsonCreator
    public ApplyOperationIDsRequestBody(
            @JsonProperty("as_overlay") Optional<Boolean> asOverlay) {
        Utils.checkNotNull(asOverlay, "asOverlay");
        this.asOverlay = asOverlay;
    }
    
    public ApplyOperationIDsRequestBody() {
        this(Optional.empty());
    }

    /**
     * Whether to apply the suggestions as an overlay or replace the existing operationIDs. Default: false
     */
    @JsonIgnore
    public Optional<Boolean> asOverlay() {
        return asOverlay;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether to apply the suggestions as an overlay or replace the existing operationIDs. Default: false
     */
    public ApplyOperationIDsRequestBody withAsOverlay(boolean asOverlay) {
        Utils.checkNotNull(asOverlay, "asOverlay");
        this.asOverlay = Optional.ofNullable(asOverlay);
        return this;
    }

    /**
     * Whether to apply the suggestions as an overlay or replace the existing operationIDs. Default: false
     */
    public ApplyOperationIDsRequestBody withAsOverlay(Optional<Boolean> asOverlay) {
        Utils.checkNotNull(asOverlay, "asOverlay");
        this.asOverlay = asOverlay;
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
        ApplyOperationIDsRequestBody other = (ApplyOperationIDsRequestBody) o;
        return 
            Objects.deepEquals(this.asOverlay, other.asOverlay);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            asOverlay);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplyOperationIDsRequestBody.class,
                "asOverlay", asOverlay);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> asOverlay = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether to apply the suggestions as an overlay or replace the existing operationIDs. Default: false
         */
        public Builder asOverlay(boolean asOverlay) {
            Utils.checkNotNull(asOverlay, "asOverlay");
            this.asOverlay = Optional.ofNullable(asOverlay);
            return this;
        }

        /**
         * Whether to apply the suggestions as an overlay or replace the existing operationIDs. Default: false
         */
        public Builder asOverlay(Optional<Boolean> asOverlay) {
            Utils.checkNotNull(asOverlay, "asOverlay");
            this.asOverlay = asOverlay;
            return this;
        }
        
        public ApplyOperationIDsRequestBody build() {
            return new ApplyOperationIDsRequestBody(
                asOverlay);
        }
    }
}
