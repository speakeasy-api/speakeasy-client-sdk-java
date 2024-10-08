/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class Security {

    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=x-api-key")
    private Optional<String> apiKey;

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    private Optional<String> bearer;

    @JsonCreator
    public Security(
            Optional<String> apiKey,
            Optional<String> bearer) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(bearer, "bearer");
        this.apiKey = apiKey;
        this.bearer = bearer;
    }
    
    public Security() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Optional<String> bearer() {
        return bearer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Security withAPIKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = Optional.ofNullable(apiKey);
        return this;
    }

    public Security withAPIKey(Optional<String> apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public Security withBearer(String bearer) {
        Utils.checkNotNull(bearer, "bearer");
        this.bearer = Optional.ofNullable(bearer);
        return this;
    }

    public Security withBearer(Optional<String> bearer) {
        Utils.checkNotNull(bearer, "bearer");
        this.bearer = bearer;
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
        Security other = (Security) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.bearer, other.bearer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            bearer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Security.class,
                "apiKey", apiKey,
                "bearer", bearer);
    }
    
    public final static class Builder {
 
        private Optional<String> apiKey = Optional.empty();
 
        private Optional<String> bearer = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = Optional.ofNullable(apiKey);
            return this;
        }

        public Builder apiKey(Optional<String> apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder bearer(String bearer) {
            Utils.checkNotNull(bearer, "bearer");
            this.bearer = Optional.ofNullable(bearer);
            return this;
        }

        public Builder bearer(Optional<String> bearer) {
            Utils.checkNotNull(bearer, "bearer");
            this.bearer = bearer;
            return this;
        }
        
        public Security build() {
            return new Security(
                apiKey,
                bearer);
        }
    }
}

