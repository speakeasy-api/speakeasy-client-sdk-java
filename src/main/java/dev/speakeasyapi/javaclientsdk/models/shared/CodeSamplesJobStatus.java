/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

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
    
    public static Optional<CodeSamplesJobStatus> fromValue(String value) {
        for (CodeSamplesJobStatus o: CodeSamplesJobStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
