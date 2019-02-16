package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.ConsumptionDTO;
import pl.gregrad.myhome.services.Consumption.ConsumptionService;

import java.util.List;

@Controller
@RequestMapping("/consumption")
public class ConsumptionController {

    @Autowired
    private ConsumptionService consumptionService;

    @GetMapping("/all_Consumptions")
    public String consumptions(Model model) {
        List<ConsumptionDTO> allConsumptions = consumptionService.findAllConsumptions();
        model.addAttribute("consumptions", allConsumptions);
        return "Consumptions";
    }

}
