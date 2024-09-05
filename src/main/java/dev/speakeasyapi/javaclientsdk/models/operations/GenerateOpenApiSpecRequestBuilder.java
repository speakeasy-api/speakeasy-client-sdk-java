/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GenerateOpenApiSpecRequestBuilder {

    private GenerateOpenApiSpecRequest request;
    private final SDKMethodInterfaces.MethodCallGenerateOpenApiSpec sdk;

    public GenerateOpenApiSpecRequestBuilder(SDKMethodInterfaces.MethodCallGenerateOpenApiSpec sdk) {
        this.sdk = sdk;
    }

    public GenerateOpenApiSpecRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GenerateOpenApiSpecResponse call() throws Exception {

        return sdk.generateOpenApiSpec(
            request);
    }
}
