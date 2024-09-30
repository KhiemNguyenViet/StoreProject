package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "giohang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String tenSP;
    private int soLuong; // Thêm thuộc tính số lượng
    private Boolean maGiamGia;
    private BigDecimal gia;
    private int IDSP;

    // Getter và Setter cho soLuong
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
