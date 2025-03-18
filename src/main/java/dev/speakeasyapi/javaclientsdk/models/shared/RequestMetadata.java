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
import java.util.Objects;
import java.util.Optional;
/**
 * RequestMetadata - Key-Value pairs associated with a request
 */

public class RequestMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<String> value;

    @JsonCreator
    public RequestMetadata(
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("value") Optional<String> value) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(value, "value");
        this.key = key;
        this.value = value;
    }
    
    public RequestMetadata() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RequestMetadata withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public RequestMetadata withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public RequestMetadata withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public RequestMetadata withValue(Optional<String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        RequestMetadata other = (RequestMetadata) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestMetadata.class,
                "key", key,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public RequestMetadata build() {
            return new RequestMetadata(
                key,
                value);
        }
    }
}

