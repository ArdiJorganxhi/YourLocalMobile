package dev.ardijorganxhi.ecommercegateway.service;

import dev.ardijorganxhi.ecommercegateway.client.PhoneApiClient;
import dev.ardijorganxhi.ecommercegateway.model.response.PhoneDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneApiClient phoneApiClient;

    public PhoneDtoResponse findById(Integer id) {
        return phoneApiClient.getById(id);
    }

    public void deleteById(Integer id) {
        phoneApiClient.deleteById(id);
    }
}
