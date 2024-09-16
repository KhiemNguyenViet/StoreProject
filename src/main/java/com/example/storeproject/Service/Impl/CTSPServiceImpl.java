package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CTSPServiceImpl implements CTSPService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public List<ChiTietSanPham> getAllChiTietSanPham(){
        return (List<ChiTietSanPham>) chiTietSanPhamRepository.findAll();
    }

    @Override
    public void saveChiTietSanPham(ChiTietSanPham chiTietSanPham){
        chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public void deleteChiTietSanPham(Long id){
        chiTietSanPhamRepository.deleteById(id);
    }

    @Override
    public Optional<ChiTietSanPham> findChiTietSanPhamById(Long id){
        return chiTietSanPhamRepository.findById(id);
    }
}
