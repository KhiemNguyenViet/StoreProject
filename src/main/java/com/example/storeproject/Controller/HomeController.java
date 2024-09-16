package com.example.storeproject.Controller;

import com.example.storeproject.Models.ChiTietSanPham;
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
        List<ChiTietSanPham> ctsp = ctspService.getAllChiTietSanPham();
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

    @RequestMapping("store")
    public String store(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp",ctsp);
        return "store";
    }

    @RequestMapping("cart")
    public String cart(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp",ctsp);
        return "cart";
    }

    @RequestMapping(value = "/deleteCart", method = RequestMethod.GET)
    public String deletecart(@RequestParam("IDSP") Long ctspId, Model model) {
        ctspService.deleteChiTietSanPham(ctspId);
        return "redirect:/cart";
    }

    @RequestMapping("product_detail")
    public String product_detail(Model model){
        return "product_detail";
    }

    @RequestMapping("/edit_product")
    public String managerprd(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp", ctsp);
        return "edit_product";
    }

    @RequestMapping(value = "saveprd", method = RequestMethod.POST)
    public String save(ChiTietSanPham chiTietSanPham) {
        ctspService.saveChiTietSanPham(chiTietSanPham);
        return "redirect:/edit_product";
    }

    @RequestMapping(value = "addprd")
    public String addProduct(Model model) {
        model.addAttribute("ctsp", new ChiTietSanPham());
        return "edit_product";
    }

    @RequestMapping(value = "/deleteprd", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam("IDSP") Long ctspId, Model model) {
        ctspService.deleteChiTietSanPham(ctspId);
        return "redirect:/edit_product";
    }

}
