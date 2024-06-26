/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * GithubConfigureMintlifyRepoRequest - A request to configure a GitHub repository for mintlify
 */

public class GithubConfigureMintlifyRepoRequest {

    /**
     * The input OpenAPI document
     */
    @JsonProperty("input")
    private String input;

    /**
     * The GitHub organization name
     */
    @JsonProperty("org")
    private String org;

    /**
     * The overlays to apply
     */
    @JsonProperty("overlays")
    private java.util.List<String> overlays;

    /**
     * The GitHub repository name
     */
    @JsonProperty("repo")
    private String repo;

    @JsonCreator
    public GithubConfigureMintlifyRepoRequest(
            @JsonProperty("input") String input,
            @JsonProperty("org") String org,
            @JsonProperty("overlays") java.util.List<String> overlays,
            @JsonProperty("repo") String repo) {
        Utils.checkNotNull(input, "input");
        Utils.checkNotNull(org, "org");
        Utils.checkNotNull(overlays, "overlays");
        Utils.checkNotNull(repo, "repo");
        this.input = input;
        this.org = org;
        this.overlays = overlays;
        this.repo = repo;
    }

    /**
     * The input OpenAPI document
     */
    @JsonIgnore
    public String input() {
        return input;
    }

    /**
     * The GitHub organization name
     */
    @JsonIgnore
    public String org() {
        return org;
    }

    /**
     * The overlays to apply
     */
    @JsonIgnore
    public java.util.List<String> overlays() {
        return overlays;
    }

    /**
     * The GitHub repository name
     */
    @JsonIgnore
    public String repo() {
        return repo;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The input OpenAPI document
     */
    public GithubConfigureMintlifyRepoRequest withInput(String input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
        return this;
    }

    /**
     * The GitHub organization name
     */
    public GithubConfigureMintlifyRepoRequest withOrg(String org) {
        Utils.checkNotNull(org, "org");
        this.org = org;
        return this;
    }

    /**
     * The overlays to apply
     */
    public GithubConfigureMintlifyRepoRequest withOverlays(java.util.List<String> overlays) {
        Utils.checkNotNull(overlays, "overlays");
        this.overlays = overlays;
        return this;
    }

    /**
     * The GitHub repository name
     */
    public GithubConfigureMintlifyRepoRequest withRepo(String repo) {
        Utils.checkNotNull(repo, "repo");
        this.repo = repo;
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
        GithubConfigureMintlifyRepoRequest other = (GithubConfigureMintlifyRepoRequest) o;
        return 
            java.util.Objects.deepEquals(this.input, other.input) &&
            java.util.Objects.deepEquals(this.org, other.org) &&
            java.util.Objects.deepEquals(this.overlays, other.overlays) &&
            java.util.Objects.deepEquals(this.repo, other.repo);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            input,
            org,
            overlays,
            repo);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GithubConfigureMintlifyRepoRequest.class,
                "input", input,
                "org", org,
                "overlays", overlays,
                "repo", repo);
    }
    
    public final static class Builder {
 
        private String input;
 
        private String org;
 
        private java.util.List<String> overlays;
 
        private String repo;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The input OpenAPI document
         */
        public Builder input(String input) {
            Utils.checkNotNull(input, "input");
            this.input = input;
            return this;
        }

        /**
         * The GitHub organization name
         */
        public Builder org(String org) {
            Utils.checkNotNull(org, "org");
            this.org = org;
            return this;
        }

        /**
         * The overlays to apply
         */
        public Builder overlays(java.util.List<String> overlays) {
            Utils.checkNotNull(overlays, "overlays");
            this.overlays = overlays;
            return this;
        }

        /**
         * The GitHub repository name
         */
        public Builder repo(String repo) {
            Utils.checkNotNull(repo, "repo");
            this.repo = repo;
            return this;
        }
        
        public GithubConfigureMintlifyRepoRequest build() {
            return new GithubConfigureMintlifyRepoRequest(
                input,
                org,
                overlays,
                repo);
        }
    }
}

