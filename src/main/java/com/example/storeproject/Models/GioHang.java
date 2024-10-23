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
    private String AnhSP;

    @ManyToOne
    @JoinColumn(name = "IDSP", nullable = false)
    private ChiTietSanPham chiTietSanPham;


//     Getter và Setter cho soLuong


    public String getAnhSP() {
        return AnhSP;
    }

    public void setAnhSP(String anhSP) {
        AnhSP = anhSP;
    }

    public GioHang(String anhSP) {
        AnhSP = anhSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public GioHang(int soLuong) {
        this.soLuong = soLuong;
    }

    public GioHang(int id, String tenSP, Boolean maGiamGia, BigDecimal gia, ChiTietSanPham chiTietSanPham) {
        this.id = id;
        this.tenSP = tenSP;
        this.maGiamGia = maGiamGia;
        this.gia = gia;
        this.chiTietSanPham = chiTietSanPham;
    }

    public GioHang() {

    }

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

    public Boolean getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(Boolean maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public ChiTietSanPham getChiTietSanPham() {
        return chiTietSanPham;
    }

    public void setChiTietSanPham(ChiTietSanPham chiTietSanPham) {
        this.chiTietSanPham = chiTietSanPham;
    }
}
