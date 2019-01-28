package pl.gregrad.myhome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.myhome.entity.Consumption;

public interface ConsumptionRepository extends JpaRepository<Consumption, Long> {
}
