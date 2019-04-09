package pl.gregrad.myhome.services.Consumption;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pl.gregrad.myhome.dto.ConsumptionDTO;
import pl.gregrad.myhome.entity.Consumption;
import pl.gregrad.myhome.repositories.ConsumptionRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ConsumptionService {

    @Autowired
    private ConsumptionRepository consumptionRepository;

    public List<ConsumptionDTO> findAllConsumptions() {
        List<Consumption> consumptions = consumptionRepository.findAll();
        List<ConsumptionDTO> consumptionList = new ArrayList<>();
        for (Consumption c : consumptions) {
            ConsumptionDTO allConsumptions = new ConsumptionDTO();
            allConsumptions.setId(c.getId());
            allConsumptions.setName(c.getName());
            allConsumptions.setValue(c.getValue());
            allConsumptions.setType(c.getType());
            allConsumptions.setDate(c.getDate());
            consumptionList.add(allConsumptions);
        }
        return consumptionList;
    }

    public ConsumptionDTO findConsumption(Long id) {
        Consumption consumption = consumptionRepository.findOne(id);
        ConsumptionDTO findConsumption = new ConsumptionDTO();
        findConsumption.setId(consumption.getId());
        findConsumption.setName(consumption.getName());
        findConsumption.setValue(consumption.getValue());
        findConsumption.setDate(consumption.getDate());
        findConsumption.setType(consumption.getType());
        return findConsumption;
    }
    public List<ConsumptionDTO> findConsumptionByType (String type) {
    	List<Consumption> consumptions= consumptionRepository.findConsumptionsByType(type);
    	List<ConsumptionDTO> findConsumptionByType = new ArrayList<>();
    	for (Consumption c : consumptions) {
    		ConsumptionDTO consumptionByType = new ConsumptionDTO();
    		consumptionByType.setId(c.getId());
    		consumptionByType.setDate(c.getDate());
    		consumptionByType.setName(c.getName());
    		consumptionByType.setType(c.getType());
    		consumptionByType.setValue(c.getValue());
    		findConsumptionByType.add(consumptionByType);
    	}
    	return findConsumptionByType;
    }
    public List<ConsumptionDTO> findConsumptionsByYear (Integer year) {
    	List<Consumption> consumptions = consumptionRepository.findConsumptionsByYear(year);
    	List<ConsumptionDTO> findConsumptionsByYear = findConsumptionsByYear(year);
    	for (Consumption c : consumptions) {
    		ConsumptionDTO consumptionsByYear = new ConsumptionDTO();
     		consumptionsByYear.setName(c.getName());
     		consumptionsByYear.setValue(c.getValue());
     		consumptionsByYear.setType(c.getType());
     		consumptionsByYear.setDate(c.getDate());
     		consumptionsByYear.setId(c.getId());
     		findConsumptionsByYear.add(consumptionsByYear);
    	}
    	return findConsumptionsByYear;
    }
    public List<ConsumptionDTO> findConsumptionsByMonth (Integer month) {
    	List<Consumption> consumptions = consumptionRepository.findConsumptionsByMonth(month);
    	List<ConsumptionDTO> findConsumptionsByMonth = new ArrayList<ConsumptionDTO>();
    	for (Consumption c : consumptions) {
    		ConsumptionDTO consumptionsByMonth = new ConsumptionDTO();
    		consumptionsByMonth.setName(c.getName());
    		consumptionsByMonth.setValue(c.getValue());
    		consumptionsByMonth.setType(c.getType());
    		consumptionsByMonth.setDate(c.getDate());
    		consumptionsByMonth.setId(c.getId());
    		findConsumptionsByMonth.add(consumptionsByMonth);
    	}
    	return findConsumptionsByMonth;
    }
    public List<ConsumptionDTO> findConsumprionsByYearAndType (Integer year, String type) {
    	List<Consumption> consumptions = consumptionRepository.findConsumptionsTypeByYear(year, type);
    	List<ConsumptionDTO> findConsumptionsByYearAndType = new ArrayList<ConsumptionDTO>();
    	for (Consumption c : consumptions) {
    		ConsumptionDTO consumptionsByYearAndType = new ConsumptionDTO();
    		consumptionsByYearAndType.setName(c.getName());
    		consumptionsByYearAndType.setValue(c.getValue());
    		consumptionsByYearAndType.setDate(c.getDate());
    		consumptionsByYearAndType.setId(c.getId());
    		consumptionsByYearAndType.setType(c.getType());
    		findConsumptionsByYearAndType.add(consumptionsByYearAndType);
    	}
    	return findConsumptionsByYearAndType;
    }
    public List<ConsumptionDTO> findConsumprionsByMonthAndType (Integer month, String type) {
    	List<Consumption> consumptions = consumptionRepository.findConsumptionsTypeByMonth(month, type);
    	List<ConsumptionDTO> findConsumptionsByMonthAndType = new ArrayList<ConsumptionDTO>();
    	for (Consumption c : consumptions) {
    		ConsumptionDTO consumptionsByMonthAndType = new ConsumptionDTO();
    		consumptionsByMonthAndType.setName(c.getName());
    		consumptionsByMonthAndType.setValue(c.getValue());
    		consumptionsByMonthAndType.setDate(c.getDate());
    		consumptionsByMonthAndType.setId(c.getId());
    		consumptionsByMonthAndType.setType(c.getType());
    		findConsumptionsByMonthAndType.add(consumptionsByMonthAndType);
    	}
    	return findConsumptionsByMonthAndType;
    }
    
    public void delete(Long id) {
        consumptionRepository.delete(consumptionRepository.findOne(id));
    }

    public void edit(ConsumptionDTO consumption) {
        Consumption editConsumption = consumptionRepository.findOne(consumption.getId());
        editConsumption.setName(consumption.getName());
        editConsumption.setValue(consumption.getValue());
        editConsumption.setDate(consumption.getDate());
        editConsumption.setType(consumption.getType());
        consumptionRepository.save(editConsumption);
    }
}
