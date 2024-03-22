/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * AccessToken - An AccessToken is a token that can be used to authenticate with the Speakeasy API.
 */

public class AccessToken {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("claims")
    private Claims claims;

    @JsonProperty("user")
    private AccessTokenUser user;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workspaces")
    private Optional<? extends java.util.List<Workspaces>> workspaces;

    public AccessToken(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("claims") Claims claims,
            @JsonProperty("user") AccessTokenUser user,
            @JsonProperty("workspaces") Optional<? extends java.util.List<Workspaces>> workspaces) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(claims, "claims");
        Utils.checkNotNull(user, "user");
        Utils.checkNotNull(workspaces, "workspaces");
        this.accessToken = accessToken;
        this.claims = claims;
        this.user = user;
        this.workspaces = workspaces;
    }

    public String accessToken() {
        return accessToken;
    }

    public Claims claims() {
        return claims;
    }

    public AccessTokenUser user() {
        return user;
    }

    public Optional<? extends java.util.List<Workspaces>> workspaces() {
        return workspaces;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccessToken withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    public AccessToken withClaims(Claims claims) {
        Utils.checkNotNull(claims, "claims");
        this.claims = claims;
        return this;
    }

    public AccessToken withUser(AccessTokenUser user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
        return this;
    }

    public AccessToken withWorkspaces(java.util.List<Workspaces> workspaces) {
        Utils.checkNotNull(workspaces, "workspaces");
        this.workspaces = Optional.ofNullable(workspaces);
        return this;
    }

    public AccessToken withWorkspaces(Optional<? extends java.util.List<Workspaces>> workspaces) {
        Utils.checkNotNull(workspaces, "workspaces");
        this.workspaces = workspaces;
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
        AccessToken other = (AccessToken) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.claims, other.claims) &&
            java.util.Objects.deepEquals(this.user, other.user) &&
            java.util.Objects.deepEquals(this.workspaces, other.workspaces);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            claims,
            user,
            workspaces);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccessToken.class,
                "accessToken", accessToken,
                "claims", claims,
                "user", user,
                "workspaces", workspaces);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Claims claims;
 
        private AccessTokenUser user;
 
        private Optional<? extends java.util.List<Workspaces>> workspaces = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        public Builder claims(Claims claims) {
            Utils.checkNotNull(claims, "claims");
            this.claims = claims;
            return this;
        }

        public Builder user(AccessTokenUser user) {
            Utils.checkNotNull(user, "user");
            this.user = user;
            return this;
        }

        public Builder workspaces(java.util.List<Workspaces> workspaces) {
            Utils.checkNotNull(workspaces, "workspaces");
            this.workspaces = Optional.ofNullable(workspaces);
            return this;
        }

        public Builder workspaces(Optional<? extends java.util.List<Workspaces>> workspaces) {
            Utils.checkNotNull(workspaces, "workspaces");
            this.workspaces = workspaces;
            return this;
        }
        
        public AccessToken build() {
            return new AccessToken(
                accessToken,
                claims,
                user,
                workspaces);
        }
    }
}

