package pl.gregrad.myhome.controllers.BillControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AddBillController {

    @GetMapping
    public String billsForm() {
        return "Add_Bill";
    }
}
