package pl.gregrad.myhome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.myhome.entity.Bills;

public interface BillsRepository extends JpaRepository<Bills, Long> {
}
