/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ApiKeyDetails {

    @JsonProperty("account_type")
    private AccountType accountType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("generation_access_unlimited")
    private Optional<? extends Boolean> generationAccessUnlimited;

    @JsonProperty("workspace_id")
    private String workspaceId;

    public ApiKeyDetails(
            @JsonProperty("account_type") AccountType accountType,
            @JsonProperty("generation_access_unlimited") Optional<? extends Boolean> generationAccessUnlimited,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(accountType, "accountType");
        Utils.checkNotNull(generationAccessUnlimited, "generationAccessUnlimited");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.accountType = accountType;
        this.generationAccessUnlimited = generationAccessUnlimited;
        this.workspaceId = workspaceId;
    }

    public AccountType accountType() {
        return accountType;
    }

    public Optional<? extends Boolean> generationAccessUnlimited() {
        return generationAccessUnlimited;
    }

    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApiKeyDetails withAccountType(AccountType accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
        return this;
    }

    public ApiKeyDetails withGenerationAccessUnlimited(boolean generationAccessUnlimited) {
        Utils.checkNotNull(generationAccessUnlimited, "generationAccessUnlimited");
        this.generationAccessUnlimited = Optional.ofNullable(generationAccessUnlimited);
        return this;
    }

    public ApiKeyDetails withGenerationAccessUnlimited(Optional<? extends Boolean> generationAccessUnlimited) {
        Utils.checkNotNull(generationAccessUnlimited, "generationAccessUnlimited");
        this.generationAccessUnlimited = generationAccessUnlimited;
        return this;
    }

    public ApiKeyDetails withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiKeyDetails other = (ApiKeyDetails) o;
        return 
            java.util.Objects.deepEquals(this.accountType, other.accountType) &&
            java.util.Objects.deepEquals(this.generationAccessUnlimited, other.generationAccessUnlimited) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountType,
            generationAccessUnlimited,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiKeyDetails.class,
                "accountType", accountType,
                "generationAccessUnlimited", generationAccessUnlimited,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private AccountType accountType;
 
        private Optional<? extends Boolean> generationAccessUnlimited = Optional.empty();
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountType(AccountType accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }

        public Builder generationAccessUnlimited(boolean generationAccessUnlimited) {
            Utils.checkNotNull(generationAccessUnlimited, "generationAccessUnlimited");
            this.generationAccessUnlimited = Optional.ofNullable(generationAccessUnlimited);
            return this;
        }

        public Builder generationAccessUnlimited(Optional<? extends Boolean> generationAccessUnlimited) {
            Utils.checkNotNull(generationAccessUnlimited, "generationAccessUnlimited");
            this.generationAccessUnlimited = generationAccessUnlimited;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public ApiKeyDetails build() {
            return new ApiKeyDetails(
                accountType,
                generationAccessUnlimited,
                workspaceId);
        }
    }
}

