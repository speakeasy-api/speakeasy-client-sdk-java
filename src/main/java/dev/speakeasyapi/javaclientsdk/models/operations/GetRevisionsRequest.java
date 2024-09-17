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


public class GetRevisionsRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespace_name")
    private String namespaceName;

    /**
     * Token to retrieve the next page of results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=next_page_token")
    private Optional<String> nextPageToken;

    @JsonCreator
    public GetRevisionsRequest(
            String namespaceName,
            Optional<String> nextPageToken) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(nextPageToken, "nextPageToken");
        this.namespaceName = namespaceName;
        this.nextPageToken = nextPageToken;
    }
    
    public GetRevisionsRequest(
            String namespaceName) {
        this(namespaceName, Optional.empty());
    }

    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    /**
     * Token to retrieve the next page of results
     */
    @JsonIgnore
    public Optional<String> nextPageToken() {
        return nextPageToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetRevisionsRequest withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * Token to retrieve the next page of results
     */
    public GetRevisionsRequest withNextPageToken(String nextPageToken) {
        Utils.checkNotNull(nextPageToken, "nextPageToken");
        this.nextPageToken = Optional.ofNullable(nextPageToken);
        return this;
    }

    /**
     * Token to retrieve the next page of results
     */
    public GetRevisionsRequest withNextPageToken(Optional<String> nextPageToken) {
        Utils.checkNotNull(nextPageToken, "nextPageToken");
        this.nextPageToken = nextPageToken;
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
        GetRevisionsRequest other = (GetRevisionsRequest) o;
        return 
            Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            Objects.deepEquals(this.nextPageToken, other.nextPageToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            namespaceName,
            nextPageToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRevisionsRequest.class,
                "namespaceName", namespaceName,
                "nextPageToken", nextPageToken);
    }
    
    public final static class Builder {
 
        private String namespaceName;
 
        private Optional<String> nextPageToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * Token to retrieve the next page of results
         */
        public Builder nextPageToken(String nextPageToken) {
            Utils.checkNotNull(nextPageToken, "nextPageToken");
            this.nextPageToken = Optional.ofNullable(nextPageToken);
            return this;
        }

        /**
         * Token to retrieve the next page of results
         */
        public Builder nextPageToken(Optional<String> nextPageToken) {
            Utils.checkNotNull(nextPageToken, "nextPageToken");
            this.nextPageToken = nextPageToken;
            return this;
        }
        
        public GetRevisionsRequest build() {
            return new GetRevisionsRequest(
                namespaceName,
                nextPageToken);
        }
    }
}
