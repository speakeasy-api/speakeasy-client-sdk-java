/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * SchemaDiff - A SchemaDiff represents a diff of two Schemas.
 */

public class SchemaDiff {

    /**
     * Holds every addition change in the diff.
     */
    @JsonProperty("additions")
    private java.util.List<String> additions;

    /**
     * Holds every deletion change in the diff.
     */
    @JsonProperty("deletions")
    private java.util.List<String> deletions;

    /**
     * Holds every modification change in the diff.
     */
    @JsonProperty("modifications")
    private java.util.Map<String, ValueChange> modifications;

    @JsonCreator
    public SchemaDiff(
            @JsonProperty("additions") java.util.List<String> additions,
            @JsonProperty("deletions") java.util.List<String> deletions,
            @JsonProperty("modifications") java.util.Map<String, ValueChange> modifications) {
        Utils.checkNotNull(additions, "additions");
        Utils.checkNotNull(deletions, "deletions");
        modifications = Utils.emptyMapIfNull(modifications);
        this.additions = additions;
        this.deletions = deletions;
        this.modifications = modifications;
    }

    /**
     * Holds every addition change in the diff.
     */
    @JsonIgnore
    public java.util.List<String> additions() {
        return additions;
    }

    /**
     * Holds every deletion change in the diff.
     */
    @JsonIgnore
    public java.util.List<String> deletions() {
        return deletions;
    }

    /**
     * Holds every modification change in the diff.
     */
    @JsonIgnore
    public java.util.Map<String, ValueChange> modifications() {
        return modifications;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Holds every addition change in the diff.
     */
    public SchemaDiff withAdditions(java.util.List<String> additions) {
        Utils.checkNotNull(additions, "additions");
        this.additions = additions;
        return this;
    }

    /**
     * Holds every deletion change in the diff.
     */
    public SchemaDiff withDeletions(java.util.List<String> deletions) {
        Utils.checkNotNull(deletions, "deletions");
        this.deletions = deletions;
        return this;
    }

    /**
     * Holds every modification change in the diff.
     */
    public SchemaDiff withModifications(java.util.Map<String, ValueChange> modifications) {
        Utils.checkNotNull(modifications, "modifications");
        this.modifications = modifications;
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
        SchemaDiff other = (SchemaDiff) o;
        return 
            java.util.Objects.deepEquals(this.additions, other.additions) &&
            java.util.Objects.deepEquals(this.deletions, other.deletions) &&
            java.util.Objects.deepEquals(this.modifications, other.modifications);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            additions,
            deletions,
            modifications);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SchemaDiff.class,
                "additions", additions,
                "deletions", deletions,
                "modifications", modifications);
    }
    
    public final static class Builder {
 
        private java.util.List<String> additions;
 
        private java.util.List<String> deletions;
 
        private java.util.Map<String, ValueChange> modifications;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Holds every addition change in the diff.
         */
        public Builder additions(java.util.List<String> additions) {
            Utils.checkNotNull(additions, "additions");
            this.additions = additions;
            return this;
        }

        /**
         * Holds every deletion change in the diff.
         */
        public Builder deletions(java.util.List<String> deletions) {
            Utils.checkNotNull(deletions, "deletions");
            this.deletions = deletions;
            return this;
        }

        /**
         * Holds every modification change in the diff.
         */
        public Builder modifications(java.util.Map<String, ValueChange> modifications) {
            Utils.checkNotNull(modifications, "modifications");
            this.modifications = modifications;
            return this;
        }
        
        public SchemaDiff build() {
            return new SchemaDiff(
                additions,
                deletions,
                modifications);
        }
    }
}

