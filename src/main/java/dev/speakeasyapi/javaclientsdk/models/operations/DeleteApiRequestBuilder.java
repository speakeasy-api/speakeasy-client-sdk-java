/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Exception;

public class DeleteApiRequestBuilder {

    private DeleteApiRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteApi sdk;

    public DeleteApiRequestBuilder(SDKMethodInterfaces.MethodCallDeleteApi sdk) {
        this.sdk = sdk;
    }

    public DeleteApiRequestBuilder request(DeleteApiRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteApiResponse call() throws Exception {

        return sdk.deleteApi(
            request);
    }
}
