/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class GetNamespacesResponse {

    @JsonProperty("items")
    private java.util.List<Namespace> items;

    public GetNamespacesResponse(
            @JsonProperty("items") java.util.List<Namespace> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }

    public java.util.List<Namespace> items() {
        return items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetNamespacesResponse withItems(java.util.List<Namespace> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
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
        GetNamespacesResponse other = (GetNamespacesResponse) o;
        return 
            java.util.Objects.deepEquals(this.items, other.items);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            items);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetNamespacesResponse.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private java.util.List<Namespace> items;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder items(java.util.List<Namespace> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public GetNamespacesResponse build() {
            return new GetNamespacesResponse(
                items);
        }
    }
}
