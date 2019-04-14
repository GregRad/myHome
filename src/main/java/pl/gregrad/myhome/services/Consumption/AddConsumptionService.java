package pl.gregrad.myhome.services.Consumption;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.myhome.dto.ConsumptionDTO;
import pl.gregrad.myhome.entity.Consumption;
import pl.gregrad.myhome.repositories.ConsumptionRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddConsumptionService {

    @Autowired
    private ConsumptionRepository consumptionRepository;

    public void addConsumption(ConsumptionDTO consumptionForm) {
        Consumption consumption = new Consumption();
        consumption.setUnit(consumptionForm.getUnit());
        consumption.setValue(consumptionForm.getValue());
        consumption.setType(consumptionForm.getType());
        consumption.setDate(consumptionForm.getDate());
        consumptionRepository.save(consumption);

    }




}
