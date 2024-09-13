package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;
@Getter
@Entity
@Table(name="khuyenmai")
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IDKhuyenMai;

    private String TenKhuyenMai;
    private String MoTa;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private String LoaiKhuyenMai;
    private BigDecimal GiaTri;

    public KhuyenMai() {
    }

    public KhuyenMai(int IDKhuyenMai, String tenKhuyenMai, String moTa, Date ngayBatDau, Date ngayKetThuc, String loaiKhuyenMai, BigDecimal giaTri) {
        this.IDKhuyenMai = IDKhuyenMai;
        TenKhuyenMai = tenKhuyenMai;
        MoTa = moTa;
        NgayBatDau = ngayBatDau;
        NgayKetThuc = ngayKetThuc;
        LoaiKhuyenMai = loaiKhuyenMai;
        GiaTri = giaTri;
    }

    public int getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    public void setIDKhuyenMai(int IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        TenKhuyenMai = tenKhuyenMai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        NgayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        NgayKetThuc = ngayKetThuc;
    }

    public String getLoaiKhuyenMai() {
        return LoaiKhuyenMai;
    }

    public void setLoaiKhuyenMai(String loaiKhuyenMai) {
        LoaiKhuyenMai = loaiKhuyenMai;
    }

    public BigDecimal getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(BigDecimal giaTri) {
        GiaTri = giaTri;
    }
}
