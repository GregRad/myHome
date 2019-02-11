package pl.gregrad.myhome.controllers.BillControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.BillsService;

@Controller
@RequestMapping("/bills")
public class DeleteBillController {

    @Autowired
    BillsService billsService;

    @GetMapping("/delete/{id}")
    public String deleteBill(@PathVariable Long id) {
        billsService.delete(id);
        return "redirect:/bills/all_Bills";
    }
}
