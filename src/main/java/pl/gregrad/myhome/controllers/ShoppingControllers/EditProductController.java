package pl.gregrad.myhome.controllers.ShoppingControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping/editProduct")
public class EditProductController {

    public String editProduct() {
        return "Edit_Product";
    }
}
