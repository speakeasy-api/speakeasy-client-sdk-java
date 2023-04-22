/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionMetadataInput - A set of keys and associated values, attached to a particular version of an Api.
 */
public class VersionMetadataInput {
    /**
     * The key for this metadata.
     */
    @JsonProperty("meta_key")
    public String metaKey;
    public VersionMetadataInput withMetaKey(String metaKey) {
        this.metaKey = metaKey;
        return this;
    }
    
    /**
     * One of the values for this metadata.
     */
    @JsonProperty("meta_value")
    public String metaValue;
    public VersionMetadataInput withMetaValue(String metaValue) {
        this.metaValue = metaValue;
        return this;
    }
    

    public VersionMetadataInput(@JsonProperty("meta_key") String metaKey, @JsonProperty("meta_value") String metaValue) {
    this.metaKey = metaKey;
this.metaValue = metaValue;
  }
}
