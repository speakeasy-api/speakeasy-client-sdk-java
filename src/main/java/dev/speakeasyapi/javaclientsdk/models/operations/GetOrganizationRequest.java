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


public class GetOrganizationRequest {

    /**
     * Unique identifier of the organization.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationID")
    private String organizationID;

    @JsonCreator
    public GetOrganizationRequest(
            String organizationID) {
        Utils.checkNotNull(organizationID, "organizationID");
        this.organizationID = organizationID;
    }

    /**
     * Unique identifier of the organization.
     */
    @JsonIgnore
    public String organizationID() {
        return organizationID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the organization.
     */
    public GetOrganizationRequest withOrganizationID(String organizationID) {
        Utils.checkNotNull(organizationID, "organizationID");
        this.organizationID = organizationID;
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
        GetOrganizationRequest other = (GetOrganizationRequest) o;
        return 
            Objects.deepEquals(this.organizationID, other.organizationID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            organizationID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOrganizationRequest.class,
                "organizationID", organizationID);
    }
    
    public final static class Builder {
 
        private String organizationID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the organization.
         */
        public Builder organizationID(String organizationID) {
            Utils.checkNotNull(organizationID, "organizationID");
            this.organizationID = organizationID;
            return this;
        }
        
        public GetOrganizationRequest build() {
            return new GetOrganizationRequest(
                organizationID);
        }
    }
}

