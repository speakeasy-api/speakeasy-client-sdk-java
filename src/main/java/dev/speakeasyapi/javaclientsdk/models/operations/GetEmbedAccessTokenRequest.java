/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class GetEmbedAccessTokenRequest {

    /**
     * The description of the embed access token.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=description")
    private Optional<String> description;

    /**
     * The duration (in minutes) of the embed access token.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=duration")
    private Optional<Long> duration;

    /**
     * The filter to apply to the query.
     */
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    private Optional<? extends Filters> filters;

    @JsonCreator
    public GetEmbedAccessTokenRequest(
            Optional<String> description,
            Optional<Long> duration,
            Optional<? extends Filters> filters) {
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
    public Optional<String> description() {
        return description;
    }

    /**
     * The duration (in minutes) of the embed access token.
     */
    @JsonIgnore
    public Optional<Long> duration() {
        return duration;
    }

    /**
     * The filter to apply to the query.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Filters> filters() {
        return (Optional<Filters>) filters;
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
    public GetEmbedAccessTokenRequest withDescription(Optional<String> description) {
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
    public GetEmbedAccessTokenRequest withDuration(Optional<Long> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    /**
     * The filter to apply to the query.
     */
    public GetEmbedAccessTokenRequest withFilters(Filters filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = Optional.ofNullable(filters);
        return this;
    }

    /**
     * The filter to apply to the query.
     */
    public GetEmbedAccessTokenRequest withFilters(Optional<? extends Filters> filters) {
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
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.filters, other.filters);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Long> duration = Optional.empty();
 
        private Optional<? extends Filters> filters = Optional.empty();  
        
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
        public Builder description(Optional<String> description) {
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
        public Builder duration(Optional<Long> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        /**
         * The filter to apply to the query.
         */
        public Builder filters(Filters filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = Optional.ofNullable(filters);
            return this;
        }

        /**
         * The filter to apply to the query.
         */
        public Builder filters(Optional<? extends Filters> filters) {
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
