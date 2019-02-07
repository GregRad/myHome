package pl.gregrad.myhome.controllers.BillControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bills/editBill")
public class EditBillController {

    @GetMapping
    public String editBillForm() {
        return "Edit_Bill";
    }
}
