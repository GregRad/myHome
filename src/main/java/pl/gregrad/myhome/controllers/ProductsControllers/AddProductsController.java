package pl.gregrad.myhome.controllers.ProductsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.ProductsDTO;
import pl.gregrad.myhome.services.Products.AddProductsService;

import java.util.ArrayList;

@Controller
@RequestMapping("/products")
public class AddProductsController {

    @Autowired
    AddProductsService addProductService;

    @GetMapping("/add_Product")
    public String addProductForm(Model model) {
        model.addAttribute("productForm", new ProductsDTO());
        ArrayList<String> categories = new ArrayList<>();
        categories.add(0, "Spozywcze");
        categories.add(1, "Gospodarcze");
        model.addAttribute("category", categories );
        return "Add_Product";
    }
    @PostMapping("/add_Product")
    public String addProduct(@ModelAttribute ProductsDTO product) {
        addProductService.addProduct(product);
        return "redirect:/products/list";
    }
}
