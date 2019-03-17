package pl.gregrad.myhome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.myhome.entity.Products;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    List<Products> findProductsByCategory (String cateygory);
}
