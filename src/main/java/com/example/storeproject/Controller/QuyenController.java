package com.example.storeproject.Controller;

import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Service.ManagerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/quyen")
public class QuyenController {
    @Autowired
    ManagerUserService managerUserService;

    @GetMapping("/list")
    public String list (Model model){
        List<ManagerUser> managerUsers = managerUserService.getAllManagerUser();
        model.addAttribute("managerUsers", managerUsers);
        return "quyen-list";

    }

    // Form thêm
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("managerUser", new ManagerUser());
        return "quyen-form"; // Giao diện thêm size
    }

    // Lưu  mới
    @PostMapping("/save")
    public String saveManagerUser(@ModelAttribute("manageruser") ManagerUser managerUser) {
        managerUserService.saveManagerUser(managerUser);
        return "redirect:/quyen/list";
    }

    // Form chỉnh sửa
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        ManagerUser managerUser = managerUserService.findManagerUserById(id);
        model.addAttribute("managerUser", managerUser);
        return "quyen-form"; // Sử dụng cùng giao diện với thêm size
    }

    // Xóa 
    @GetMapping("/delete/{id}")
    public String deleteManagerUser(@PathVariable("id") Integer id) {
        managerUserService.deleteManagerUser(id);
        return "redirect:/quyen/list";
    }
}
