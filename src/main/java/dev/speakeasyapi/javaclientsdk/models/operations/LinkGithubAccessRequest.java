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
import java.util.Optional;


public class LinkGithubAccessRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=github_oidc_token")
    private Optional<String> githubOidcToken;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=installation_id")
    private Optional<String> installationId;

    @JsonCreator
    public LinkGithubAccessRequest(
            Optional<String> githubOidcToken,
            Optional<String> installationId) {
        Utils.checkNotNull(githubOidcToken, "githubOidcToken");
        Utils.checkNotNull(installationId, "installationId");
        this.githubOidcToken = githubOidcToken;
        this.installationId = installationId;
    }
    
    public LinkGithubAccessRequest() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> githubOidcToken() {
        return githubOidcToken;
    }

    @JsonIgnore
    public Optional<String> installationId() {
        return installationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LinkGithubAccessRequest withGithubOidcToken(String githubOidcToken) {
        Utils.checkNotNull(githubOidcToken, "githubOidcToken");
        this.githubOidcToken = Optional.ofNullable(githubOidcToken);
        return this;
    }

    public LinkGithubAccessRequest withGithubOidcToken(Optional<String> githubOidcToken) {
        Utils.checkNotNull(githubOidcToken, "githubOidcToken");
        this.githubOidcToken = githubOidcToken;
        return this;
    }

    public LinkGithubAccessRequest withInstallationId(String installationId) {
        Utils.checkNotNull(installationId, "installationId");
        this.installationId = Optional.ofNullable(installationId);
        return this;
    }

    public LinkGithubAccessRequest withInstallationId(Optional<String> installationId) {
        Utils.checkNotNull(installationId, "installationId");
        this.installationId = installationId;
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
        LinkGithubAccessRequest other = (LinkGithubAccessRequest) o;
        return 
            Objects.deepEquals(this.githubOidcToken, other.githubOidcToken) &&
            Objects.deepEquals(this.installationId, other.installationId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            githubOidcToken,
            installationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkGithubAccessRequest.class,
                "githubOidcToken", githubOidcToken,
                "installationId", installationId);
    }
    
    public final static class Builder {
 
        private Optional<String> githubOidcToken = Optional.empty();
 
        private Optional<String> installationId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder githubOidcToken(String githubOidcToken) {
            Utils.checkNotNull(githubOidcToken, "githubOidcToken");
            this.githubOidcToken = Optional.ofNullable(githubOidcToken);
            return this;
        }

        public Builder githubOidcToken(Optional<String> githubOidcToken) {
            Utils.checkNotNull(githubOidcToken, "githubOidcToken");
            this.githubOidcToken = githubOidcToken;
            return this;
        }

        public Builder installationId(String installationId) {
            Utils.checkNotNull(installationId, "installationId");
            this.installationId = Optional.ofNullable(installationId);
            return this;
        }

        public Builder installationId(Optional<String> installationId) {
            Utils.checkNotNull(installationId, "installationId");
            this.installationId = installationId;
            return this;
        }
        
        public LinkGithubAccessRequest build() {
            return new LinkGithubAccessRequest(
                githubOidcToken,
                installationId);
        }
    }
}
