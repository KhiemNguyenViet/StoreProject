package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.LoaiSP;

import java.util.List;

public interface LoaiService {
    List<LoaiSP> getAllLoaiSP();

    void saveLoai(LoaiSP loaiSP);

    void deleteLoai(Integer IDLoai);

    LoaiSP findLoaiSPById(Integer IDLoai);
}
