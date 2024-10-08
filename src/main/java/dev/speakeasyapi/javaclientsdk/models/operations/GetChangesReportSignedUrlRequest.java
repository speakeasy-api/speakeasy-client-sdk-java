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


public class GetChangesReportSignedUrlRequest {

    /**
     * The checksum of the document to retrieve the signed access url for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=documentChecksum")
    private String documentChecksum;

    @JsonCreator
    public GetChangesReportSignedUrlRequest(
            String documentChecksum) {
        Utils.checkNotNull(documentChecksum, "documentChecksum");
        this.documentChecksum = documentChecksum;
    }

    /**
     * The checksum of the document to retrieve the signed access url for.
     */
    @JsonIgnore
    public String documentChecksum() {
        return documentChecksum;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The checksum of the document to retrieve the signed access url for.
     */
    public GetChangesReportSignedUrlRequest withDocumentChecksum(String documentChecksum) {
        Utils.checkNotNull(documentChecksum, "documentChecksum");
        this.documentChecksum = documentChecksum;
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
        GetChangesReportSignedUrlRequest other = (GetChangesReportSignedUrlRequest) o;
        return 
            Objects.deepEquals(this.documentChecksum, other.documentChecksum);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            documentChecksum);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetChangesReportSignedUrlRequest.class,
                "documentChecksum", documentChecksum);
    }
    
    public final static class Builder {
 
        private String documentChecksum;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The checksum of the document to retrieve the signed access url for.
         */
        public Builder documentChecksum(String documentChecksum) {
            Utils.checkNotNull(documentChecksum, "documentChecksum");
            this.documentChecksum = documentChecksum;
            return this;
        }
        
        public GetChangesReportSignedUrlRequest build() {
            return new GetChangesReportSignedUrlRequest(
                documentChecksum);
        }
    }
}

