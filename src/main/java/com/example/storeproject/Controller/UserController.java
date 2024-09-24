package com.example.storeproject.Controller;


import com.example.storeproject.Models.NguoiDung;
import com.example.storeproject.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private NguoiDungService nguoiDungService;

    private NguoiDung currentUser;

    @GetMapping("/")
    public String home() {
        return "home"; // Trang chủ
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Trang đăng nhập
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        currentUser = nguoiDungService.authenticate(username, password);
        if (currentUser != null) {
            return "redirect:/dashboard"; // Chuyển hướng đến dashboard
        }
        model.addAttribute("error", "Invalid credentials");
        return "login"; // Quay lại trang đăng nhập
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        if (currentUser == null) {
            return "redirect:/login"; // Nếu chưa đăng nhập, chuyển hướng đến trang đăng nhập
        }

        Long roleId = nguoiDungService.getNguoiDungquyenId(currentUser);
        if (roleId == 1) { // Giả sử 1 là ID quyền của MANAGER
            return "quanlysp/dashboard"; // Chuyển đến dashboard quản lý
        } else if (roleId == 2) { // Giả sử 2 là ID quyền của CUSTOMER
            return "home/dashboard"; // Chuyển đến dashboard khách hàng
        }
        return "home"; // Mặc định
    }
}
