package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumption/deleteConsumption")
public class DeleteConsumptionController {

    public String deleteConsumption() {
        return "redirect:/consumption";
    }
}
