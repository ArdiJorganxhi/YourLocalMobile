package dev.ardijorganxhi.ecommercegateway.controller;

import dev.ardijorganxhi.ecommercegateway.model.response.UserDtoResponse;
import dev.ardijorganxhi.ecommercegateway.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static dev.ardijorganxhi.ecommercegateway.utils.MdcConstant.X_USER_ID;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<UserDtoResponse> getProfile() {
        return ResponseEntity.ok(userService.getUserById(Integer.valueOf(MDC.get(X_USER_ID))));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDtoResponse> getUserById(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
