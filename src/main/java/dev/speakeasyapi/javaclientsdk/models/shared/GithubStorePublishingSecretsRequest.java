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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * GithubStorePublishingSecretsRequest - A request to store publishing secrets for a github target
 */

public class GithubStorePublishingSecretsRequest {

    /**
     * The generation lock ID
     */
    @JsonProperty("generate_gen_lock_id")
    private String generateGenLockId;

    /**
     * A map of secrets to store in the GitHub target
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secrets")
    private Optional<? extends Map<String, String>> secrets;

    @JsonCreator
    public GithubStorePublishingSecretsRequest(
            @JsonProperty("generate_gen_lock_id") String generateGenLockId,
            @JsonProperty("secrets") Optional<? extends Map<String, String>> secrets) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        Utils.checkNotNull(secrets, "secrets");
        this.generateGenLockId = generateGenLockId;
        this.secrets = secrets;
    }
    
    public GithubStorePublishingSecretsRequest(
            String generateGenLockId) {
        this(generateGenLockId, Optional.empty());
    }

    /**
     * The generation lock ID
     */
    @JsonIgnore
    public String generateGenLockId() {
        return generateGenLockId;
    }

    /**
     * A map of secrets to store in the GitHub target
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> secrets() {
        return (Optional<Map<String, String>>) secrets;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The generation lock ID
     */
    public GithubStorePublishingSecretsRequest withGenerateGenLockId(String generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = generateGenLockId;
        return this;
    }

    /**
     * A map of secrets to store in the GitHub target
     */
    public GithubStorePublishingSecretsRequest withSecrets(Map<String, String> secrets) {
        Utils.checkNotNull(secrets, "secrets");
        this.secrets = Optional.ofNullable(secrets);
        return this;
    }

    /**
     * A map of secrets to store in the GitHub target
     */
    public GithubStorePublishingSecretsRequest withSecrets(Optional<? extends Map<String, String>> secrets) {
        Utils.checkNotNull(secrets, "secrets");
        this.secrets = secrets;
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
        GithubStorePublishingSecretsRequest other = (GithubStorePublishingSecretsRequest) o;
        return 
            Objects.deepEquals(this.generateGenLockId, other.generateGenLockId) &&
            Objects.deepEquals(this.secrets, other.secrets);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            generateGenLockId,
            secrets);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GithubStorePublishingSecretsRequest.class,
                "generateGenLockId", generateGenLockId,
                "secrets", secrets);
    }
    
    public final static class Builder {
 
        private String generateGenLockId;
 
        private Optional<? extends Map<String, String>> secrets = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The generation lock ID
         */
        public Builder generateGenLockId(String generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = generateGenLockId;
            return this;
        }

        /**
         * A map of secrets to store in the GitHub target
         */
        public Builder secrets(Map<String, String> secrets) {
            Utils.checkNotNull(secrets, "secrets");
            this.secrets = Optional.ofNullable(secrets);
            return this;
        }

        /**
         * A map of secrets to store in the GitHub target
         */
        public Builder secrets(Optional<? extends Map<String, String>> secrets) {
            Utils.checkNotNull(secrets, "secrets");
            this.secrets = secrets;
            return this;
        }
        
        public GithubStorePublishingSecretsRequest build() {
            return new GithubStorePublishingSecretsRequest(
                generateGenLockId,
                secrets);
        }
    }
}

