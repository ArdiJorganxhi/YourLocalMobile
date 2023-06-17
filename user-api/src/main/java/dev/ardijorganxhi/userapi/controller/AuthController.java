package dev.ardijorganxhi.userapi.controller;

import dev.ardijorganxhi.userapi.entity.User;
import dev.ardijorganxhi.userapi.model.request.LoginRequest;
import dev.ardijorganxhi.userapi.model.request.RegisterRequest;
import dev.ardijorganxhi.userapi.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/{user}")
    public ResponseEntity<Optional<User>> findByEmail(@PathVariable String user) {
        return ResponseEntity.ok(authService.findByEmail(user));
    }

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest request) {
        authService.register(request);
    }

    @GetMapping("/login")
    public ResponseEntity<User> login(LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

}
