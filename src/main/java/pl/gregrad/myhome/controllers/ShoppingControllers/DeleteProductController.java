package pl.gregrad.myhome.controllers.ShoppingControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.myhome.services.Shopping.ShoppingService;

@Controller
@RequestMapping("/shopping")
public class DeleteProductController {

    @Autowired
    ShoppingService shoppingService;

    @GetMapping("/delete/{id}")
    public String addProduct(@PathVariable Long id) {
        shoppingService.delete(id);
        return "redirect:/shopping/all_Products";
    }
}
