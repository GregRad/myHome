package pl.gregrad.myhome.controllers.ConsumptionControllers;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/edit/{id}")
    public String editConsumptionForm(@PathVariable Long id, Model model) {
    	model.addAttribute("editConsumption", consumptionService.findConsumption(id));
        List<String> type = new ArrayList<>();
        type.add(0, "Zimna woda");
        type.add(1, "Ciepla woda");
        type.add(2, "Prad");
        model.addAttribute("editType", type);
        return "Edit_Consumption";
    }
    @PostMapping("/edit/{id}")
    public String editConsumption(@ModelAttribute ConsumptionDTO editConsumption){
        consumptionService.edit(editConsumption);
        return "redirect:/consumption/all_Consumptions";
    }
}
