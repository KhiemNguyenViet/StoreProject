package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "giohang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String tenSP;
//    private int soLuong;
    private Boolean MaGiamGia;
    private BigDecimal gia;
    private int IDSP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

//    public int getSoLuong() {
//        return soLuong;
//    }
//
//    public void setSoLuong(int soLuong) {
//        this.soLuong = soLuong;
//    }

    public Boolean getMaGiamGia() {
        return MaGiamGia;
    }

    public void setMaGiamGia(Boolean maGiamGia) {
        MaGiamGia = maGiamGia;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public int getIDSP() {
        return IDSP;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }
}

