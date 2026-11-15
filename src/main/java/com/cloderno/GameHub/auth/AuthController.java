package com.cloderno.GameHub.auth;

import com.cloderno.GameHub.auth.dto.RegisterRequest;
import io.micrometer.observation.transport.ResponseContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseStatus register(@RequestBody RegisterRequest request) {
        authService.register(request);
        return null;
    }
}
