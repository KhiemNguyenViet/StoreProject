package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Models.NguoiDung;

import java.util.List;
import java.util.Optional;

public interface NguoiDungService {
    NguoiDung authenticate(String username, String password);
    Long getNguoiDungquyenId(NguoiDung nguoiDung);
    String getNguoiDungQuyenName(NguoiDung nguoiDung);
    void save(NguoiDung nguoiDung);
    void deleteUser(int idUser);
    NguoiDung getUserById(int idUser);
    List<NguoiDung> getAllUsers();
    NguoiDung findNguoiDungById(Integer idUser);

}
