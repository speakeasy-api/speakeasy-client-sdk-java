/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SchemaDiff - A SchemaDiff represents a diff of two Schemas.
 */

public class SchemaDiff {
    /**
     * Holds every addition change in the diff.
     */
    @JsonProperty("additions")
    public String[] additions;

    public SchemaDiff withAdditions(String[] additions) {
        this.additions = additions;
        return this;
    }
    
    /**
     * Holds every deletion change in the diff.
     */
    @JsonProperty("deletions")
    public String[] deletions;

    public SchemaDiff withDeletions(String[] deletions) {
        this.deletions = deletions;
        return this;
    }
    
    /**
     * Holds every modification change in the diff.
     */
    @JsonProperty("modifications")
    public java.util.Map<String, ValueChange> modifications;

    public SchemaDiff withModifications(java.util.Map<String, ValueChange> modifications) {
        this.modifications = modifications;
        return this;
    }
    
    public SchemaDiff(@JsonProperty("additions") String[] additions, @JsonProperty("deletions") String[] deletions, @JsonProperty("modifications") java.util.Map<String, ValueChange> modifications) {
        this.additions = additions;
        this.deletions = deletions;
        this.modifications = modifications;
  }
}