package com.example.storeproject.Controller;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
public class PDController {
    @Autowired
    private CTSPService ctspService;

    @RequestMapping("product_detail")
    public String getPD(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("prd_dt",ctsp);
        return "product_detail";
    }
}
