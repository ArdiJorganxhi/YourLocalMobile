package dev.ardijorganxhi.mobileshopapi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mobileshops_phones", uniqueConstraints = {@UniqueConstraint(columnNames = {"mobile_shop_id", "phone_id"})})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileShopPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mobile_shop_id", nullable = false)
    private Integer mobileShopId;

    @Column(name = "phone_id", nullable = false)
    private Integer phoneId;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;

}
