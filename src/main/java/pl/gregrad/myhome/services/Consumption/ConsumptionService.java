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
            consumptionList.add(allConsumptions);
        }
        return consumptionList;
    }

    public ConsumptionDTO findConsumption(Long id) {
        Consumption consumption = consumptionRepository.findOne(id);
        ConsumptionDTO findConsumption = new ConsumptionDTO();
        findConsumption.setName(consumption.getName());
        findConsumption.setValue(consumption.getValue());

        return findConsumption;
    }

    public void delete(Long id) {
        consumptionRepository.delete(consumptionRepository.findOne(id));
    }

    public void edit(ConsumptionDTO consumption) {
        Consumption editConsumption = consumptionRepository.findOne(consumption.getId());
        editConsumption.setName(consumption.getName());
        editConsumption.setValue(consumption.getValue());
        consumptionRepository.save(editConsumption);
    }
}
