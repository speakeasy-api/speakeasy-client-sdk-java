/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class RevokeEmbedAccessTokenRequest {

    /**
     * The ID of the EmbedToken to revoke.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tokenID")
    private String tokenID;

    public RevokeEmbedAccessTokenRequest(
            String tokenID) {
        Utils.checkNotNull(tokenID, "tokenID");
        this.tokenID = tokenID;
    }

    /**
     * The ID of the EmbedToken to revoke.
     */
    public String tokenID() {
        return tokenID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the EmbedToken to revoke.
     */
    public RevokeEmbedAccessTokenRequest withTokenID(String tokenID) {
        Utils.checkNotNull(tokenID, "tokenID");
        this.tokenID = tokenID;
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
        RevokeEmbedAccessTokenRequest other = (RevokeEmbedAccessTokenRequest) o;
        return 
            java.util.Objects.deepEquals(this.tokenID, other.tokenID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            tokenID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RevokeEmbedAccessTokenRequest.class,
                "tokenID", tokenID);
    }
    
    public final static class Builder {
 
        private String tokenID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the EmbedToken to revoke.
         */
        public Builder tokenID(String tokenID) {
            Utils.checkNotNull(tokenID, "tokenID");
            this.tokenID = tokenID;
            return this;
        }
        
        public RevokeEmbedAccessTokenRequest build() {
            return new RevokeEmbedAccessTokenRequest(
                tokenID);
        }
    }
}

