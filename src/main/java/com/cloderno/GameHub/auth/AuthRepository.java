package com.cloderno.GameHub.auth;

import com.cloderno.GameHub.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface AuthRepository extends JpaRepository<UserEntity, UUID> {
}
