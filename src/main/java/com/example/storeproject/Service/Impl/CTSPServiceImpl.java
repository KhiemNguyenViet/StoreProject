package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPhamml;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Service.CTSPService;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CTSPServiceImpl implements CTSPService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public List<ChiTietSanPhamml> getAllChiTietSanPham(){
        return (List<ChiTietSanPhamml>) chiTietSanPhamRepository.findAll();
    }

    @Override
    public void saveChiTietSanPham(ChiTietSanPhamml chiTietSanPham){
        chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public void deleteChiTietSanPham(Long id){
        chiTietSanPhamRepository.deleteById(id);
    }

    @Override
    public Optional<ChiTietSanPhamml> findChiTietSanPhamById(Long id){
        return chiTietSanPhamRepository.findById(id);
    }
}
