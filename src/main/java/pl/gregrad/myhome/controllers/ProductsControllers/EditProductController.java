package pl.gregrad.myhome.controllers.ProductsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.myhome.dto.ProductsDTO;
import pl.gregrad.myhome.services.Products.ProductsService;

import java.util.ArrayList;

@Controller
@RequestMapping("/products")
public class EditProductController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/edit/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        model.addAttribute("editProduct", productsService.findProduct(id));
        ArrayList<String> categories = new ArrayList<>();
        categories.add(0, "Spozywcze");
        categories.add(1, "Gospodarcze");
        model.addAttribute("editCategory", categories);
        return "Edit_Product";
    }
    @PostMapping("/edit/{id}")
    public String editProduct(@ModelAttribute ProductsDTO editProduct) {
        productsService.edit(editProduct);
        return "redirect:/products/all_Products";
    }
}
