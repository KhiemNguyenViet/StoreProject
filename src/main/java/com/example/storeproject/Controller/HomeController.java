package com.example.storeproject.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        return "home";
    }
}
