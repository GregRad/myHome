package pl.gregrad.myhome.controllers.ProductsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.ProductsDTO;
import pl.gregrad.myhome.services.Shopping.AddProductsService;

@Controller
@RequestMapping("/shopping")
public class AddProductController {

    @Autowired
    AddProductsService addShoppingService;

    @GetMapping
    public String addProductForm(Model model) {
        model.addAttribute("productForm", new ProductsDTO());
        return "Add_Product";
    }
    @PostMapping
    public String addProduct(@ModelAttribute ProductsDTO product) {
        addShoppingService.addProduct(product);
        return "redirect:/shopping/all_Products";
    }
}
