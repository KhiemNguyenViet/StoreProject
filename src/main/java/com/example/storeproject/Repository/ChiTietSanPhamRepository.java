package com.example.storeproject.Repository;

import com.example.storeproject.Models.ChiTietSanPham;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietSanPhamRepository extends CrudRepository<ChiTietSanPham, Long> {
}
