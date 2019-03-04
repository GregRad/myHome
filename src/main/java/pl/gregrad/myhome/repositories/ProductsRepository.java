package pl.gregrad.myhome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.myhome.entity.Shopping;

public interface ShoppingRepository extends JpaRepository<Shopping, Long> {
}
