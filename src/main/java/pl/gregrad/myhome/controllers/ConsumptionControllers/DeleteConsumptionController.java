package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.Consumption.ConsumptionService;

@Controller
@RequestMapping("/consumption")
public class DeleteConsumptionController {

    @Autowired
    ConsumptionService consumptionService;

    @GetMapping("/confirm/delete_consumption/{id}")
    public String confirm(@PathVariable Long id, Model model) {
        model.addAttribute("consumption", consumptionService.findConsumption(id));
        return "Delete_Consumption";
    }


    @GetMapping("/delete/{id}")
    public String deleteConsumption(@PathVariable Long id) {
        consumptionService.delete(id);
        return "redirect:/consumption/all_Consumptions";
    }
}
