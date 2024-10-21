package com.example.storeproject.Controller;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.KhuyenMai;
import com.example.storeproject.Models.LoaiSP;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Service.LoaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/loaisp")
public class LoaiSPController {

    @Autowired
    private LoaiService loaiService;

    @GetMapping("/manage-loaisp")
    public String manageLoaiSP(Model model) {
        List<LoaiSP> loaisp = loaiService.getAllLoaiSP();
        model.addAttribute("loaisp", loaisp);
        return "manage-loaisp";
    }

    @GetMapping("/addLoai")
    public String addLoaiForm(Model model) {
        model.addAttribute("loaisp", new LoaiSP());
        return "add-loaisp"; // Tên trang thêm sản phẩm
    }

    @PostMapping("/addloaisp")
    public String addLoaiSP(@ModelAttribute LoaiSP loaiSP) {
        loaiService.saveLoai(loaiSP);
        return "redirect:manage-loaisp";
    }

    @GetMapping("/delete/{id}")
    public String deleteLoaiSP(@PathVariable("id") Integer IDLoai) {
        loaiService.deleteLoai(IDLoai);
        return "redirect:/loaisp/manage-loaisp";
    }

    @GetMapping("/edit/{id}")
    public String editLoaiSP(@PathVariable("id") Integer IDLoai, Model model) {
        LoaiSP loaiSP = loaiService.findLoaiSPById(IDLoai);
        model.addAttribute("loaisp", loaiSP);
        return "edit-loaisp";
    }

    @PostMapping("/update")
    public String updateLoaiSP(@ModelAttribute LoaiSP loaiSP) {
        loaiService.saveLoai(loaiSP);
        return "redirect:/loaisp/manage-loaisp"; // Chú ý: Phải có dấu gạch chéo ở đầu
    }



}
