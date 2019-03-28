package pl.gregrad.myhome.controllers.ProductsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.dto.ProductsDTO;
import pl.gregrad.myhome.services.Products.ProductsService;

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
        List<ProductsDTO> households = productsService.findProductByCategory("Gospodarcze");
        List<ProductsDTO> groceries = productsService.findProductByCategory("Spozywcze");
        model.addAttribute("allProducts", products);
        model.addAttribute("allHouseholds", households);
        model.addAttribute("allGroceries", groceries);
        return "Products_Summary";
    }
    @GetMapping("/month/{year}/{month}")
    public String date (@PathVariable Integer month,
    					@PathVariable Integer year, 
    					Model model) {
        List<ProductsDTO> products = productsService.findProductByDate(month);
        List<ProductsDTO> groceries = productsService.findCategorizedProduct(year, month, "Gospodarcze");
        List<ProductsDTO> households = productsService.findCategorizedProduct(year, month, "Spozywcze");
        model.addAttribute("productsByDate", products);
        model.addAttribute("allGroceries", groceries);
        model.addAttribute("allHouseholds", households);
        return "Products_By_Month";
    }
}
