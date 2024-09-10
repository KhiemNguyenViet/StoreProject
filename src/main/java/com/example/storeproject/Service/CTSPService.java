package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@RequestMapping
@Service
public interface CTSPService {
    List<ChiTietSanPham> getAllChiTietSanPham();

    void saveChiTietSanPham(ChiTietSanPham chiTietSanPham);

    void deleteChiTietSanPham(Long id);

    Optional<ChiTietSanPham> findChiTietSanPhamById(Long id);
}
