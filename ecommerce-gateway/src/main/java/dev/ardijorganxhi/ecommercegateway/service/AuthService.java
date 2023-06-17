package dev.ardijorganxhi.ecommercegateway.service;


import dev.ardijorganxhi.ecommercegateway.client.UserApiClient;
import dev.ardijorganxhi.ecommercegateway.config.PasswordEncoder;
import dev.ardijorganxhi.ecommercegateway.model.request.LoginRequest;
import dev.ardijorganxhi.ecommercegateway.model.request.RegisterRequest;
import dev.ardijorganxhi.ecommercegateway.model.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService implements UserDetailsService {


    private final UserApiClient userApiClient;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;


    public void register(RegisterRequest request) {
        RegisterRequest registerRequest = RegisterRequest.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.bCryptPasswordEncoder().encode(request.getPassword()))
                .build();

        userApiClient.register(registerRequest);
    }

    public Optional<UserResponse> findByEmail(String email) {
        return userApiClient.getUser(email);
    }

    public String login(LoginRequest request) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception(e.getMessage());
        }

        UserResponse user = findByEmail(request.getEmail()).orElseThrow();
        return tokenService.generateToken(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByEmail(username).orElseThrow();
    }
}
