package dev.ardijorganxhi.userapi.service;

import dev.ardijorganxhi.userapi.entity.User;
import dev.ardijorganxhi.userapi.mapper.AuthMapper;
import dev.ardijorganxhi.userapi.model.request.LoginRequest;
import dev.ardijorganxhi.userapi.model.request.RegisterRequest;
import dev.ardijorganxhi.userapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final AuthMapper authMapper;

    public void register(RegisterRequest request) {
        final User user = authMapper.register(request);
        userRepository.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public User login(LoginRequest request) {
        return userRepository.findByEmailAndPassword(request.getEmail(), request.getPassword()).orElseThrow();
    }

}
