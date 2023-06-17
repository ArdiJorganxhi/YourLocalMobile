package dev.ardijorganxhi.ecommercegateway.client;

import dev.ardijorganxhi.ecommercegateway.model.request.LoginRequest;
import dev.ardijorganxhi.ecommercegateway.model.request.RegisterRequest;
import dev.ardijorganxhi.ecommercegateway.model.response.UserDtoResponse;
import dev.ardijorganxhi.ecommercegateway.model.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;


@FeignClient(value = "userapiclient", url = "${user.api.url}")
public interface UserApiClient {

    @PostMapping("/auth/register")
    void register(@RequestBody RegisterRequest request);

    @GetMapping("/auth/login")
    UserResponse login(LoginRequest request);

    @GetMapping("/auth/{user}")
    Optional<UserResponse> getUser(@PathVariable String user);

    @GetMapping("/users/{id}")
    UserDtoResponse getUserById(@PathVariable Integer id);
}
