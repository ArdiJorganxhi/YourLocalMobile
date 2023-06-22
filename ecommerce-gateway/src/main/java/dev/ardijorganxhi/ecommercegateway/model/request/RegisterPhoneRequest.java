package dev.ardijorganxhi.ecommercegateway.model.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterPhoneRequest {

    private Long price;
    private Integer stock;
}
