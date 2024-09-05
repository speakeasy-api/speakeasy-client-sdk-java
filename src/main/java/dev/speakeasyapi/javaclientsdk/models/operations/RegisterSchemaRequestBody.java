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

/**
 * RegisterSchemaRequestBody - The schema file to upload provided as a multipart/form-data file segment.
 */

public class RegisterSchemaRequestBody {

    @SpeakeasyMetadata("multipartForm:file")
    private RegisterSchemaFile file;

    @JsonCreator
    public RegisterSchemaRequestBody(
            RegisterSchemaFile file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
    }

    @JsonIgnore
    public RegisterSchemaFile file() {
        return file;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RegisterSchemaRequestBody withFile(RegisterSchemaFile file) {
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
        RegisterSchemaRequestBody other = (RegisterSchemaRequestBody) o;
        return 
            Objects.deepEquals(this.file, other.file);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            file);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RegisterSchemaRequestBody.class,
                "file", file);
    }
    
    public final static class Builder {
 
        private RegisterSchemaFile file;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder file(RegisterSchemaFile file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }
        
        public RegisterSchemaRequestBody build() {
            return new RegisterSchemaRequestBody(
                file);
        }
    }
}

