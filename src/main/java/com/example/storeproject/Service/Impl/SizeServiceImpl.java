package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Repository.SizeRepository;
import com.example.storeproject.Service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeServiceImpl implements SizeService {
    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public List<Size> getAllSize(){
        return (List<Size>) sizeRepository.findAll();
    }

    @Override
    public void saveSize(Size size){
        sizeRepository.save(size);
    }

    @Override
    public void deleteSize(Long id){
        sizeRepository.deleteById(id);
    }

    @Override
    public Optional<Size> findSizeById(Long id){
        return sizeRepository.findById(id);
    }
}
