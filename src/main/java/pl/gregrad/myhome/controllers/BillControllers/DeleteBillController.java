package pl.gregrad.myhome.controllers.BillControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.Bills.BillsService;


@Controller
@RequestMapping("/bills")
public class DeleteBillController {

    @Autowired
    BillsService billsService;

    @GetMapping("/confirm/delete_bill/{id}")
    public String confirm(@PathVariable Long id, Model model) {
        model.addAttribute("bill", billsService.findBill(id));
        return "Delete_Bill";
    }

    @GetMapping("/delete/{id}")
    public String deleteBill(@PathVariable Long id) {
        billsService.delete(id);
        return "redirect:/bills/all_Bills";

    }
}
