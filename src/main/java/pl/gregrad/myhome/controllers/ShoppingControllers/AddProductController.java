package pl.gregrad.myhome.controllers.ShoppingControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping/addProduct")
public class AddProductController {

    public String addProduct() {
        return "Add_Product";
    }
}
