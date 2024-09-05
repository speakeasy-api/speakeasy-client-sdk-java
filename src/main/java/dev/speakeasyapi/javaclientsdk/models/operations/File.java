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


public class File {

    @SpeakeasyMetadata("multipartForm:content")
    private byte[] content;

    @SpeakeasyMetadata("multipartForm:name=file")
    private String fileName;

    @JsonCreator
    public File(
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

    public File withContent(byte[] content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public File withFileName(String fileName) {
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
        File other = (File) o;
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
        return Utils.toString(File.class,
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
        
        public File build() {
            return new File(
                content,
                fileName);
        }
    }
}

