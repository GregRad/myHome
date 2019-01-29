package pl.gregrad.myhome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping")
public class ShoppingController {

    @GetMapping
    public String shopping() {
        return "Shopping";
    }
}