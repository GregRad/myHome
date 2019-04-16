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
//    	int currentYear = 2019;
//    	Integer[] years = new Integer[101];
//    	for (int i = 0; i < years.length; i++ ) {
//    		years[i] = currentYear++;
//    	}
//    	model.addAttribute("numbers", years);
        return "Products";
    }
    @GetMapping("list/{year}")
    public String productsByYear(@PathVariable Integer year,
    							 Model model) {
    	List<ProductsDTO> products = productsService.findProductsByYear(year);
    	model.addAttribute("productsByYear", products);
    	return "Products_Summary";
    }
    
    @GetMapping("/{year}")
    public String allProductsByYear(@PathVariable Integer year,
    							   Model model) {
    	List<ProductsDTO> products = productsService.findProductsByYear(year);
        List<ProductsDTO> households = productsService.findCategorizedProductByYear(year, "Gospodarcze");
        List<ProductsDTO> groceries = productsService.findCategorizedProductByYear(year, "Spozywcze");
    	model.addAttribute("allProductsByYear", products);
        model.addAttribute("allGroceries", groceries);
        model.addAttribute("allHouseholds", households);
        model.addAttribute("year", year);
    	return "Products_By_Year";
    }

    @GetMapping("/{year}/{month}") 
    public String productsByDate(@PathVariable Integer year,
    							  @PathVariable Integer month,
    							  Model model) {
    	List<ProductsDTO> products = productsService.findProductByDate(year, month);
        List<ProductsDTO> households = productsService.findCategorizedProductByDate(year, month, "Gospodarcze");
        List<ProductsDTO> groceries = productsService.findCategorizedProductByDate(year, month, "Spozywcze");
        model.addAttribute("allHouseholds", households);
        model.addAttribute("allGroceries", groceries);
    	model.addAttribute("productsByDate", products);
    	model.addAttribute("year", year);
    	return "Products_By_Month";
    }
}
