package com.example.storeproject.Models;

import java.math.BigDecimal;

public class GioHang {
    private String tenSP;
    private int soLuong;
    private Boolean xoaSP;
    private Boolean themVoucher;
    private BigDecimal tongTien;
    private Boolean muaHang;
    private int idSP;


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

    public Boolean getXoaSP() {
        return xoaSP;
    }

    public void setXoaSP(Boolean xoaSP) {
        this.xoaSP = xoaSP;
    }

    public Boolean getThemVoucher() {
        return themVoucher;
    }

    public void setThemVoucher(Boolean themVoucher) {
        this.themVoucher = themVoucher;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public Boolean getMuaHang() {
        return muaHang;
    }

    public void setMuaHang(Boolean muaHang) {
        this.muaHang = muaHang;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }
}

