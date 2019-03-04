package pl.gregrad.myhome.controllers.ShoppingControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.myhome.dto.ShoppingDTO;
import pl.gregrad.myhome.services.Shopping.ShoppingService;

@Controller
@RequestMapping("/shopping")
public class EditProductController {

    @Autowired
    ShoppingService shoppingService;

    @GetMapping("/edit/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        model.addAttribute("editProduct", shoppingService.findProduct(id));
        return "Edit_Product";
    }
    @PostMapping("/edit/{id}")
    public String editProduct(@ModelAttribute ShoppingDTO editProduct) {
        shoppingService.edit(editProduct);
        return "redirect:/shopping/all_Products";
    }
}
