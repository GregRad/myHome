package pl.gregrad.myhome.controllers.ConsumptionControllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.ConsumptionDTO;
import pl.gregrad.myhome.services.Consumption.AddConsumptionService;


@Controller
@RequestMapping("/consumption")
public class AddConsumptionController {

    @Autowired
    private AddConsumptionService addConsumptionService;

    @GetMapping("/add_Consumption")
    public String showConsumptionForm(Model model) {
        model.addAttribute("consumptionForm", new ConsumptionDTO());
        List<String> type = new ArrayList<String>();
        type.add(0, "Zimna woda");
        type.add(1, "Ciepla woda");
        type.add(2, "Prad");
        model.addAttribute("type", type);
        return "Add_Consumption";
    }
    @PostMapping("/add_Consumption")
    public String addConsumption(@ModelAttribute ConsumptionDTO consumption) {
        addConsumptionService.addConsumption(consumption);
        return "redirect:/consumption/all_Consumptions";
    }
}
