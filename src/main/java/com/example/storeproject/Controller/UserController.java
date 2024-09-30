package com.example.storeproject.Controller;


import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Models.NguoiDung;
import com.example.storeproject.Service.CTSPService;
import com.example.storeproject.Service.ManagerUserService;
import com.example.storeproject.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private CTSPService ctspService;

    @GetMapping("/home")
    public String home() {
        return "home"; // Trang chủ
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Tên file HTML cho giao diện đăng nhập
    }

    @RequestMapping("store")
    public String store(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllChiTietSanPham();
        model.addAttribute("ctsp",ctsp);
        return "store";
    }


    @GetMapping("/signup")
    public String showRegistrationForm(Model model) {
        model.addAttribute("nguoiDung", new NguoiDung());
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(NguoiDung nguoiDung, Model model) {
        // Lưu người dùng vào cơ sở dữ liệu
        nguoiDungService.save(nguoiDung);
        model.addAttribute("message", "Đăng ký thành công!");
        return "login"; // Chuyển đến trang đăng nhập hoặc trang khác
    }


}
