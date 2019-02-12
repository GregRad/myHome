package pl.gregrad.myhome.controllers.BillControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.myhome.dto.BillsDTO;
import pl.gregrad.myhome.services.BillsService;

@Controller
@RequestMapping("/bills")
public class EditBillController {

    @Autowired
    private BillsService billsService;

    @GetMapping("/edit/{id}")
    public String editBillForm(@PathVariable Long id, Model model) {
    model.addAttribute("editBill", billsService.findBill(id));
        return "Edit_Bill";
    }

    @PostMapping("/edit/{id}")
    public String editBill(@ModelAttribute BillsDTO editBill) {
        billsService.edit(editBill);
        return "redirect:/bills/all_Bills";

    }
}
