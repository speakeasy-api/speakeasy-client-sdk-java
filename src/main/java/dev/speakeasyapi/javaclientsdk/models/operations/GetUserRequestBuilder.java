/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


public class GetUserRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetUser sdk;

    public GetUserRequestBuilder(SDKMethodInterfaces.MethodCallGetUser sdk) {
        this.sdk = sdk;
    }

    public GetUserResponse call() throws Exception {

        return sdk.getUserDirect();
    }
}
