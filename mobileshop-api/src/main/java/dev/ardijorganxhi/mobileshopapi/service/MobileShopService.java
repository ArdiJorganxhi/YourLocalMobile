package dev.ardijorganxhi.mobileshopapi.service;

import dev.ardijorganxhi.mobileshopapi.entity.MobileShop;
import dev.ardijorganxhi.mobileshopapi.mapper.MobileShopMapper;
import dev.ardijorganxhi.mobileshopapi.model.dto.MobileShopDto;
import dev.ardijorganxhi.mobileshopapi.model.request.MobileShopRequest;
import dev.ardijorganxhi.mobileshopapi.repository.MobileShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileShopService {

    private final MobileShopRepository mobileShopRepository;
    private final MobileShopMapper mobileShopMapper;

    public void createMobileShop(MobileShopRequest request, Integer userId) {
        final MobileShop mobileShop = mobileShopMapper.createMobileShop(request, userId);
        mobileShopRepository.save(mobileShop);
    }

    public MobileShopDto findById(Integer id) {
        final MobileShop mobileShop = mobileShopRepository.findById(id).orElseThrow();
        return mobileShopMapper.toDto(mobileShop);
    }
}
