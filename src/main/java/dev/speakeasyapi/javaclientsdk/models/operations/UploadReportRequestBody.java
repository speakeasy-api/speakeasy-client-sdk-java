/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.Report;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * UploadReportRequestBody - The report file to upload provided as a multipart/form-data file segment.
 */

public class UploadReportRequestBody {

    @SpeakeasyMetadata("multipartForm:name=data,json")
    private Report data;

    @SpeakeasyMetadata("multipartForm:file")
    private File file;

    @JsonCreator
    public UploadReportRequestBody(
            Report data,
            File file) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(file, "file");
        this.data = data;
        this.file = file;
    }

    @JsonIgnore
    public Report data() {
        return data;
    }

    @JsonIgnore
    public File file() {
        return file;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UploadReportRequestBody withData(Report data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public UploadReportRequestBody withFile(File file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
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
        UploadReportRequestBody other = (UploadReportRequestBody) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.file, other.file);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            file);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadReportRequestBody.class,
                "data", data,
                "file", file);
    }
    
    public final static class Builder {
 
        private Report data;
 
        private File file;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Report data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder file(File file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }
        
        public UploadReportRequestBody build() {
            return new UploadReportRequestBody(
                data,
                file);
        }
    }
}
