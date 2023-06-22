package dev.ardijorganxhi.ecommercegateway.controller;

import dev.ardijorganxhi.ecommercegateway.model.request.MobileShopRequest;
import dev.ardijorganxhi.ecommercegateway.model.request.RegisterPhoneRequest;
import dev.ardijorganxhi.ecommercegateway.model.response.MobileShopDtoResponse;
import dev.ardijorganxhi.ecommercegateway.service.MobileShopService;
import lombok.RequiredArgsConstructor;
import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static dev.ardijorganxhi.ecommercegateway.utils.MdcConstant.X_USER_ID;

@RestController
@RequestMapping("/api/mobile-shops")
@RequiredArgsConstructor
public class MobileShopController {

    private final MobileShopService mobileShopService;

    @PostMapping
    public void createMobileShop(@RequestBody MobileShopRequest request) {
        mobileShopService.createMobileShop(request, Integer.valueOf(MDC.get(X_USER_ID)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MobileShopDtoResponse> getMobileShopById(@PathVariable Integer id) {
        return ResponseEntity.ok(mobileShopService.getMobileShopById(id));
    }

    @PostMapping("/{mobileShopId}/phones/{phoneId}")
    public void registerPhoneToMobileShop(@PathVariable Integer mobileShopId, @PathVariable Integer phoneId, @RequestBody RegisterPhoneRequest request) {
        mobileShopService.registerPhoneToMobileShop(mobileShopId, phoneId, request);
    }
    @DeleteMapping("/{mobileShopId}/phones/{phoneId}")
    public void deletePhoneFromMobileShop(@PathVariable Integer mobileShopId, @PathVariable Integer phoneId) {
        mobileShopService.deletePhoneFromMobileShop(mobileShopId, phoneId);
    }
}
