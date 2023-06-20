package dev.ardijorganxhi.phoneapi.model.dto;

import dev.ardijorganxhi.phoneapi.model.enums.PhoneBrand;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDto {

    private Integer id;
    private String name;
    private PhoneBrand phoneBrand;
}
