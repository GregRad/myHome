package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumption/addConsumption")
public class AddConsumptionController {

    public String addConsumption() {
        return "Add_Consumption";
    }
}
