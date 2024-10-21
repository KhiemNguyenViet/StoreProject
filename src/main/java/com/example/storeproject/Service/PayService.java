package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.PhuongThucThanhToan;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PayService {
    void updateCart(PhuongThucThanhToan phuongThucThanhToan, int id, int newQuantity);
    List<PhuongThucThanhToan> getAllPays();
}
