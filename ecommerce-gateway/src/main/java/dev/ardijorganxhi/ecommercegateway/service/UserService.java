package dev.ardijorganxhi.ecommercegateway.service;

import dev.ardijorganxhi.ecommercegateway.client.UserApiClient;
import dev.ardijorganxhi.ecommercegateway.model.response.UserDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserApiClient userApiClient;

    public UserDtoResponse getUserById(Integer id) {
        return userApiClient.getUserById(id);
    }
}
