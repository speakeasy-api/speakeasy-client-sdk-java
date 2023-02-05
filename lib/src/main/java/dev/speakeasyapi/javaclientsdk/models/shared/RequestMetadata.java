package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestMetadata
 * Key-Value pairs associated with a request
**/
public class RequestMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;
    public RequestMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public RequestMetadata withValue(String value) {
        this.value = value;
        return this;
    }
}
