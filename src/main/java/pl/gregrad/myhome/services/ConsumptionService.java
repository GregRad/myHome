package pl.gregrad.myhome.services;


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

    public List<ConsumptionDTO> findAllConsumption() {
        List<Consumption> consumptions = consumptionRepository.findAll();
        List<ConsumptionDTO> consumptionList = new ArrayList<>();
        for (Consumption c : consumptions) {
            ConsumptionDTO allConsumptions = new ConsumptionDTO();
            allConsumptions.setName(c.getName());
            allConsumptions.setValue(c.getValue());
            consumptionList.add(allConsumptions);
        }
        return consumptionList;
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
