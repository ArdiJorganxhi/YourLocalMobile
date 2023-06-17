package dev.ardijorganxhi.mobileshopapi.mapper;

import dev.ardijorganxhi.mobileshopapi.entity.MobileShop;
import dev.ardijorganxhi.mobileshopapi.model.dto.MobileShopDto;
import dev.ardijorganxhi.mobileshopapi.model.request.MobileShopRequest;
import org.springframework.stereotype.Component;

@Component
public class MobileShopMapper {

    public MobileShop createMobileShop(MobileShopRequest request, Integer userId) {
        return MobileShop.builder()
                .name(request.getName())
                .address(request.getAddress())
                .phoneNumber(request.getPhoneNumber())
                .userId(userId)
                .build();
    }

    public MobileShopDto toDto(MobileShop mobileShop) {
        return MobileShopDto.builder()
                .id(mobileShop.getId())
                .name(mobileShop.getName())
                .address(mobileShop.getAddress())
                .phoneNumber(mobileShop.getPhoneNumber())
                .build();
    }
}
