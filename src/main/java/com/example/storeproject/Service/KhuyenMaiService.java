package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.KhuyenMai;

import java.util.List;
import java.util.Optional;

public interface KhuyenMaiService{
    List<KhuyenMai> getAllKhuyenMai();

    void saveKhuyenMai(KhuyenMai khuyenMai);

    void deleteKhuyenMai(int id);

    KhuyenMai findKhuyenMaiById(int id);
}
