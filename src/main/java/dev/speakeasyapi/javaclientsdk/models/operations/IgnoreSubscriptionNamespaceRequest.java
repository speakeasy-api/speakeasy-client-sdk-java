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


public class IgnoreSubscriptionNamespaceRequest {

    /**
     * The namespace name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespaceName")
    private String namespaceName;

    /**
     * The existing subscription ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscriptionID")
    private String subscriptionID;

    @JsonCreator
    public IgnoreSubscriptionNamespaceRequest(
            String namespaceName,
            String subscriptionID) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(subscriptionID, "subscriptionID");
        this.namespaceName = namespaceName;
        this.subscriptionID = subscriptionID;
    }

    /**
     * The namespace name
     */
    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    /**
     * The existing subscription ID
     */
    @JsonIgnore
    public String subscriptionID() {
        return subscriptionID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The namespace name
     */
    public IgnoreSubscriptionNamespaceRequest withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * The existing subscription ID
     */
    public IgnoreSubscriptionNamespaceRequest withSubscriptionID(String subscriptionID) {
        Utils.checkNotNull(subscriptionID, "subscriptionID");
        this.subscriptionID = subscriptionID;
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
        IgnoreSubscriptionNamespaceRequest other = (IgnoreSubscriptionNamespaceRequest) o;
        return 
            Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            Objects.deepEquals(this.subscriptionID, other.subscriptionID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            namespaceName,
            subscriptionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IgnoreSubscriptionNamespaceRequest.class,
                "namespaceName", namespaceName,
                "subscriptionID", subscriptionID);
    }
    
    public final static class Builder {
 
        private String namespaceName;
 
        private String subscriptionID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The namespace name
         */
        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The existing subscription ID
         */
        public Builder subscriptionID(String subscriptionID) {
            Utils.checkNotNull(subscriptionID, "subscriptionID");
            this.subscriptionID = subscriptionID;
            return this;
        }
        
        public IgnoreSubscriptionNamespaceRequest build() {
            return new IgnoreSubscriptionNamespaceRequest(
                namespaceName,
                subscriptionID);
        }
    }
}

