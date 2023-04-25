/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

/**
 * GetApisOp - Configuration for filter operations
 */
public class GetApisOp {
    /**
     * Whether to AND or OR the filters
     */
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;
    public GetApisOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
    
    public GetApisOp(@JsonProperty("and") Boolean and) {
        this.and = and;
  }
}
