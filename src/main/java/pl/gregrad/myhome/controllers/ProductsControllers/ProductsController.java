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

    @GetMapping("/list")
    public String list() {
        return "Products";
    }

    @GetMapping("/all_Products")
    public String shopping(Model model) {
        List<ProductsDTO> products = productsService.findAllProducts();
        model.addAttribute("allProducts", products);
        return "Products_Summary";
    }
    @GetMapping("/category")
    public String category (Model model) {
        List<ProductsDTO> productsG = productsService.findProductByCategory("Gospodarcze");
        List<ProductsDTO> productsS = productsService.findProductByCategory("Spozywcze");
        model.addAttribute("G", productsG);
        model.addAttribute("S", productsS);
        return "Products_By_Category";
    }
    @GetMapping("/month/{date}")
    public String date (@PathVariable Integer date, Model model) {
        List<ProductsDTO> products = productsService.findProductByDate(date);
        model.addAttribute("productsByDate", products);
        return "Products_By_Month";
    }
}
