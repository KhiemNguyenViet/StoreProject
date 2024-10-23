package com.example.storeproject.Controller;

import com.example.storeproject.Models.KhuyenMai;
import com.example.storeproject.Service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/khuyenmai")
public class KhuyenMaiconttroller {

    @Autowired
    private KhuyenMaiService khuyenMaiService;

    // Hiển thị danh sách khuyến mãi
    @GetMapping("/manage-khuyenmai")
    public String manageKhuyenMai(Model model) {
        List<KhuyenMai> khuyenMais = khuyenMaiService.getAllKhuyenMai();
        model.addAttribute("khuyenmais", khuyenMais);
        return "voucher-list";
    }

    @GetMapping("/addKhuyenMai")
    public String addKhuyenMaiForm(Model model) {
        model.addAttribute("khuyenmai", new KhuyenMai());
        return "voucher-form";
    }

    @PostMapping("/addKhuyenMai")
    public String addKhuyenMai(@ModelAttribute KhuyenMai khuyenMai) {
        khuyenMaiService.saveKhuyenMai(khuyenMai);
        return "redirect:/khuyenmai/manage-khuyenmai";
    }
    @GetMapping("/delete/{id}")
    public String deleteKhuyenMai(@PathVariable("id") Integer idKhuyenMai) {
        khuyenMaiService.deleteKhuyenMai(idKhuyenMai);
        return "redirect:/khuyenmai/manage-khuyenmai";
    }

    @GetMapping("/edit/{id}")
    public String editKhuyenMai(@PathVariable("id") Integer idKhuyenMai, Model model) {
        Object khuyenMai = khuyenMaiService.findKhuyenMaiById(idKhuyenMai);
        model.addAttribute("khuyenmai", khuyenMai);
        return "edit-khuyenmai";
    }

    @PostMapping("/update")
    public String updateKhuyenMai(@ModelAttribute KhuyenMai khuyenMai) {
        khuyenMaiService.saveKhuyenMai(khuyenMai);
        return "redirect:/khuyenmai/manage-khuyenmai";
    }
}