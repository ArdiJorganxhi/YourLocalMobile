package dev.ardijorganxhi.ecommercegateway.model.response;

import dev.ardijorganxhi.ecommercegateway.model.enums.PhoneBrand;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDtoResponse {

    private Integer id;
    private String name;
    private PhoneBrand phoneBrand;
}
