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


public class Secrets {

    @JsonProperty("api_key_configured")
    private boolean apiKeyConfigured;

    @JsonProperty("publishing_secrets_configured")
    private boolean publishingSecretsConfigured;

    @JsonCreator
    public Secrets(
            @JsonProperty("api_key_configured") boolean apiKeyConfigured,
            @JsonProperty("publishing_secrets_configured") boolean publishingSecretsConfigured) {
        Utils.checkNotNull(apiKeyConfigured, "apiKeyConfigured");
        Utils.checkNotNull(publishingSecretsConfigured, "publishingSecretsConfigured");
        this.apiKeyConfigured = apiKeyConfigured;
        this.publishingSecretsConfigured = publishingSecretsConfigured;
    }

    @JsonIgnore
    public boolean apiKeyConfigured() {
        return apiKeyConfigured;
    }

    @JsonIgnore
    public boolean publishingSecretsConfigured() {
        return publishingSecretsConfigured;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Secrets withApiKeyConfigured(boolean apiKeyConfigured) {
        Utils.checkNotNull(apiKeyConfigured, "apiKeyConfigured");
        this.apiKeyConfigured = apiKeyConfigured;
        return this;
    }

    public Secrets withPublishingSecretsConfigured(boolean publishingSecretsConfigured) {
        Utils.checkNotNull(publishingSecretsConfigured, "publishingSecretsConfigured");
        this.publishingSecretsConfigured = publishingSecretsConfigured;
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
        Secrets other = (Secrets) o;
        return 
            Objects.deepEquals(this.apiKeyConfigured, other.apiKeyConfigured) &&
            Objects.deepEquals(this.publishingSecretsConfigured, other.publishingSecretsConfigured);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKeyConfigured,
            publishingSecretsConfigured);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Secrets.class,
                "apiKeyConfigured", apiKeyConfigured,
                "publishingSecretsConfigured", publishingSecretsConfigured);
    }
    
    public final static class Builder {
 
        private Boolean apiKeyConfigured;
 
        private Boolean publishingSecretsConfigured;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKeyConfigured(boolean apiKeyConfigured) {
            Utils.checkNotNull(apiKeyConfigured, "apiKeyConfigured");
            this.apiKeyConfigured = apiKeyConfigured;
            return this;
        }

        public Builder publishingSecretsConfigured(boolean publishingSecretsConfigured) {
            Utils.checkNotNull(publishingSecretsConfigured, "publishingSecretsConfigured");
            this.publishingSecretsConfigured = publishingSecretsConfigured;
            return this;
        }
        
        public Secrets build() {
            return new Secrets(
                apiKeyConfigured,
                publishingSecretsConfigured);
        }
    }
}

