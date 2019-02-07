package pl.gregrad.myhome.controllers.ShoppingControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping/deleteProduct")
public class DeleteProductController {

    public String addProduct() {
        return "redirect:/ShoppingList";
    }
}
