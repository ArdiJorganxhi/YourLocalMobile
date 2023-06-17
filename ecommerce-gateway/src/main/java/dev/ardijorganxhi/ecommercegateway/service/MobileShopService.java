package dev.ardijorganxhi.ecommercegateway.service;

import dev.ardijorganxhi.ecommercegateway.client.MobileShopApiClient;
import dev.ardijorganxhi.ecommercegateway.model.request.MobileShopRequest;
import dev.ardijorganxhi.ecommercegateway.model.response.MobileShopDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileShopService {

    private final MobileShopApiClient mobileShopApiClient;

    public void createMobileShop(MobileShopRequest request, Integer userId) {
        mobileShopApiClient.createMobileShop(request, userId);
    }

    public MobileShopDtoResponse getMobileShopById(Integer id) {
        return mobileShopApiClient.getMobileShopById(id);
    }
}
