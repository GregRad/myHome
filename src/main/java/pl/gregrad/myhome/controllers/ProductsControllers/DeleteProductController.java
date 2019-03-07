package pl.gregrad.myhome.controllers.ProductsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.Shopping.ProductsService;

@Controller
@RequestMapping("/products")
public class DeleteProductController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/confirm/{id}")
    public String confirm(@PathVariable Long id, Model model){
        model.addAttribute("product", productsService.findProduct(id));
        return "Delete_Product";
    }

    @GetMapping("/delete/{id}")
    public String addProduct(@PathVariable Long id) {
        productsService.delete(id);
        return "redirect:/products/all_Products";
    }
}
