/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class GetEmbedAccessTokenRequest {

    /**
     * The description of the embed access token.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=description")
    private Optional<? extends String> description;

    /**
     * The duration (in minutes) of the embed access token.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=duration")
    private Optional<? extends Long> duration;

    /**
     * The filter to apply to the query.
     */
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters> filters;

    @JsonCreator
    public GetEmbedAccessTokenRequest(
            Optional<? extends String> description,
            Optional<? extends Long> duration,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters> filters) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(filters, "filters");
        this.description = description;
        this.duration = duration;
        this.filters = filters;
    }
    
    public GetEmbedAccessTokenRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The description of the embed access token.
     */
    @JsonIgnore
    public Optional<? extends String> description() {
        return description;
    }

    /**
     * The duration (in minutes) of the embed access token.
     */
    @JsonIgnore
    public Optional<? extends Long> duration() {
        return duration;
    }

    /**
     * The filter to apply to the query.
     */
    @JsonIgnore
    public Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters> filters() {
        return filters;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The description of the embed access token.
     */
    public GetEmbedAccessTokenRequest withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the embed access token.
     */
    public GetEmbedAccessTokenRequest withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The duration (in minutes) of the embed access token.
     */
    public GetEmbedAccessTokenRequest withDuration(long duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    /**
     * The duration (in minutes) of the embed access token.
     */
    public GetEmbedAccessTokenRequest withDuration(Optional<? extends Long> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    /**
     * The filter to apply to the query.
     */
    public GetEmbedAccessTokenRequest withFilters(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = Optional.ofNullable(filters);
        return this;
    }

    /**
     * The filter to apply to the query.
     */
    public GetEmbedAccessTokenRequest withFilters(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
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
        GetEmbedAccessTokenRequest other = (GetEmbedAccessTokenRequest) o;
        return 
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.duration, other.duration) &&
            java.util.Objects.deepEquals(this.filters, other.filters);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            description,
            duration,
            filters);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEmbedAccessTokenRequest.class,
                "description", description,
                "duration", duration,
                "filters", filters);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends Long> duration = Optional.empty();
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters> filters = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The description of the embed access token.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * The description of the embed access token.
         */
        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The duration (in minutes) of the embed access token.
         */
        public Builder duration(long duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        /**
         * The duration (in minutes) of the embed access token.
         */
        public Builder duration(Optional<? extends Long> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        /**
         * The filter to apply to the query.
         */
        public Builder filters(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = Optional.ofNullable(filters);
            return this;
        }

        /**
         * The filter to apply to the query.
         */
        public Builder filters(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Filters> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = filters;
            return this;
        }
        
        public GetEmbedAccessTokenRequest build() {
            return new GetEmbedAccessTokenRequest(
                description,
                duration,
                filters);
        }
    }
}

