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
    public void updateCart(int id, int newQuantity) {
        GioHang gioHang = gioHangRepository.findById((long) id).orElse(null);
        if (gioHang != null) {
            gioHang.setSoLuong(newQuantity);
            gioHang.setGia(gioHang.getGia().multiply(BigDecimal.valueOf(newQuantity))); // Cập nhật giá
            gioHangRepository.save(gioHang);
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
