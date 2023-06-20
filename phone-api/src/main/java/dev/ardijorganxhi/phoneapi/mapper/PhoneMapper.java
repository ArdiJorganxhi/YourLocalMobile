package dev.ardijorganxhi.phoneapi.mapper;

import dev.ardijorganxhi.phoneapi.entity.Phone;
import dev.ardijorganxhi.phoneapi.model.dto.PhoneDto;
import dev.ardijorganxhi.phoneapi.model.enums.PhoneBrand;
import org.springframework.stereotype.Component;

@Component
public class PhoneMapper {

    public Phone convertToEntity(PhoneBrand brand, String name) {
        return Phone.builder()
                .name(name)
                .brand(brand)
                .isDeleted(false)
                .build();
    }

    public PhoneDto convertToDto(Phone phone) {
        return PhoneDto.builder()
                .id(phone.getId())
                .name(phone.getName())
                .phoneBrand(phone.getBrand())
                .build();
    }
}
