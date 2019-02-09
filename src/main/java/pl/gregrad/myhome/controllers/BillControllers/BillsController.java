package pl.gregrad.myhome.controllers.BillControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.BillsDTO;
import pl.gregrad.myhome.services.BillsService;

import java.util.List;

@Controller
@RequestMapping("/bills")
public class BillsController {

    @Autowired
    private BillsService billsService;

    @GetMapping("/allBills")
    public String bills(Model model) {
        List<BillsDTO> allBills = billsService.findAllBills();
        model.addAttribute("bills", allBills);
        return "Bills";
    }
}
