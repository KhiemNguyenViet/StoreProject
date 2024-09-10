package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPhamml;

import java.util.List;
import java.util.Optional;

public interface CTSPService {
    List<ChiTietSanPhamml> getAllChiTietSanPham();

    void saveChiTietSanPham(ChiTietSanPhamml chiTietSanPham);

    void deleteChiTietSanPham(Long id);

    Optional<ChiTietSanPhamml> findChiTietSanPhamById(Long id);
}
