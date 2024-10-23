package com.example.storeproject.Repository;

import com.example.storeproject.Models.KhuyenMai;
import org.springframework.data.repository.CrudRepository;

public interface KhuyenMaiRepository extends CrudRepository<KhuyenMai,Integer> {
    KhuyenMai findById (int IDKhuyenMai);
}
