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
        List<Consumption> consumption = consumptionRepository.findAll();
        List<ConsumptionDTO> allConsumption = new ArrayList<>();
        for (Consumption c : consumption) {
            ConsumptionDTO consumptionAll = new ConsumptionDTO();
            consumptionAll.setName(c.getName());
            consumptionAll.setValue(c.getValue());
            allConsumption.add(consumptionAll);
        }
        return allConsumption;
    }

    public void deleteConsumption(Long id) {
        consumptionRepository.delete(consumptionRepository.findOne(id));
    }

    public void editConsumption(ConsumptionDTO consumption) {
        Consumption editConsumption = consumptionRepository.findOne(consumption.getId());
        editConsumption.setName(consumption.getName());
        editConsumption.setValue(consumption.getValue());
        consumptionRepository.save(editConsumption);
    }
}
