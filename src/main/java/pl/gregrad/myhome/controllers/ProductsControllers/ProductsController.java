package pl.gregrad.myhome.controllers.ProductsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.ProductsDTO;
import pl.gregrad.myhome.services.Products.ProductsService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/all_Products")
    public String shopping(Model model) {
        List<ProductsDTO> products = productsService.findAllProducts();
        model.addAttribute("allProducts", products);
        return "Products";
    }
    @GetMapping("/")
    public String category (Model model) {
        List<ProductsDTO> byCategory = productsService.findProductByCategory("Gospodarcze");
        model.addAttribute("productsByCategory", byCategory);
        return "Products";
    }
}
