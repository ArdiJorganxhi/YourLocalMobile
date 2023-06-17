package dev.ardijorganxhi.mobileshopapi.controller;

import dev.ardijorganxhi.mobileshopapi.model.dto.MobileShopDto;
import dev.ardijorganxhi.mobileshopapi.model.request.MobileShopRequest;
import dev.ardijorganxhi.mobileshopapi.service.MobileShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mobile-shops")
@RequiredArgsConstructor
public class MobileShopController {

    private final MobileShopService mobileShopService;

    @PostMapping("/{userId}")
    public void createMobileShop(@RequestBody MobileShopRequest request, @PathVariable Integer userId) {
        mobileShopService.createMobileShop(request, userId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MobileShopDto> getMobileShopById(@PathVariable Integer id) {
        return ResponseEntity.ok(mobileShopService.findById(id));
    }
}
