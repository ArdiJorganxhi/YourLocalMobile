package dev.ardijorganxhi.ecommercegateway.client;

import dev.ardijorganxhi.ecommercegateway.model.request.MobileShopRequest;
import dev.ardijorganxhi.ecommercegateway.model.request.RegisterPhoneRequest;
import dev.ardijorganxhi.ecommercegateway.model.response.MobileShopDtoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "mobileshopclient", url = "${mobileshop.api.url}")
public interface MobileShopApiClient {

    @PostMapping("/{userId}")
    void createMobileShop(@RequestBody MobileShopRequest request, @PathVariable Integer userId);

    @GetMapping("/{id}")
    MobileShopDtoResponse getMobileShopById(@PathVariable Integer id);

    @PostMapping("/{mobileShopId}/phones/{phoneId}")
    void registerPhoneToMobileShop(@PathVariable Integer mobileShopId, @PathVariable Integer phoneId, @RequestBody RegisterPhoneRequest request);

    @DeleteMapping("/{mobileShopId}/phones/{phoneId}")
    void deletePhoneToMobileShop(@PathVariable Integer mobileShopId, @PathVariable Integer phoneId);
}
