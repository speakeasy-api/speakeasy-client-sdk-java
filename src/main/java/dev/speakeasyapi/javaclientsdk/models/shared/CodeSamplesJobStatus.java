/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CodeSamplesJobStatus - The current status of the job. Possible values are `pending` or `running`.
 */
public enum CodeSamplesJobStatus {
    PENDING("pending"),
    RUNNING("running");

    @JsonValue
    private final String value;

    private CodeSamplesJobStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}