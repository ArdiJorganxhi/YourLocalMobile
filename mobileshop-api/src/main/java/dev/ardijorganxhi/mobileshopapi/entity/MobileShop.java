package dev.ardijorganxhi.mobileshopapi.entity;

import dev.ardijorganxhi.mobileshopapi.model.response.UserDtoResponse;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mobile_shops")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "user_id", nullable = false)
    private Integer userId;
}
