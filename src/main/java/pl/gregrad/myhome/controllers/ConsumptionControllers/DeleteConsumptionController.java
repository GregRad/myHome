package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.Consumption.ConsumptionService;

@Controller
@RequestMapping("/consumption")
public class DeleteConsumptionController {

    @Autowired
    ConsumptionService consumptionService;

    @GetMapping("/delete/{id}")
    public String deleteConsumption(@PathVariable Long id) {
        consumptionService.delete(id);
        return "redirect:/consumption/all_Consumptions";
    }
}
