package dev.ardijorganxhi.mobileshopapi.repository;

import dev.ardijorganxhi.mobileshopapi.entity.MobileShopPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MobileShopPhoneRepository extends JpaRepository<MobileShopPhone, Integer> {

    Optional<MobileShopPhone> findByMobileShopIdAndPhoneId(Integer mobileShopId, Integer phoneId);
}
