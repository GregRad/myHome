package pl.gregrad.myhome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.myhome.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
