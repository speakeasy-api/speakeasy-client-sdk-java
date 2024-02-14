/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AccessDetails {
    @JsonProperty("generation_allowed")
    public Boolean generationAllowed;

    public AccessDetails withGenerationAllowed(Boolean generationAllowed) {
        this.generationAllowed = generationAllowed;
        return this;
    }
    
    public AccessDetails(@JsonProperty("generation_allowed") Boolean generationAllowed) {
        this.generationAllowed = generationAllowed;
  }
}