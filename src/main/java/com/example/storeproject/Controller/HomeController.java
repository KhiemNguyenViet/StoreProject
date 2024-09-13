package com.example.storeproject.Controller;

import com.example.storeproject.Models.ChiTietSanPhamml;
import com.example.storeproject.Service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CTSPService ctspService;

    @RequestMapping("home")
    public String home(Model model){
        List<ChiTietSanPhamml> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp",ctsp);
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



    @RequestMapping("cart")
    public String cart(Model model){
        List<ChiTietSanPhamml> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp",ctsp);
        return "cart";
    }

    @RequestMapping("product_detail")
    public String product_detail(Model model){
//        List<ChiTietSanPhamml> ctsp = ctspService.getAllChiTietSanPham();
//        model.addAttribute("ctsp",ctsp);
        return "product_detail";
    }

    @RequestMapping(value = "/deleteCart", method = RequestMethod.GET)
    public String deletecart(@RequestParam("IDSP") Long ctspId, Model model) {
        ctspService.deleteChiTietSanPham(ctspId);
        return "redirect:/cart";
    }

    @RequestMapping("store")
    public String store(Model model){
        List<ChiTietSanPhamml> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp",ctsp);
        return "store";
    }



//    @RequestMapping("product_detail_alt")
//    public String getPD(Model model){
//        List<ChiTietSanPhamml> ctsp = ctspService.getAllChiTietSanPham();
//        model.addAttribute("ctsp",ctsp);
//        return "product_detail";
//    }
}
