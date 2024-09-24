package com.example.storeproject.Repository;

import com.example.storeproject.Models.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NguoiDungRepository extends JpaRepository<NguoiDung,Long> {
    NguoiDung findByUsername(String username);
}
