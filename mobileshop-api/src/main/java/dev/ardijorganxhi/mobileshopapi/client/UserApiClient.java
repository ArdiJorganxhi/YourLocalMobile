package dev.ardijorganxhi.mobileshopapi.client;


import dev.ardijorganxhi.mobileshopapi.model.response.UserDtoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userapiclient", url = "${user.api.url}")
public interface UserApiClient {

    @GetMapping("/users/{id}")
    UserDtoResponse getUser(@PathVariable Integer id);
}
