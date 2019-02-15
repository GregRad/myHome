package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.Consumption.ConsumptionService;

@Controller
@RequestMapping("/consumption")
public class ConsumptionController {

    @Autowired
    private ConsumptionService consumptionService;

    @GetMapping("/all_Consumptions")
    public String allConsumption() {
        consumptionService.findAllConsumptions();
        return "Consumption";
    }

}
