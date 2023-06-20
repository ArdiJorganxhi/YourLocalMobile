package dev.ardijorganxhi.ecommercegateway.controller;

import dev.ardijorganxhi.ecommercegateway.model.response.PhoneDtoResponse;
import dev.ardijorganxhi.ecommercegateway.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/phones")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping("/{id}")
    public ResponseEntity<PhoneDtoResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(phoneService.findById(id));
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        phoneService.deleteById(id);
    }
}
