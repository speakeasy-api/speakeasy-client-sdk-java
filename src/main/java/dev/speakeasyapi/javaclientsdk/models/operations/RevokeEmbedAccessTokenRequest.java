/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.speakeasyapi.javaclientsdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class RevokeEmbedAccessTokenRequest {

    /**
     * The ID of the EmbedToken to revoke.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tokenID")
    private String tokenID;

    @JsonCreator
    public RevokeEmbedAccessTokenRequest(
            String tokenID) {
        Utils.checkNotNull(tokenID, "tokenID");
        this.tokenID = tokenID;
    }

    /**
     * The ID of the EmbedToken to revoke.
     */
    @JsonIgnore
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
            Objects.deepEquals(this.tokenID, other.tokenID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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

