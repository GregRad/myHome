package pl.gregrad.myhome.controllers.ConsumptionControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.myhome.dto.ConsumptionDTO;
import pl.gregrad.myhome.services.Consumption.ConsumptionService;

@Controller
@RequestMapping("/consumption")
public class EditConsumptionController {

    @Autowired
    private ConsumptionService consumptionService;

    @GetMapping("/editConsumption/{id}")
    public String editConsumptionForm(@PathVariable Long id, Model model) {
        model.addAttribute("editConsumption", consumptionService.findConsumption(id));
        return "Edit_Consumption";
    }
    @PostMapping("/editConsumption/{id}")
    public String editConsumption(@ModelAttribute ConsumptionDTO editConsumption){
        consumptionService.edit(editConsumption);
        return "redirect:/consumption/all_Consumptions";
    }
}
