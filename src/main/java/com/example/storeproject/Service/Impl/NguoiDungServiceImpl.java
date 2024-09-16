package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.NguoiDung;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
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

    @Override
    public List<NguoiDung> getAllNguoiDung(){
        return (List<NguoiDung>) nguoiDungRepository.findAll();
    }

    @Override
    public void saveNguoiDung(NguoiDung nguoiDung){
        nguoiDungRepository.save(nguoiDung);
    }

    @Override
    public void deleteNguoiDung(Long id){
        nguoiDungRepository.deleteById(id);
    }

    @Override
    public Optional<NguoiDung> findNguoiDungById(Long id){
        return nguoiDungRepository.findById(id);
    }
}
