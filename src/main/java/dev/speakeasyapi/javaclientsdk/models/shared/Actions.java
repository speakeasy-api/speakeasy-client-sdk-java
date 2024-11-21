/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Actions {

    @JsonProperty("generation_action_configured")
    private boolean generationActionConfigured;

    @JsonProperty("publish_action_configured")
    private boolean publishActionConfigured;

    @JsonCreator
    public Actions(
            @JsonProperty("generation_action_configured") boolean generationActionConfigured,
            @JsonProperty("publish_action_configured") boolean publishActionConfigured) {
        Utils.checkNotNull(generationActionConfigured, "generationActionConfigured");
        Utils.checkNotNull(publishActionConfigured, "publishActionConfigured");
        this.generationActionConfigured = generationActionConfigured;
        this.publishActionConfigured = publishActionConfigured;
    }

    @JsonIgnore
    public boolean generationActionConfigured() {
        return generationActionConfigured;
    }

    @JsonIgnore
    public boolean publishActionConfigured() {
        return publishActionConfigured;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Actions withGenerationActionConfigured(boolean generationActionConfigured) {
        Utils.checkNotNull(generationActionConfigured, "generationActionConfigured");
        this.generationActionConfigured = generationActionConfigured;
        return this;
    }

    public Actions withPublishActionConfigured(boolean publishActionConfigured) {
        Utils.checkNotNull(publishActionConfigured, "publishActionConfigured");
        this.publishActionConfigured = publishActionConfigured;
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
        Actions other = (Actions) o;
        return 
            Objects.deepEquals(this.generationActionConfigured, other.generationActionConfigured) &&
            Objects.deepEquals(this.publishActionConfigured, other.publishActionConfigured);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            generationActionConfigured,
            publishActionConfigured);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Actions.class,
                "generationActionConfigured", generationActionConfigured,
                "publishActionConfigured", publishActionConfigured);
    }
    
    public final static class Builder {
 
        private Boolean generationActionConfigured;
 
        private Boolean publishActionConfigured;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder generationActionConfigured(boolean generationActionConfigured) {
            Utils.checkNotNull(generationActionConfigured, "generationActionConfigured");
            this.generationActionConfigured = generationActionConfigured;
            return this;
        }

        public Builder publishActionConfigured(boolean publishActionConfigured) {
            Utils.checkNotNull(publishActionConfigured, "publishActionConfigured");
            this.publishActionConfigured = publishActionConfigured;
            return this;
        }
        
        public Actions build() {
            return new Actions(
                generationActionConfigured,
                publishActionConfigured);
        }
    }
}

