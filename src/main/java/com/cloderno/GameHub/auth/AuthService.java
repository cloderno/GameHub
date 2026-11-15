package com.cloderno.GameHub.auth;

import com.cloderno.GameHub.auth.dto.RegisterRequest;
import com.cloderno.GameHub.user.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    public void register(RegisterRequest registerRequest) {
//        UserEntity userRequest = registerRequest;
//        authRepository.save();
    }
}
