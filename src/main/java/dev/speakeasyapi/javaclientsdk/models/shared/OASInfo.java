/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OASInfo {

    @JsonProperty("description")
    private String description;

    @JsonProperty("license")
    private License license;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("title")
    private String title;

    @JsonProperty("version")
    private String version;

    @JsonCreator
    public OASInfo(
            @JsonProperty("description") String description,
            @JsonProperty("license") License license,
            @JsonProperty("summary") String summary,
            @JsonProperty("title") String title,
            @JsonProperty("version") String version) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(license, "license");
        Utils.checkNotNull(summary, "summary");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(version, "version");
        this.description = description;
        this.license = license;
        this.summary = summary;
        this.title = title;
        this.version = version;
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @JsonIgnore
    public License license() {
        return license;
    }

    @JsonIgnore
    public String summary() {
        return summary;
    }

    @JsonIgnore
    public String title() {
        return title;
    }

    @JsonIgnore
    public String version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OASInfo withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public OASInfo withLicense(License license) {
        Utils.checkNotNull(license, "license");
        this.license = license;
        return this;
    }

    public OASInfo withSummary(String summary) {
        Utils.checkNotNull(summary, "summary");
        this.summary = summary;
        return this;
    }

    public OASInfo withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public OASInfo withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        OASInfo other = (OASInfo) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.license, other.license) &&
            Objects.deepEquals(this.summary, other.summary) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            license,
            summary,
            title,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OASInfo.class,
                "description", description,
                "license", license,
                "summary", summary,
                "title", title,
                "version", version);
    }
    
    public final static class Builder {
 
        private String description;
 
        private License license;
 
        private String summary;
 
        private String title;
 
        private String version;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder license(License license) {
            Utils.checkNotNull(license, "license");
            this.license = license;
            return this;
        }

        public Builder summary(String summary) {
            Utils.checkNotNull(summary, "summary");
            this.summary = summary;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public OASInfo build() {
            return new OASInfo(
                description,
                license,
                summary,
                title,
                version);
        }
    }
}

