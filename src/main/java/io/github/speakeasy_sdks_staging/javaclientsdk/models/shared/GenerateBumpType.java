/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * GenerateBumpType - Bump type of the lock file (calculated semver delta, or a custom change (manual release))
 */
public enum GenerateBumpType {
    MAJOR("major"),
    MINOR("minor"),
    PATCH("patch"),
    CUSTOM("custom"),
    NONE("none");

    @JsonValue
    private final String value;

    private GenerateBumpType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
