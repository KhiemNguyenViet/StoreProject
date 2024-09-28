package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Repository.SizeRepository;
import com.example.storeproject.Service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CTSPServiceImpl implements CTSPService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Autowired
    private SizeRepository sizeRepository;

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
    public ChiTietSanPham findChiTietSanPhamById(Long id) {
        return chiTietSanPhamRepository.findById(id).orElse(null);
    }

    public String getSizeName(int id) {
        Size size = sizeRepository.findByIDSize(id);
        return size != null ? size.getTenSize() : "Không xác định";
    }
}
