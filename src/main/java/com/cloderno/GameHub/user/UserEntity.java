package com.cloderno.GameHub.user;

import com.cloderno.GameHub.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class UserEntity extends BaseEntity {
    @Column(nullable = false, length = 255)
    private String email;

    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @Column(name = "email_verified", nullable = false)
    private boolean emailVerified;

    @Builder
    private UserEntity(String email, String username, String passwordHash) {
        this.email = email;
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = UserRole.USER;
        this.status = UserStatus.PENDING_VERIFICATION;
        this.emailVerified = false;
    }

    public void verifyEmail() {
        this.emailVerified = true;
        this.status = UserStatus.ACTIVE;
    }
}
