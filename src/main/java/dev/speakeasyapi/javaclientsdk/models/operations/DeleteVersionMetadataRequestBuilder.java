/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class DeleteVersionMetadataRequestBuilder {

    private DeleteVersionMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteVersionMetadata sdk;

    public DeleteVersionMetadataRequestBuilder(SDKMethodInterfaces.MethodCallDeleteVersionMetadata sdk) {
        this.sdk = sdk;
    }

    public DeleteVersionMetadataRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteVersionMetadataResponse call() throws Exception {

        return sdk.deleteVersionMetadata(
            request);
    }
}
