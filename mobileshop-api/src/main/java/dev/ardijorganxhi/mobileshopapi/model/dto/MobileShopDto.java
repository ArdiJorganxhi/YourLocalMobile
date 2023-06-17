package dev.ardijorganxhi.mobileshopapi.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileShopDto {

    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
}
