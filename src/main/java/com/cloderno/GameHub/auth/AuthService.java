package com.cloderno.GameHub.auth;

import com.cloderno.GameHub.auth.dto.RegisterRequest;
import com.cloderno.GameHub.auth.dto.RegisterResponse;
import com.cloderno.GameHub.user.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    public RegisterResponse register(RegisterRequest registerRequest) {
        // TODO: ADD password encoder to security
        // TODO: make builder constructor private, and use mapper
        UserEntity user = new UserEntity(
                registerRequest.email(),
                registerRequest.username(),
                registerRequest.password()
        );

        UserEntity savedUser = authRepository.save(user);
        return new RegisterResponse(
                savedUser.getId().toString(),
                savedUser.getUsername(),
                savedUser.getEmail()
        );
    }
}
