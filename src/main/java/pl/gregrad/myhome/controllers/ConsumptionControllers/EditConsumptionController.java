package pl.gregrad.myhome.controllers.ConsumptionControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("consumption/editConsumption")
public class EditConsumptionController {

    public String editConsumption() {
        return "Edit_Consumption";
    }
}
