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

    @Autowired
    private CTSPService ctspService;
    @RequestMapping("product_detail")
    public String product_detail(Model model){
        List<ChiTietSanPhamml> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp",ctsp);
        return "product_detail";
    }

    @RequestMapping(value = "/deletectsp", method = RequestMethod.GET)
    public String deleteCTSP(@RequestParam("IDSP") Long ctspId, Model model) {
        ctspService.deleteChiTietSanPham(ctspId);
        return "redirect:/product_detail";
    }

    @RequestMapping("store")
    public String store(Model model){
        return "store";
    }



//    @RequestMapping("product_detail_alt")
//    public String getPD(Model model){
//        List<ChiTietSanPhamml> ctsp = ctspService.getAllChiTietSanPham();
//        model.addAttribute("ctsp",ctsp);
//        return "product_detail";
//    }
}
