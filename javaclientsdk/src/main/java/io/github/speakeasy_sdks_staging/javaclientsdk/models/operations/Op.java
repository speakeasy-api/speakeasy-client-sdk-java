/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;

/**
 * Op - Configuration for filter operations
 */

public class Op {
    /**
     * Whether to AND or OR the filters
     */
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;

    public Op withAnd(Boolean and) {
        this.and = and;
        return this;
    }
    
    public Op(@JsonProperty("and") Boolean and) {
        this.and = and;
  }
}
