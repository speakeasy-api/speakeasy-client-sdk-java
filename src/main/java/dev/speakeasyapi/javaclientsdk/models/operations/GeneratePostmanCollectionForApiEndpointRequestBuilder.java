/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Exception;

public class GeneratePostmanCollectionForApiEndpointRequestBuilder {

    private GeneratePostmanCollectionForApiEndpointRequest request;
    private final SDKMethodInterfaces.MethodCallGeneratePostmanCollectionForApiEndpoint sdk;

    public GeneratePostmanCollectionForApiEndpointRequestBuilder(SDKMethodInterfaces.MethodCallGeneratePostmanCollectionForApiEndpoint sdk) {
        this.sdk = sdk;
    }

    public GeneratePostmanCollectionForApiEndpointRequestBuilder request(GeneratePostmanCollectionForApiEndpointRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GeneratePostmanCollectionForApiEndpointResponse call() throws Exception {

        return sdk.generatePostmanCollectionForApiEndpoint(
            request);
    }
}
