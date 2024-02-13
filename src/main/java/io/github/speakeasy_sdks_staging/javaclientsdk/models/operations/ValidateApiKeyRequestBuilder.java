/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.LazySingletonValue;

public class ValidateApiKeyRequestBuilder {


    private final SDKMethodInterfaces.MethodCallValidateApiKey sdk;
    
    public ValidateApiKeyRequestBuilder(SDKMethodInterfaces.MethodCallValidateApiKey sdk) {
        this.sdk = sdk;
    }

    public ValidateApiKeyResponse call() throws Exception {
        return sdk.validateApiKeyDirect();
    }
}