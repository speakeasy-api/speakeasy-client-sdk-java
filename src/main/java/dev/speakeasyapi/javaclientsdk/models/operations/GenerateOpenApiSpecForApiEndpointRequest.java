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


public class GenerateOpenApiSpecForApiEndpointRequest {

    /**
     * The ID of the ApiEndpoint to generate an OpenAPI specification for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    private String apiEndpointID;

    /**
     * The ID of the Api to generate an OpenAPI specification for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    /**
     * The version ID of the Api to generate an OpenAPI specification for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    private String versionID;

    @JsonCreator
    public GenerateOpenApiSpecForApiEndpointRequest(
            String apiEndpointID,
            String apiID,
            String versionID) {
        Utils.checkNotNull(apiEndpointID, "apiEndpointID");
        Utils.checkNotNull(apiID, "apiID");
        Utils.checkNotNull(versionID, "versionID");
        this.apiEndpointID = apiEndpointID;
        this.apiID = apiID;
        this.versionID = versionID;
    }

    /**
     * The ID of the ApiEndpoint to generate an OpenAPI specification for.
     */
    @JsonIgnore
    public String apiEndpointID() {
        return apiEndpointID;
    }

    /**
     * The ID of the Api to generate an OpenAPI specification for.
     */
    @JsonIgnore
    public String apiID() {
        return apiID;
    }

    /**
     * The version ID of the Api to generate an OpenAPI specification for.
     */
    @JsonIgnore
    public String versionID() {
        return versionID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the ApiEndpoint to generate an OpenAPI specification for.
     */
    public GenerateOpenApiSpecForApiEndpointRequest withApiEndpointID(String apiEndpointID) {
        Utils.checkNotNull(apiEndpointID, "apiEndpointID");
        this.apiEndpointID = apiEndpointID;
        return this;
    }

    /**
     * The ID of the Api to generate an OpenAPI specification for.
     */
    public GenerateOpenApiSpecForApiEndpointRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
        return this;
    }

    /**
     * The version ID of the Api to generate an OpenAPI specification for.
     */
    public GenerateOpenApiSpecForApiEndpointRequest withVersionID(String versionID) {
        Utils.checkNotNull(versionID, "versionID");
        this.versionID = versionID;
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
        GenerateOpenApiSpecForApiEndpointRequest other = (GenerateOpenApiSpecForApiEndpointRequest) o;
        return 
            Objects.deepEquals(this.apiEndpointID, other.apiEndpointID) &&
            Objects.deepEquals(this.apiID, other.apiID) &&
            Objects.deepEquals(this.versionID, other.versionID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiEndpointID,
            apiID,
            versionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateOpenApiSpecForApiEndpointRequest.class,
                "apiEndpointID", apiEndpointID,
                "apiID", apiID,
                "versionID", versionID);
    }
    
    public final static class Builder {
 
        private String apiEndpointID;
 
        private String apiID;
 
        private String versionID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the ApiEndpoint to generate an OpenAPI specification for.
         */
        public Builder apiEndpointID(String apiEndpointID) {
            Utils.checkNotNull(apiEndpointID, "apiEndpointID");
            this.apiEndpointID = apiEndpointID;
            return this;
        }

        /**
         * The ID of the Api to generate an OpenAPI specification for.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }

        /**
         * The version ID of the Api to generate an OpenAPI specification for.
         */
        public Builder versionID(String versionID) {
            Utils.checkNotNull(versionID, "versionID");
            this.versionID = versionID;
            return this;
        }
        
        public GenerateOpenApiSpecForApiEndpointRequest build() {
            return new GenerateOpenApiSpecForApiEndpointRequest(
                apiEndpointID,
                apiID,
                versionID);
        }
    }
}

