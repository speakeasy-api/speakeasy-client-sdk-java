/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import java.lang.Exception;

public class ValidateApiKeyRequestBuilder {

    private final SDKMethodInterfaces.MethodCallValidateApiKey sdk;

    public ValidateApiKeyRequestBuilder(SDKMethodInterfaces.MethodCallValidateApiKey sdk) {
        this.sdk = sdk;
    }

    public ValidateApiKeyResponse call() throws Exception {

        return sdk.validateApiKeyDirect();
    }
}
