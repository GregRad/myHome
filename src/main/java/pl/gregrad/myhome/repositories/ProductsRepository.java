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
    
    @Query ("SELECT c FROM Products c WHERE YEAR(c.date) =:year AND MONTH(c.date) =:date AND c.category = :category")
    List<Products> findCategorizeProducts (@Param("year") Integer year, @Param("date") Integer date, @Param("category") String category);
    
    @Query ("SELECT y FROM Products y WHERE YEAR(y.date) =:date")
    List<Products> findProductsByYear (@Param("date") Integer date);
    
}
