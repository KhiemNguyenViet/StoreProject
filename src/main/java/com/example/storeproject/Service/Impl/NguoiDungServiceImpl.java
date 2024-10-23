package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Models.NguoiDung;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Repository.ManagerUserReporitory;
import com.example.storeproject.Repository.NguoiDungRepository;
import com.example.storeproject.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class NguoiDungServiceImpl implements NguoiDungService {
    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Autowired
    private ManagerUserReporitory managerUserReporitory;

    @Override
    public NguoiDung authenticate(String UserName, String PassWord) {
        NguoiDung nguoiDung = nguoiDungRepository.findByUsername(UserName);
        if (nguoiDung != null && nguoiDung.getPassword().equals(PassWord)) {
            return nguoiDung;
        }
        return null;
    }

    @Override
    public Long getNguoiDungquyenId(NguoiDung nguoiDung) {
        return nguoiDung.getManageruser().getIdquyen();
    }

    @Override
    public String getNguoiDungQuyenName(NguoiDung nguoiDung){
        return nguoiDung.getManageruser().getNamequyen();
    }

    @Override
    public void save(NguoiDung nguoiDung) {
        nguoiDungRepository.save(nguoiDung);
    }

    public String getManagerUser(NguoiDung nguoiDung) {
        Integer idQuyen = Math.toIntExact(nguoiDung.getManageruser().getIdquyen());
        ManagerUser managerUser = managerUserReporitory.findById(idQuyen).orElse(null);
        return managerUser != null ? managerUser.getNamequyen() : null;
    }

    @Override
    public void deleteUser(int idUser){
        nguoiDungRepository.deleteById(idUser);
    }

    @Override
    public List<NguoiDung> getAllUsers(){
        return nguoiDungRepository.findAll();
    }

    @Override
    public NguoiDung getUserById(int idUser){
        return nguoiDungRepository.findByIdUser(idUser);
    }

    @Override
    public NguoiDung findNguoiDungById(Integer idUser) {
        return nguoiDungRepository.findByIdUser(idUser);
    }
}
