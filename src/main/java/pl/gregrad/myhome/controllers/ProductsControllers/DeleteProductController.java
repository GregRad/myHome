package pl.gregrad.myhome.controllers.ProductsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.Shopping.ProductsService;

@Controller
@RequestMapping("/products")
public class DeleteProductController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/delete/{id}")
    public String addProduct(@PathVariable Long id) {
        productsService.delete(id);
        return "redirect:/products/all_Products";
    }
}
