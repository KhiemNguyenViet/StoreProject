package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.KhuyenMai;
import com.example.storeproject.Repository.KhuyenMaiRepository;
import com.example.storeproject.Service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {
    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public List<KhuyenMai> getAllKhuyenMai(){
        return (List<KhuyenMai>) khuyenMaiRepository.findAll();
    }

    @Override
    public void saveKhuyenMai(KhuyenMai khuyenMai){
        khuyenMaiRepository.save(khuyenMai);
    }

    @Override
    public void deleteKhuyenMai(Long id){
        khuyenMaiRepository.deleteById(id);
    }

    @Override
    public Optional<KhuyenMai> findKhuyenMaiById(Long id){
        return khuyenMaiRepository.findById(id);
    }
}
