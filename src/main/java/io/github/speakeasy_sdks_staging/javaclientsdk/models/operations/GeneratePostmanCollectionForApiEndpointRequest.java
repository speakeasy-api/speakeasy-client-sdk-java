/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GeneratePostmanCollectionForApiEndpointRequest {

    /**
     * The ID of the ApiEndpoint to generate a Postman collection for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiEndpointID")
    private String apiEndpointID;

    /**
     * The ID of the Api to generate a Postman collection for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    /**
     * The version ID of the Api to generate a Postman collection for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    private String versionID;

    public GeneratePostmanCollectionForApiEndpointRequest(
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
     * The ID of the ApiEndpoint to generate a Postman collection for.
     */
    public String apiEndpointID() {
        return apiEndpointID;
    }

    /**
     * The ID of the Api to generate a Postman collection for.
     */
    public String apiID() {
        return apiID;
    }

    /**
     * The version ID of the Api to generate a Postman collection for.
     */
    public String versionID() {
        return versionID;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the ApiEndpoint to generate a Postman collection for.
     */
    public GeneratePostmanCollectionForApiEndpointRequest withApiEndpointID(String apiEndpointID) {
        Utils.checkNotNull(apiEndpointID, "apiEndpointID");
        this.apiEndpointID = apiEndpointID;
        return this;
    }

    /**
     * The ID of the Api to generate a Postman collection for.
     */
    public GeneratePostmanCollectionForApiEndpointRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
        return this;
    }

    /**
     * The version ID of the Api to generate a Postman collection for.
     */
    public GeneratePostmanCollectionForApiEndpointRequest withVersionID(String versionID) {
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
        GeneratePostmanCollectionForApiEndpointRequest other = (GeneratePostmanCollectionForApiEndpointRequest) o;
        return 
            java.util.Objects.deepEquals(this.apiEndpointID, other.apiEndpointID) &&
            java.util.Objects.deepEquals(this.apiID, other.apiID) &&
            java.util.Objects.deepEquals(this.versionID, other.versionID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiEndpointID,
            apiID,
            versionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GeneratePostmanCollectionForApiEndpointRequest.class,
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
         * The ID of the ApiEndpoint to generate a Postman collection for.
         */
        public Builder apiEndpointID(String apiEndpointID) {
            Utils.checkNotNull(apiEndpointID, "apiEndpointID");
            this.apiEndpointID = apiEndpointID;
            return this;
        }

        /**
         * The ID of the Api to generate a Postman collection for.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }

        /**
         * The version ID of the Api to generate a Postman collection for.
         */
        public Builder versionID(String versionID) {
            Utils.checkNotNull(versionID, "versionID");
            this.versionID = versionID;
            return this;
        }
        
        public GeneratePostmanCollectionForApiEndpointRequest build() {
            return new GeneratePostmanCollectionForApiEndpointRequest(
                apiEndpointID,
                apiID,
                versionID);
        }
    }
}

