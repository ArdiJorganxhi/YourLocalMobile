package dev.ardijorganxhi.ecommercegateway.model.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileShopDtoResponse {

    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
}
