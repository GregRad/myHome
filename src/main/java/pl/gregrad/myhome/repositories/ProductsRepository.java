package pl.gregrad.myhome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.gregrad.myhome.entity.Products;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    @Query ("SELECT p FROM Products p WHERE p.category = :category")
    List<Products> findProductsByCategory (@Param("category") String category);

    @Query ("SELECT d FROM Products d WHERE MONTH(d.date) = :date")
    List<Products> findProductsByDate (@Param("date") Integer date);
}
