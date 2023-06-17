package dev.ardijorganxhi.mobileshopapi.repository;

import dev.ardijorganxhi.mobileshopapi.entity.MobileShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileShopRepository extends JpaRepository<MobileShop, Integer> {
}
