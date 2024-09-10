package com.example.storeproject.Repository;

import com.example.storeproject.Models.ChiTietSanPhamml;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietSanPhamRepository extends CrudRepository<ChiTietSanPhamml, Long> {
}
