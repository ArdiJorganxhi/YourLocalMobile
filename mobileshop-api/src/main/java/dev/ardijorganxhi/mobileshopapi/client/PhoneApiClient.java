package dev.ardijorganxhi.mobileshopapi.client;

import dev.ardijorganxhi.mobileshopapi.model.response.PhoneDtoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "phoneapiclient", url = "${phone.api.url}")
public interface PhoneApiClient {

    @GetMapping("/{id}")
    PhoneDtoResponse getById(@PathVariable Integer id);
}
