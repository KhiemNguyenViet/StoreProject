package com.example.storeproject.Models;

import java.math.BigDecimal;

public class GioHang {
    private String tenSP;
    private int soLuong;
    private Boolean themVoucher;
    private BigDecimal gia;
    private int IDSP;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Boolean getThemVoucher() {
        return themVoucher;
    }

    public void setThemVoucher(Boolean themVoucher) {
        this.themVoucher = themVoucher;
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

