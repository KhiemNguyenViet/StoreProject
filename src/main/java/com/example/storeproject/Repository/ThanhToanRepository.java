package com.example.storeproject.Repository;

import com.example.storeproject.Models.PhuongThucThanhToan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThanhToanRepository extends JpaRepository<PhuongThucThanhToan,Integer> {
    PhuongThucThanhToan findByIDThanhToan(int IDThanhToan);
}
