package pl.gregrad.myhome.controllers.BillControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bills/deleteBill")
public class DeleteBillController {

    @GetMapping
    public String deleteBill() {
        return "redirect:/bills";
    }
}
