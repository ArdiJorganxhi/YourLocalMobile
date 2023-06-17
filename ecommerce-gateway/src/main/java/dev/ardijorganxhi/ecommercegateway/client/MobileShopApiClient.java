package dev.ardijorganxhi.ecommercegateway.client;

import dev.ardijorganxhi.ecommercegateway.model.request.MobileShopRequest;
import dev.ardijorganxhi.ecommercegateway.model.response.MobileShopDtoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "mobileshopclient", url = "${mobileshop.api.url}")
public interface MobileShopApiClient {

    @PostMapping("/mobile-shops/{userId}")
    void createMobileShop(@RequestBody MobileShopRequest request, @PathVariable Integer userId);

    @GetMapping("/mobile-shops/{id}")
    MobileShopDtoResponse getMobileShopById(@PathVariable Integer id);
}
