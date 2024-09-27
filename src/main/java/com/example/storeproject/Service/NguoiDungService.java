package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.NguoiDung;

import java.util.List;
import java.util.Optional;

public interface NguoiDungService {
    NguoiDung authenticate(String username, String password);
    Long getNguoiDungquyenId(NguoiDung nguoiDung);
}
