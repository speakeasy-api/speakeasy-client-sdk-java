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


public class Schema {

    @SpeakeasyMetadata("multipartForm:content")
    private byte[] content;

    @SpeakeasyMetadata("multipartForm:name=fileName")
    private String fileName;

    @JsonCreator
    public Schema(
            byte[] content,
            String fileName) {
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(fileName, "fileName");
        this.content = content;
        this.fileName = fileName;
    }

    @JsonIgnore
    public byte[] content() {
        return content;
    }

    @JsonIgnore
    public String fileName() {
        return fileName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Schema withContent(byte[] content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public Schema withFileName(String fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = fileName;
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
        Schema other = (Schema) o;
        return 
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.fileName, other.fileName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            content,
            fileName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Schema.class,
                "content", content,
                "fileName", fileName);
    }
    
    public final static class Builder {
 
        private byte[] content;
 
        private String fileName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder content(byte[] content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder fileName(String fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = fileName;
            return this;
        }
        
        public Schema build() {
            return new Schema(
                content,
                fileName);
        }
    }
}

