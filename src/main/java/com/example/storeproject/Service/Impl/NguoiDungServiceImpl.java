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
        return nguoiDung.getIDQuyen();
    }

    @Override
    public void save(NguoiDung nguoiDung) {
        nguoiDungRepository.save(nguoiDung);
    }

    public String getManagerUser(NguoiDung nguoiDung) {
        Long idQuyen = nguoiDung.getIDQuyen();
        ManagerUser managerUser = managerUserReporitory.findById(idQuyen).orElse(null);
        return managerUser != null ? managerUser.getNamequyen() : null;
    }
}
