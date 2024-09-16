package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.NguoiDung;

import java.util.List;
import java.util.Optional;

public interface NguoiDungService {
    List<NguoiDung> getAllNguoiDung();

    void saveNguoiDung(NguoiDung nguoiDung);

    void deleteNguoiDung(Long id);

    Optional<NguoiDung> findNguoiDungById(Long id);
}
