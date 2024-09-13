package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="thanhtoan")
public class PhuongThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IDThanhToan;
    private String TenThanhToan;

    public PhuongThucThanhToan() {
    }

    public PhuongThucThanhToan(int IDThanhToan, String tenThanhToan) {
        this.IDThanhToan = IDThanhToan;
        TenThanhToan = tenThanhToan;
    }

    public int getIDThanhToan() {
        return IDThanhToan;
    }

    public void setIDThanhToan(int IDThanhToan) {
        this.IDThanhToan = IDThanhToan;
    }

    public String getTenThanhToan() {
        return TenThanhToan;
    }

    public void setTenThanhToan(String tenThanhToan) {
        TenThanhToan = tenThanhToan;
    }
}
