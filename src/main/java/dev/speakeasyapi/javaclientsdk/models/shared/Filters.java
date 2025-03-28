/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.speakeasyapi.javaclientsdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
/**
 * Filters - Filters are used to query requests.
 */

public class Filters {

    /**
     * A list of filters to apply to the query.
     */
    @JsonProperty("filters")
    private List<Filter> filters;

    /**
     * The maximum number of results to return.
     */
    @JsonProperty("limit")
    private long limit;

    /**
     * The offset to start the query from.
     */
    @JsonProperty("offset")
    private long offset;

    /**
     * The operator to use when combining filters.
     */
    @JsonProperty("operator")
    private String operator;

    @JsonCreator
    public Filters(
            @JsonProperty("filters") List<Filter> filters,
            @JsonProperty("limit") long limit,
            @JsonProperty("offset") long offset,
            @JsonProperty("operator") String operator) {
        Utils.checkNotNull(filters, "filters");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(operator, "operator");
        this.filters = filters;
        this.limit = limit;
        this.offset = offset;
        this.operator = operator;
    }

    /**
     * A list of filters to apply to the query.
     */
    @JsonIgnore
    public List<Filter> filters() {
        return filters;
    }

    /**
     * The maximum number of results to return.
     */
    @JsonIgnore
    public long limit() {
        return limit;
    }

    /**
     * The offset to start the query from.
     */
    @JsonIgnore
    public long offset() {
        return offset;
    }

    /**
     * The operator to use when combining filters.
     */
    @JsonIgnore
    public String operator() {
        return operator;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of filters to apply to the query.
     */
    public Filters withFilters(List<Filter> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
        return this;
    }

    /**
     * The maximum number of results to return.
     */
    public Filters withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * The offset to start the query from.
     */
    public Filters withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * The operator to use when combining filters.
     */
    public Filters withOperator(String operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
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
        Filters other = (Filters) o;
        return 
            Objects.deepEquals(this.filters, other.filters) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.operator, other.operator);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            filters,
            limit,
            offset,
            operator);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Filters.class,
                "filters", filters,
                "limit", limit,
                "offset", offset,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private List<Filter> filters;
 
        private Long limit;
 
        private Long offset;
 
        private String operator;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of filters to apply to the query.
         */
        public Builder filters(List<Filter> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = filters;
            return this;
        }

        /**
         * The maximum number of results to return.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * The offset to start the query from.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * The operator to use when combining filters.
         */
        public Builder operator(String operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }
        
        public Filters build() {
            return new Filters(
                filters,
                limit,
                offset,
                operator);
        }
    }
}

