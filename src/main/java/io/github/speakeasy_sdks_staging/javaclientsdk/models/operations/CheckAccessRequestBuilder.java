/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.LazySingletonValue;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CheckAccessRequestBuilder {

    private CheckAccessRequest request;
    private final SDKMethodInterfaces.MethodCallCheckAccess sdk;

    public CheckAccessRequestBuilder(SDKMethodInterfaces.MethodCallCheckAccess sdk) {
        this.sdk = sdk;
    }

    public CheckAccessRequestBuilder request(CheckAccessRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CheckAccessResponse call() throws Exception {

        return sdk.checkAccess(
            request);
    }
}
