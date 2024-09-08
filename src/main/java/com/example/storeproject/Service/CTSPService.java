package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;

import java.util.List;
import java.util.Optional;

public interface CTSPService {
    List<ChiTietSanPham> getAllChiTietSanPham();

    void saveChiTietSanPham(ChiTietSanPham chiTietSanPham);

    void deleteChiTietSanPham(Long id);

    Optional<ChiTietSanPham> findChiTietSanPhamById(Long id);
}
