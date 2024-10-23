package com.example.storeproject.Controller;


import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Models.NguoiDung;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Service.CTSPService;
import com.example.storeproject.Service.ManagerUserService;
import com.example.storeproject.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private CTSPService ctspService;

    @Autowired
    private ManagerUserService managerUserService;

    @GetMapping("/home")
    public String home() {
        return "user/home"; // Trang chủ
    }
    @GetMapping("/homeql")
    public String homeql() {
        return "manager/home"; // Trang chủ
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Tên file HTML cho giao diện đăng nhập
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        NguoiDung nguoiDung = nguoiDungService.authenticate(username, password);
        if (nguoiDung != null) {
            // Kiểm tra quyền hạn
            String quyenname = nguoiDungService.getNguoiDungQuyenName(nguoiDung);
            if ("Quản Lý".equals(quyenname)) { // Ví dụ: 1 là quyền admin
                return "redirect:/user/homeql"; // Trang dành cho admin
            } else {
                return "redirect:/user/home"; // Trang dành cho người dùng bình thường
            }
        } else {
            model.addAttribute("error", "Tên người dùng hoặc mật khẩu không đúng.");
            return "login"; // Trở lại trang đăng nhập
        }
    }

    @RequestMapping("store")
    public String store(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllProducts();
        model.addAttribute("ctsp",ctsp);
        return "store";
    }
    @RequestMapping("storekh")
    public String storekh(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllProducts();
        model.addAttribute("ctsp",ctsp);
        return "user/store";
    }


    @GetMapping("/signup")
    public String showRegistrationForm(Model model) {
        model.addAttribute("nguoiDung", new NguoiDung());
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(NguoiDung nguoiDung, Model model) {
        // Lấy ManagerUser đã tồn tại từ cơ sở dữ liệu
        ManagerUser managerUser = managerUserService.getManagerUserByName("Khách Hàng"); // Giả sử bạn có phương thức này trong service

        if (managerUser == null) {
            // Nếu không tìm thấy, bạn có thể xử lý theo cách khác (ví dụ: tạo mới hoặc thông báo lỗi)
            model.addAttribute("error", "Không tìm thấy quyền 'Khách Hàng'.");
            return "signup"; // Trả về trang đăng ký
        }

        // Gán đối tượng ManagerUser cho nguoiDung
        nguoiDung.setManageruser(managerUser);

        // Lưu người dùng vào cơ sở dữ liệu
        nguoiDungService.save(nguoiDung);
        model.addAttribute("message", "Đăng ký thành công!");

        return "login"; // Chuyển đến trang đăng nhập hoặc trang khác
    }

    @RequestMapping("/list")
    public String listUser ( Model model){
        List<NguoiDung> nguoiDungs = nguoiDungService.getAllUsers();
        model.addAttribute("nguoiDungs",nguoiDungs);

        List<ManagerUser> managerUsers= managerUserService.getAllManagerUser();
        model.addAttribute("managerUsers",managerUsers);

        return "user-list";
    }
    // Giả sử bạn muốn lấy quyền của người quản lý đầu tiên trong danh sách
//        if (!nguoiDungs.isEmpty()) {
//            NguoiDung nguoiDung = nguoiDungs.get(0); // Lấy người dùng đầu tiên
//            String manageruser = nguoiDung.getManageruser().getNamequyen();
//            model.addAttribute("manageruser", manageruser);
//        } else {
//            model.addAttribute("manageruser", "Không có người dùng nào.");
//        }

    // Form chỉnh sửa size
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        NguoiDung nguoiDung = nguoiDungService.findNguoiDungById(id);
        model.addAttribute("nguoiDung", nguoiDung);
        List<ManagerUser> managerUsers = managerUserService.getAllManagerUser();
        model.addAttribute("managerUsers",managerUsers);
        return "user-form"; // Sử dụng cùng giao diện với thêm size
    }

    // Xóa size
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        nguoiDungService.deleteUser(id);
        return "redirect:/user/list";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
        nguoiDungService.save(nguoiDung);
        return "redirect:/user/list";
    }
}
