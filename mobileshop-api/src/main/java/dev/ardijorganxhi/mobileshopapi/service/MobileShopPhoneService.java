package dev.ardijorganxhi.mobileshopapi.service;

import dev.ardijorganxhi.mobileshopapi.client.PhoneApiClient;
import dev.ardijorganxhi.mobileshopapi.entity.MobileShop;
import dev.ardijorganxhi.mobileshopapi.entity.MobileShopPhone;
import dev.ardijorganxhi.mobileshopapi.mapper.MobileShopMapper;
import dev.ardijorganxhi.mobileshopapi.model.dto.MobileShopDto;
import dev.ardijorganxhi.mobileshopapi.model.request.MobileShopRequest;
import dev.ardijorganxhi.mobileshopapi.model.request.RegisterPhoneRequest;
import dev.ardijorganxhi.mobileshopapi.model.response.PhoneDtoResponse;
import dev.ardijorganxhi.mobileshopapi.repository.MobileShopPhoneRepository;
import dev.ardijorganxhi.mobileshopapi.repository.MobileShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileShopPhoneService {

    private final MobileShopPhoneRepository mobileShopPhoneRepository;
    private final MobileShopMapper mobileShopMapper;

    public void registerPhoneToMobileShop(Integer mobileShopId, Integer phoneId, RegisterPhoneRequest request) {
        final MobileShopPhone mobileShopPhone = mobileShopMapper.registerPhoneToMobileShop(mobileShopId, phoneId, request);
        mobileShopPhoneRepository.save(mobileShopPhone);
    }

    public void deletePhoneFromMobileShop(Integer mobileShopId, Integer phoneId) {
        final MobileShopPhone mobileShopPhone = mobileShopPhoneRepository.findByMobileShopIdAndPhoneId(mobileShopId, phoneId).orElseThrow();
        mobileShopPhone.setDeleted(true);
        mobileShopPhoneRepository.save(mobileShopPhone);
    }


}
