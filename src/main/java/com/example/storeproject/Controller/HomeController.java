package com.example.storeproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(Model model){
        return "home";
    }

    @RequestMapping("login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping("signup")
    public String signup(Model model){
        return "signup";
    }

    @RequestMapping("product_detail")
    public String product_detail(Model model){
        return "product_detail";
    }

    @RequestMapping("store")
    public String store(Model model){
        return "store";
    }
}
