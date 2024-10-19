package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.LoaiSP;
import com.example.storeproject.Repository.LoaiRepository;
import com.example.storeproject.Service.LoaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiServiceImpl implements LoaiService {

    @Autowired
    private LoaiRepository loaiRepository;

    @Override
    public List<LoaiSP> getAllLoaiSP() {
        return loaiRepository.findAll();
    }

    @Override
    public void saveLoai(LoaiSP loaiSP) {
        loaiRepository.save(loaiSP);
    }

    @Override
    public void deleteLoai(Integer IDLoai) {
        loaiRepository.deleteById(IDLoai);
    }

    @Override
    public LoaiSP findLoaiSPById(Integer IDLoai) {
        return loaiRepository.findById(IDLoai).orElse(null);
    }

}
