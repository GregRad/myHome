package pl.gregrad.myhome.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.gregrad.myhome.entity.Consumption;

public interface ConsumptionRepository extends JpaRepository<Consumption, Long> {
	
	@Query("SELECT c FROM Consumption c WHERE c.type =:type")
	List<Consumption> consumptionsByType (@Param("type") String type); 
	
	@Query("SELECT c FROM Consumption c WHERE YEAR(c.date) =:year")
	List<Consumption> consumptionsByYear (@Param("year") Integer year);
	
	@Query("SELECT c FROM Consumption c WHERE MONTH(c.date) =: month")
	List<Consumption> consumptionsByMonth (@Param("month") Integer month);
	
	@Query("SELECT c FROM Consumptions c WHERE YEAR(c.date) =:year AND c.type =: type")
	List<Consumption> consumptionsTypeByYear (@Param("year") Integer year, @Param("type") String type);

	@Query("SELECT c FROM Consumptions c WHERE MONTH(c.date) =:month AND c.type =: type")
	List<Consumption> consumptionsTypeByMonth (@Param("month") Integer month, @Param("type") String type);
}

