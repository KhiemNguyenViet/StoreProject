package com.example.storeproject.Service;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.Size;

import java.util.List;
import java.util.Optional;

public interface SizeService {
    List<Size> getAllSize();

    void saveSize(Size size);

    void deleteSize(Integer IDSize);

    Size findSizeById(Integer id);
}
