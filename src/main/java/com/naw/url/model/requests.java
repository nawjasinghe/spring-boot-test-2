package com.naw.url.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

public class requests {
    @NotBlank(message = "url is required")
    @Size(max = 2048, message = "url must not exceed 2048 characters")
    private String url;

    @Pattern(regexp = "^[a-zA-Z0-9_-]{3,30}$", message = "customAlias must be 3-30 characters and contain only letters, numbers, hyphens, and underscores")
    private String customAlias;

    private LocalDateTime expiresAt;

    public requests() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCustomAlias() {
        return customAlias;
    }

    public void setCustomAlias(String customAlias) {
        this.customAlias = customAlias;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }
}
