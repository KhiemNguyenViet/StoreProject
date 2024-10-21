package com.example.storeproject.Repository;

import com.example.storeproject.Models.GioHang;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GioHangRepository extends CrudRepository<GioHang, Long> {
    GioHang findById (int id);
}
