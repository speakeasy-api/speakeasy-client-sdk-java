/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;

/**
 * QueryParamOp - Configuration for filter operations
 */

public class QueryParamOp {

    /**
     * Whether to AND or OR the filters
     */
    @SpeakeasyMetadata("queryParam:name=and")
    private boolean and;

    public QueryParamOp(
            boolean and) {
        Utils.checkNotNull(and, "and");
        this.and = and;
    }

    /**
     * Whether to AND or OR the filters
     */
    public boolean and() {
        return and;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether to AND or OR the filters
     */
    public QueryParamOp withAnd(boolean and) {
        Utils.checkNotNull(and, "and");
        this.and = and;
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
        QueryParamOp other = (QueryParamOp) o;
        return 
            java.util.Objects.deepEquals(this.and, other.and);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            and);
    }
    
    @Override
    public String toString() {
        return Utils.toString(QueryParamOp.class,
                "and", and);
    }
    
    public final static class Builder {
 
        private Boolean and;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether to AND or OR the filters
         */
        public Builder and(boolean and) {
            Utils.checkNotNull(and, "and");
            this.and = and;
            return this;
        }        
        
        public QueryParamOp build() {
            return new QueryParamOp(
                and);
        }
    }
}
