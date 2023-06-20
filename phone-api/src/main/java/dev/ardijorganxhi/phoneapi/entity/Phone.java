package dev.ardijorganxhi.phoneapi.entity;

import dev.ardijorganxhi.phoneapi.model.enums.PhoneBrand;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mobile_phones")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone_brand", nullable = false)
    @Enumerated(EnumType.STRING)
    private PhoneBrand brand;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;
}
