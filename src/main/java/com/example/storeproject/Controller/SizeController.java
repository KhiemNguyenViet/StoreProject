package com.example.storeproject.Controller;

import com.example.storeproject.Models.Size;
import com.example.storeproject.Service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/size")
public class SizeController {

    @Autowired
    private SizeService sizeService;

    // Hiển thị danh sách size
    @GetMapping("/list")
    public String listSizes(Model model) {
        List<Size> sizes = sizeService.getAllSize();
        model.addAttribute("sizes", sizes);
        return "size-list"; // Tên của trang giao diện hiển thị danh sách size
    }

    // Form thêm size
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("size", new Size());
        return "size-form"; // Giao diện thêm size
    }

    // Lưu size mới
    @PostMapping("/save")
    public String saveSize(@ModelAttribute("size") Size size) {
        sizeService.saveSize(size);
        return "redirect:/size/list";
    }

    // Form chỉnh sửa size
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Size size = sizeService.findSizeById(id);
        model.addAttribute("size", size);
        return "size-form"; // Sử dụng cùng giao diện với thêm size
    }

    // Xóa size
    @GetMapping("/delete/{id}")
    public String deleteSize(@PathVariable("id") Integer id) {
        sizeService.deleteSize(id);
        return "redirect:/size/list";
    }
}
