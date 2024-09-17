/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetSchemaDiffRequestBuilder {

    private GetSchemaDiffRequest request;
    private final SDKMethodInterfaces.MethodCallGetSchemaDiff sdk;

    public GetSchemaDiffRequestBuilder(SDKMethodInterfaces.MethodCallGetSchemaDiff sdk) {
        this.sdk = sdk;
    }

    public GetSchemaDiffRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetSchemaDiffResponse call() throws Exception {

        return sdk.getSchemaDiff(
            request);
    }
}