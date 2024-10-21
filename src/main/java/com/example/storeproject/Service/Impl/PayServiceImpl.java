package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.GioHang;
import com.example.storeproject.Models.PhuongThucThanhToan;
import com.example.storeproject.Repository.GioHangRepository;
import com.example.storeproject.Repository.ThanhToanRepository;
import com.example.storeproject.Service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private GioHangRepository gioHangRepository;

    @Autowired
    private ThanhToanRepository thanhToanRepository;

    @Override
    public List<PhuongThucThanhToan> getAllPays() {
        return thanhToanRepository.findAll();
    }

    @Override
    public void updateCart(PhuongThucThanhToan phuongThucThanhToan, int id, int newQuantity) {
        GioHang gioHang = gioHangRepository.findById(id);
        if (gioHang != null) {
            gioHang.setSoLuong(newQuantity);
            gioHang.setGia(gioHang.getGia().multiply(BigDecimal.valueOf(newQuantity))); // Cập nhật giá
            gioHangRepository.save(gioHang);
        }
    }
}
