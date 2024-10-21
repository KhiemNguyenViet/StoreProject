package com.example.storeproject.Controller;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.GioHang;
import com.example.storeproject.Models.PhuongThucThanhToan;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Repository.GioHangRepository;
import com.example.storeproject.Service.CTSPService;
import com.example.storeproject.Service.GioHangService;
import com.example.storeproject.Service.PayService;
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
    private GioHangRepository gioHangRepository;

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Autowired
    private PayService payService;

    @Autowired
    private final CTSPService ctspService;

    public GioHangController(CTSPService ctspService) {
        this.ctspService = ctspService;
    }

    @PostMapping("/addCart")
    public String addToCart( @RequestParam int IDSP, @RequestParam int soLuong) {
        // Lấy ChiTietSanPham từ cơ sở dữ liệu
        ChiTietSanPham chiTietSanPham = chiTietSanPhamRepository.findByIDSP(IDSP);

        if (chiTietSanPham == null) {
            throw new IllegalArgumentException("Chi tiết sản phẩm không tồn tại");
        }

        GioHang gioHang = new GioHang();
        // Thiết lập chiTietSanPham cho gioHang
        gioHang.setChiTietSanPham(chiTietSanPham);
        gioHang.setTenSP(chiTietSanPham.getTenSP());
        gioHang.setGia(chiTietSanPham.getGia());
        gioHang.setSoLuong(soLuong);

        // Lưu giỏ hàng
        gioHangService.addToCart(gioHang);

        return "redirect:/cart"; // Điều hướng đến trang giỏ hàng
    }

//    @PostMapping("/update")
//    public String updateCart(@RequestParam int id, @RequestParam int newQuantity) {
//        GioHang gioHang= gioHangRepository.findById(id);
//
//        PhuongThucThanhToan phuongThucThanhToan = new PhuongThucThanhToan();
//        phuongThucThanhToan.setTenSP(gioHang.getTenSP());
//        phuongThucThanhToan.setSoluong(gioHang.getSoLuong());
//        phuongThucThanhToan.setQuantity(newQuantity);
//
//        payService.updateCart(phuongThucThanhToan, id, newQuantity);
//        return "redirect:/pay"; // Chuyển hướng đến trang thanh toán
//    }

    @GetMapping("/update")
    public String updateCart(@RequestParam int id, @RequestParam int newQuantity){
        gioHangService.updateCart(id, newQuantity);
        return "pay";
    }


    @RequestMapping("/pay")
    public String pay( @RequestParam int id, Model model){
        GioHang gioHang = gioHangService.getGioHangId(id);
        model.addAttribute("gioHang",gioHang);

        List<GioHang> gioHangs = gioHangService.getCartItems();
        model.addAttribute("gioHangs",gioHangs);

        return "pay";
    }


    @GetMapping("/items")
    public List<GioHang> getCartItems() {
        return gioHangService.getCartItems();
    }

    @GetMapping("/remove/{id}")
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
