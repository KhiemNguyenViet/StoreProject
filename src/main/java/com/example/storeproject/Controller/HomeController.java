package com.example.storeproject.Controller;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.KhuyenMai;
import com.example.storeproject.Models.LoaiSP;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Service.CTSPService;
import com.example.storeproject.Service.KhuyenMaiService;
import com.example.storeproject.Service.LoaiService;
import com.example.storeproject.Service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private final CTSPService ctspService;
    @Autowired
    private final SizeService sizeService;
    @Autowired
    private final LoaiService loaiService;
    @Autowired
    private final KhuyenMaiService khuyenMaiService;

    public HomeController(CTSPService ctspService, SizeService sizeService, LoaiService loaiService, KhuyenMaiService khuyenMaiService) {
        this.ctspService = ctspService;
        this.sizeService = sizeService;
        this.loaiService = loaiService;
        this.khuyenMaiService = khuyenMaiService;
    }

    @RequestMapping("home")
    public String home(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllProducts();
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
        List<ChiTietSanPham> ctsp = ctspService.getAllProducts();
        model.addAttribute("ctsp",ctsp);
        return "store";
    }

    @RequestMapping("cart")
    public String cart(Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllProducts();
        model.addAttribute("ctsp",ctsp);
        return "cart";
    }

    @RequestMapping("/quanlysp")
    public String quanlysp( Model model){
        List<ChiTietSanPham> ctsp = ctspService.getAllProducts();
        model.addAttribute("ctsp", ctsp);
        return "quanlysp";
    }

//    @RequestMapping(value = "addprd")
//    public String addProduct(Model model) {
//        model.addAttribute("ctsp", new ChiTietSanPham());
//
//        List<LoaiSP> loaiSP = loaiService.getAllLoaiSP();
//        model.addAttribute("loaiSP", loaiSP);
//
//        List<Size> size = sizeService.getAllSize();
//        model.addAttribute("size", size);
//
//        List<KhuyenMai> khuyenMai = khuyenMaiService.getAllKhuyenMai() ;
//        model.addAttribute("khuyenMai", khuyenMai);
//        return "addProduct";
//    }
@GetMapping("/add")
public String addProductForm(Model model) {
    model.addAttribute("ctsp", new ChiTietSanPham());
        List<LoaiSP> loaiSP = loaiService.getAllLoaiSP();
        model.addAttribute("loaiSP", loaiSP);

        List<Size> size = sizeService.getAllSize();
        model.addAttribute("size", size);

        List<KhuyenMai> khuyenMai = khuyenMaiService.getAllKhuyenMai() ;
        model.addAttribute("khuyenMai", khuyenMai);
    return "addProduct"; // Tên trang thêm sản phẩm
}

    @PostMapping("/add")
    public String addProduct(@ModelAttribute ChiTietSanPham product) {
        ctspService.save(product);
        return "redirect:/quanlysp"; // Quay lại danh sách sản phẩm
    }

    @GetMapping("/edit/{id}")
    public String editProductForm(@PathVariable int id, Model model) {
        ChiTietSanPham product = ctspService.getProductById(id);
        model.addAttribute("ctsp", product);
        List<LoaiSP> loaiSP = loaiService.getAllLoaiSP();
        model.addAttribute("loaiSP", loaiSP);

        List<Size> size = sizeService.getAllSize();
        model.addAttribute("size", size);

        List<KhuyenMai> khuyenMai = khuyenMaiService.getAllKhuyenMai() ;
        model.addAttribute("khuyenMai", khuyenMai);
        return "editProduct"; // Tên trang sửa sản phẩm
    }

//    @PostMapping(value = "edit")
//    public String editProduct( ChiTietSanPham product) {
//        ctspService.save(product); // Sử dụng cùng phương thức để cập nhật
//        return "redirect:/quanlysp"; // Quay lại danh sách sản phẩm
//    }
@PostMapping(value = "edit")
public String editProduct(@ModelAttribute ChiTietSanPham product) {
//    product.setIDSP(id); // Giả sử bạn có phương thức setId trong ChiTietSanPham
    ctspService.save(product); // Cập nhật sản phẩm
    return "redirect:/quanlysp"; // Quay lại danh sách sản phẩm
}

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        ctspService.deleteProduct(id);
        return "redirect:/quanlysp"; // Quay lại danh sách sản phẩm
    }
}
