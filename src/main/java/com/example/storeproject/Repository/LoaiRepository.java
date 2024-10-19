package com.example.storeproject.Repository;

import com.example.storeproject.Models.LoaiSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiRepository extends JpaRepository<LoaiSP,Integer> {
    LoaiSP findLoaiSPByIDLoai (int IDLoai);
}
