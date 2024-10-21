package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.GioHang;
import com.example.storeproject.Repository.GioHangRepository;
import com.example.storeproject.Service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class GioHangServiceImpl implements GioHangService {
    @Autowired
    private GioHangRepository gioHangRepository;

    @Override
    public void addToCart(GioHang gioHang) {

        gioHangRepository.save(gioHang);
    }

    @Override
    public GioHang getGioHangId (int id){
        return gioHangRepository.findById(id);
    }

    @Override
    public Integer updateCart(int id, int newQuantity) {
        GioHang gioHang = gioHangRepository.findById(id);
        if (gioHang != null) {
            gioHang.setSoLuong(newQuantity);

            // Cập nhật giá, giả sử giá gốc không thay đổi
            gioHang.setGia(gioHang.getGia().multiply(BigDecimal.valueOf(newQuantity)));

            try {
                gioHangRepository.save(gioHang);
            } catch (Exception e) {
                // Xử lý lỗi nếu có, có thể ghi log hoặc ném ngoại lệ tùy theo nhu cầu
                System.err.println("Error updating cart: " + e.getMessage());
                return null;
            }

            return gioHang.getSoLuong();
        } else {
            // Xử lý trường hợp không tìm thấy giỏ hàng
            System.out.println("Cart not found for ID: " + id);
            return null;
        }
    }


    @Override
    public List<GioHang> getCartItems() {
        return (List<GioHang>) gioHangRepository.findAll();
    }

    @Override
    public void removeFromCart(int id) {
        gioHangRepository.deleteById((long) id);
    }
}
