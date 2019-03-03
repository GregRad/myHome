package pl.gregrad.myhome.controllers.ShoppingControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.ShoppingDTO;
import pl.gregrad.myhome.services.Shopping.AddShoppingService;

@Controller
@RequestMapping("/shopping")
public class AddProductController {

    @Autowired
    AddShoppingService addShoppingService;

    @GetMapping
    public String addProductForm(Model model) {
        model.addAttribute("productForm", new ShoppingDTO());
        return "Add_Product";
    }
    @PostMapping
    public String addProduct(@ModelAttribute ShoppingDTO product) {
        addShoppingService.addProduct(product);
        return "redirect:/shopping/all_Products";
    }
}
