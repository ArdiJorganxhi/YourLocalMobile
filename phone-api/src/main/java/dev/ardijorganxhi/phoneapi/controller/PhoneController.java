package dev.ardijorganxhi.phoneapi.controller;

import dev.ardijorganxhi.phoneapi.model.dto.PhoneDto;
import dev.ardijorganxhi.phoneapi.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phones")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @PostMapping
    public void savePhones() {
        phoneService.savePhones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhoneDto> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(phoneService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        phoneService.deleteById(id);
    }
 }
