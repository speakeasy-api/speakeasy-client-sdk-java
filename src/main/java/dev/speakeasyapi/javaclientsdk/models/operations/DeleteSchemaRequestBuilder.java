/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Exception;

public class DeleteSchemaRequestBuilder {

    private DeleteSchemaRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteSchema sdk;

    public DeleteSchemaRequestBuilder(SDKMethodInterfaces.MethodCallDeleteSchema sdk) {
        this.sdk = sdk;
    }

    public DeleteSchemaRequestBuilder request(DeleteSchemaRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteSchemaResponse call() throws Exception {

        return sdk.deleteSchema(
            request);
    }
}
