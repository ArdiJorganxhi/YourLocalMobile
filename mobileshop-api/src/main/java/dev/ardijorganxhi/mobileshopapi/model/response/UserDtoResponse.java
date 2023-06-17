package dev.ardijorganxhi.mobileshopapi.model.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoResponse {

    private Integer id;
    private String username;
}
