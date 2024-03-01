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

/**
 * EmbedAccessTokenResponse - An EmbedAccessTokenResponse contains a token that can be used to embed a Speakeasy dashboard.
 */

public class EmbedAccessTokenResponse {

    @JsonProperty("access_token")
    private String accessToken;

    public EmbedAccessTokenResponse(
            @JsonProperty("access_token") String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
    }

    public String accessToken() {
        return accessToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EmbedAccessTokenResponse withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
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
        EmbedAccessTokenResponse other = (EmbedAccessTokenResponse) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmbedAccessTokenResponse.class,
                "accessToken", accessToken);
    }
    
    public final static class Builder {
 
        private String accessToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public EmbedAccessTokenResponse build() {
            return new EmbedAccessTokenResponse(
                accessToken);
        }
    }
}

