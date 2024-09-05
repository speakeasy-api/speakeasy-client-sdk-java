/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
    private List<String> overlays;

    /**
     * The GitHub repository name
     */
    @JsonProperty("repo")
    private String repo;

    /**
     * The subdirectory (location of mint.json)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdirectory")
    private Optional<String> subdirectory;

    @JsonCreator
    public GithubConfigureMintlifyRepoRequest(
            @JsonProperty("input") String input,
            @JsonProperty("org") String org,
            @JsonProperty("overlays") List<String> overlays,
            @JsonProperty("repo") String repo,
            @JsonProperty("subdirectory") Optional<String> subdirectory) {
        Utils.checkNotNull(input, "input");
        Utils.checkNotNull(org, "org");
        Utils.checkNotNull(overlays, "overlays");
        Utils.checkNotNull(repo, "repo");
        Utils.checkNotNull(subdirectory, "subdirectory");
        this.input = input;
        this.org = org;
        this.overlays = overlays;
        this.repo = repo;
        this.subdirectory = subdirectory;
    }
    
    public GithubConfigureMintlifyRepoRequest(
            String input,
            String org,
            List<String> overlays,
            String repo) {
        this(input, org, overlays, repo, Optional.empty());
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
    public List<String> overlays() {
        return overlays;
    }

    /**
     * The GitHub repository name
     */
    @JsonIgnore
    public String repo() {
        return repo;
    }

    /**
     * The subdirectory (location of mint.json)
     */
    @JsonIgnore
    public Optional<String> subdirectory() {
        return subdirectory;
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
    public GithubConfigureMintlifyRepoRequest withOverlays(List<String> overlays) {
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

    /**
     * The subdirectory (location of mint.json)
     */
    public GithubConfigureMintlifyRepoRequest withSubdirectory(String subdirectory) {
        Utils.checkNotNull(subdirectory, "subdirectory");
        this.subdirectory = Optional.ofNullable(subdirectory);
        return this;
    }

    /**
     * The subdirectory (location of mint.json)
     */
    public GithubConfigureMintlifyRepoRequest withSubdirectory(Optional<String> subdirectory) {
        Utils.checkNotNull(subdirectory, "subdirectory");
        this.subdirectory = subdirectory;
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
            Objects.deepEquals(this.input, other.input) &&
            Objects.deepEquals(this.org, other.org) &&
            Objects.deepEquals(this.overlays, other.overlays) &&
            Objects.deepEquals(this.repo, other.repo) &&
            Objects.deepEquals(this.subdirectory, other.subdirectory);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            input,
            org,
            overlays,
            repo,
            subdirectory);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GithubConfigureMintlifyRepoRequest.class,
                "input", input,
                "org", org,
                "overlays", overlays,
                "repo", repo,
                "subdirectory", subdirectory);
    }
    
    public final static class Builder {
 
        private String input;
 
        private String org;
 
        private List<String> overlays;
 
        private String repo;
 
        private Optional<String> subdirectory = Optional.empty();  
        
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
        public Builder overlays(List<String> overlays) {
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

        /**
         * The subdirectory (location of mint.json)
         */
        public Builder subdirectory(String subdirectory) {
            Utils.checkNotNull(subdirectory, "subdirectory");
            this.subdirectory = Optional.ofNullable(subdirectory);
            return this;
        }

        /**
         * The subdirectory (location of mint.json)
         */
        public Builder subdirectory(Optional<String> subdirectory) {
            Utils.checkNotNull(subdirectory, "subdirectory");
            this.subdirectory = subdirectory;
            return this;
        }
        
        public GithubConfigureMintlifyRepoRequest build() {
            return new GithubConfigureMintlifyRepoRequest(
                input,
                org,
                overlays,
                repo,
                subdirectory);
        }
    }
}
