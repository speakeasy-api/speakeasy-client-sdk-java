/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * UploadReportUploadedReport - OK
 */

public class UploadReportUploadedReport {

    @JsonProperty("url")
    private String url;

    @JsonCreator
    public UploadReportUploadedReport(
            @JsonProperty("url") String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
    }

    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UploadReportUploadedReport withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        UploadReportUploadedReport other = (UploadReportUploadedReport) o;
        return 
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadReportUploadedReport.class,
                "url", url);
    }
    
    public final static class Builder {
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public UploadReportUploadedReport build() {
            return new UploadReportUploadedReport(
                url);
        }
    }
}

