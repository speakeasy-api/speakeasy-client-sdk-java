/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import dev.speakeasyapi.javaclientsdk.utils.LazySingletonValue;

public class UpsertPluginRequestBuilder {

    private dev.speakeasyapi.javaclientsdk.models.shared.Plugin request;

    private final SDKMethodInterfaces.MethodCallUpsertPlugin sdk;
    
    public UpsertPluginRequestBuilder(SDKMethodInterfaces.MethodCallUpsertPlugin sdk) {
        this.sdk = sdk;
    }
             
    public UpsertPluginRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.shared.Plugin request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpsertPluginResponse call() throws Exception {
        return sdk.upsertPlugin(
            request);
    }
}