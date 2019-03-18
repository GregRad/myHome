package pl.gregrad.myhome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.gregrad.myhome.entity.Products;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    @Query ("SELECT p FROM Products p WHERE CATEGORY(p.category) = :category")
    List<Products> findProductsByCategory (@Param("category") String category);
}
