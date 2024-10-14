package com.example.storeproject.Controller;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.GioHang;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GioHangController {
    @Autowired
    private GioHangService gioHangService;

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @PostMapping("/addCart")
    public String addToCart(@RequestParam int IDSP, @RequestParam int soLuong) {
        // Lấy ChiTietSanPham từ cơ sở dữ liệu
        ChiTietSanPham chiTietSanPham = chiTietSanPhamRepository.findByIDSP(IDSP);

        if (chiTietSanPham == null) {
            throw new IllegalArgumentException("Chi tiết sản phẩm không tồn tại");
        }

        GioHang gioHang = new GioHang();
        // Thiết lập chiTietSanPham cho gioHang
        gioHang.setChiTietSanPham(chiTietSanPham);
        gioHang.setGia(chiTietSanPham.getGia());
        gioHang.setTenSP(chiTietSanPham.getTenSP());
        gioHang.setSoLuong(soLuong);

        // Lưu giỏ hàng
        gioHangService.addToCart(gioHang);

        return "redirect:/cart"; // Điều hướng đến trang giỏ hàng
    }

    @PutMapping("/update/{id}/{quantity}")
    public String updateCart(@PathVariable int id, @PathVariable int quantity) {
        gioHangService.updateCart(id, quantity);
        return "Cart updated";
    }

    @GetMapping("/items")
    public List<GioHang> getCartItems() {
        return gioHangService.getCartItems();
    }

    @DeleteMapping("/remove/{id}")
    public String removeFromCart(@PathVariable int id) {
        gioHangService.removeFromCart(id);
        return "redirect:/cart";
    }

    @RequestMapping("cart")
    public String cart(Model model){
        List<GioHang> gioHangs = gioHangService.getCartItems();
        model.addAttribute("gioHangs",gioHangs);
        return "cart";
    }
}
