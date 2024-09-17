/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetVersionMetadataRequestBuilder {

    private GetVersionMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallGetVersionMetadata sdk;

    public GetVersionMetadataRequestBuilder(SDKMethodInterfaces.MethodCallGetVersionMetadata sdk) {
        this.sdk = sdk;
    }

    public GetVersionMetadataRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetVersionMetadataResponse call() throws Exception {

        return sdk.getVersionMetadata(
            request);
    }
}