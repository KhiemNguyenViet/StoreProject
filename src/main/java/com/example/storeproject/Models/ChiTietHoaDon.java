package com.example.storeproject.Models;

import java.math.BigDecimal;

public class ChiTietHoaDon {
    private int IDHoaDon;
    private int IDSP;
    private int SoLuong;
    private BigDecimal ThanhTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int IDHoaDon, int IDSP, int soLuong, BigDecimal thanhTien) {
        this.IDHoaDon = IDHoaDon;
        this.IDSP = IDSP;
        SoLuong = soLuong;
        ThanhTien = thanhTien;
    }

    public int getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(int IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public int getIDSP() {
        return IDSP;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        ThanhTien = thanhTien;
    }
}
