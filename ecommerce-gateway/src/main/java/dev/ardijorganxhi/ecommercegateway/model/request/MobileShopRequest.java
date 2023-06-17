package dev.ardijorganxhi.ecommercegateway.model.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileShopRequest {

    private String name;
    private String address;
    private String phoneNumber;
}
