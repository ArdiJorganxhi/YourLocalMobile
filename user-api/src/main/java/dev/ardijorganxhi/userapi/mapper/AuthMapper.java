package dev.ardijorganxhi.userapi.mapper;

import dev.ardijorganxhi.userapi.entity.User;
import dev.ardijorganxhi.userapi.model.request.RegisterRequest;
import org.springframework.stereotype.Component;

@Component
public class AuthMapper {

    public User register(RegisterRequest request) {
        return User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }
}
