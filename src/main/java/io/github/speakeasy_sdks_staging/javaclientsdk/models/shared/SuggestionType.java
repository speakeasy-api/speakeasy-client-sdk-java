/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SuggestionType {
    METHOD_NAMES("method-names"),
    DIAGNOSTICS_ONLY("diagnostics-only");

    @JsonValue
    private final String value;

    private SuggestionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}