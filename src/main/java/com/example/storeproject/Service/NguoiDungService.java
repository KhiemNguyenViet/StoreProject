package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.NguoiDung;

import java.util.List;
import java.util.Optional;

public interface NguoiDungService {
    NguoiDung authenticate(String UserName, String PassWord);
    Long getNguoiDungquyenId(NguoiDung nguoiDung);
}
