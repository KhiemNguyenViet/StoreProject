package com.example.storeproject.Models;

import java.math.BigDecimal;

public class HoaDon {
    private int IDHoaDon;
    private int IDKhachHang;
    private int IDGiamGia;
    private String TrangThai;
    private BigDecimal ThanhTien;

    public HoaDon() {
    }

    public HoaDon(int IDHoaDon, int IDKhachHang, int IDGiamGia, String trangThai, BigDecimal thanhTien) {
        this.IDHoaDon = IDHoaDon;
        this.IDKhachHang = IDKhachHang;
        this.IDGiamGia = IDGiamGia;
        TrangThai = trangThai;
        ThanhTien = thanhTien;
    }

    public int getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(int IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public int getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(int IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public int getIDGiamGia() {
        return IDGiamGia;
    }

    public void setIDGiamGia(int IDGiamGia) {
        this.IDGiamGia = IDGiamGia;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        ThanhTien = thanhTien;
    }
}
