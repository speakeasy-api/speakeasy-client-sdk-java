/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class User {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("admin")
    private Optional<? extends Boolean> admin;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<? extends OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_name")
    private Optional<? extends String> displayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_verified")
    private Optional<? extends Boolean> emailVerified;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    public User(
            @JsonProperty("admin") Optional<? extends Boolean> admin,
            @JsonProperty("created_at") Optional<? extends OffsetDateTime> createdAt,
            @JsonProperty("display_name") Optional<? extends String> displayName,
            @JsonProperty("email") Optional<? extends String> email,
            @JsonProperty("email_verified") Optional<? extends Boolean> emailVerified,
            @JsonProperty("id") Optional<? extends String> id) {
        Utils.checkNotNull(admin, "admin");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(emailVerified, "emailVerified");
        Utils.checkNotNull(id, "id");
        this.admin = admin;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.email = email;
        this.emailVerified = emailVerified;
        this.id = id;
    }

    public Optional<? extends Boolean> admin() {
        return admin;
    }

    public Optional<? extends OffsetDateTime> createdAt() {
        return createdAt;
    }

    public Optional<? extends String> displayName() {
        return displayName;
    }

    public Optional<? extends String> email() {
        return email;
    }

    public Optional<? extends Boolean> emailVerified() {
        return emailVerified;
    }

    public Optional<? extends String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public User withAdmin(boolean admin) {
        Utils.checkNotNull(admin, "admin");
        this.admin = Optional.ofNullable(admin);
        return this;
    }

    public User withAdmin(Optional<? extends Boolean> admin) {
        Utils.checkNotNull(admin, "admin");
        this.admin = admin;
        return this;
    }

    public User withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public User withCreatedAt(Optional<? extends OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public User withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    public User withDisplayName(Optional<? extends String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public User withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public User withEmail(Optional<? extends String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public User withEmailVerified(boolean emailVerified) {
        Utils.checkNotNull(emailVerified, "emailVerified");
        this.emailVerified = Optional.ofNullable(emailVerified);
        return this;
    }

    public User withEmailVerified(Optional<? extends Boolean> emailVerified) {
        Utils.checkNotNull(emailVerified, "emailVerified");
        this.emailVerified = emailVerified;
        return this;
    }

    public User withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public User withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        User other = (User) o;
        return 
            java.util.Objects.deepEquals(this.admin, other.admin) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.displayName, other.displayName) &&
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.emailVerified, other.emailVerified) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            admin,
            createdAt,
            displayName,
            email,
            emailVerified,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(User.class,
                "admin", admin,
                "createdAt", createdAt,
                "displayName", displayName,
                "email", email,
                "emailVerified", emailVerified,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> admin = Optional.empty();
 
        private Optional<? extends OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends String> displayName = Optional.empty();
 
        private Optional<? extends String> email = Optional.empty();
 
        private Optional<? extends Boolean> emailVerified = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder admin(boolean admin) {
            Utils.checkNotNull(admin, "admin");
            this.admin = Optional.ofNullable(admin);
            return this;
        }

        public Builder admin(Optional<? extends Boolean> admin) {
            Utils.checkNotNull(admin, "admin");
            this.admin = admin;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<? extends OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }

        public Builder displayName(Optional<? extends String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<? extends String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder emailVerified(boolean emailVerified) {
            Utils.checkNotNull(emailVerified, "emailVerified");
            this.emailVerified = Optional.ofNullable(emailVerified);
            return this;
        }

        public Builder emailVerified(Optional<? extends Boolean> emailVerified) {
            Utils.checkNotNull(emailVerified, "emailVerified");
            this.emailVerified = emailVerified;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public User build() {
            return new User(
                admin,
                createdAt,
                displayName,
                email,
                emailVerified,
                id);
        }
    }
}

