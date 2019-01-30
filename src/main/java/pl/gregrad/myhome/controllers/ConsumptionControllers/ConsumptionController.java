package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumption")
public class ConsumptionController {

    @GetMapping
    public String consumption() {
        return "Consumption";
    }
}
