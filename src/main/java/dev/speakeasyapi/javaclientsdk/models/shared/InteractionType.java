/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.speakeasyapi.javaclientsdk.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * InteractionType - Type of interaction.
 */
public enum InteractionType {
    CLI_EXEC("CLI_EXEC"),
    TARGET_GENERATE("TARGET_GENERATE");

    @JsonValue
    private final String value;

    private InteractionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<InteractionType> fromValue(String value) {
        for (InteractionType o: InteractionType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
