package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;

import java.util.List;
import java.util.Optional;

public interface CTSPService {
    void save(ChiTietSanPham product);
    void deleteProduct(int id);
    List<ChiTietSanPham> getAllProducts();
    ChiTietSanPham getProductById(int id);
    String getSizeName(int IDSize);
    String getLoaiName(int IDLoai);
}
