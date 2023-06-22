package dev.ardijorganxhi.mobileshopapi.model.request;

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
