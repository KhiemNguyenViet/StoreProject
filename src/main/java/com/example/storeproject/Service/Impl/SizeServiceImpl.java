package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.Size;
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
    public List<Size> getAllSize() {
        return (List<Size>) sizeRepository.findAll();
    }

    @Override
    public void saveSize(Size size) {
        sizeRepository.save(size);
    }

    @Override
    public void deleteSize(Integer IDSize) {
        sizeRepository.deleteById(IDSize);
    }

    @Override
    public Size findSizeById(Integer id) {
        return sizeRepository.findByIDSize(id);
    }
}
