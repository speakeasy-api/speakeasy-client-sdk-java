/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
/**
 * GithubGetActionResponse - response to a getting the latest action run on a GitHub request
 */

public class GithubGetActionResponse {

    /**
     * The status of the latest action run if available
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("run_status")
    private Optional<? extends String> runStatus;

    /**
     * The URL for latest action run if available
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("run_url")
    private Optional<? extends String> runUrl;

    @JsonCreator
    public GithubGetActionResponse(
            @JsonProperty("run_status") Optional<? extends String> runStatus,
            @JsonProperty("run_url") Optional<? extends String> runUrl) {
        Utils.checkNotNull(runStatus, "runStatus");
        Utils.checkNotNull(runUrl, "runUrl");
        this.runStatus = runStatus;
        this.runUrl = runUrl;
    }
    
    public GithubGetActionResponse() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The status of the latest action run if available
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> runStatus() {
        return (Optional<String>) runStatus;
    }

    /**
     * The URL for latest action run if available
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> runUrl() {
        return (Optional<String>) runUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The status of the latest action run if available
     */
    public GithubGetActionResponse withRunStatus(String runStatus) {
        Utils.checkNotNull(runStatus, "runStatus");
        this.runStatus = Optional.ofNullable(runStatus);
        return this;
    }

    /**
     * The status of the latest action run if available
     */
    public GithubGetActionResponse withRunStatus(Optional<? extends String> runStatus) {
        Utils.checkNotNull(runStatus, "runStatus");
        this.runStatus = runStatus;
        return this;
    }

    /**
     * The URL for latest action run if available
     */
    public GithubGetActionResponse withRunUrl(String runUrl) {
        Utils.checkNotNull(runUrl, "runUrl");
        this.runUrl = Optional.ofNullable(runUrl);
        return this;
    }

    /**
     * The URL for latest action run if available
     */
    public GithubGetActionResponse withRunUrl(Optional<? extends String> runUrl) {
        Utils.checkNotNull(runUrl, "runUrl");
        this.runUrl = runUrl;
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
        GithubGetActionResponse other = (GithubGetActionResponse) o;
        return 
            java.util.Objects.deepEquals(this.runStatus, other.runStatus) &&
            java.util.Objects.deepEquals(this.runUrl, other.runUrl);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            runStatus,
            runUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GithubGetActionResponse.class,
                "runStatus", runStatus,
                "runUrl", runUrl);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> runStatus = Optional.empty();
 
        private Optional<? extends String> runUrl = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The status of the latest action run if available
         */
        public Builder runStatus(String runStatus) {
            Utils.checkNotNull(runStatus, "runStatus");
            this.runStatus = Optional.ofNullable(runStatus);
            return this;
        }

        /**
         * The status of the latest action run if available
         */
        public Builder runStatus(Optional<? extends String> runStatus) {
            Utils.checkNotNull(runStatus, "runStatus");
            this.runStatus = runStatus;
            return this;
        }

        /**
         * The URL for latest action run if available
         */
        public Builder runUrl(String runUrl) {
            Utils.checkNotNull(runUrl, "runUrl");
            this.runUrl = Optional.ofNullable(runUrl);
            return this;
        }

        /**
         * The URL for latest action run if available
         */
        public Builder runUrl(Optional<? extends String> runUrl) {
            Utils.checkNotNull(runUrl, "runUrl");
            this.runUrl = runUrl;
            return this;
        }
        
        public GithubGetActionResponse build() {
            return new GithubGetActionResponse(
                runStatus,
                runUrl);
        }
    }
}

