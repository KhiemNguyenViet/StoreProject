package com.example.storeproject.Models;

public class LoaiSP {
    private int IDLoai;
    private String TenLoai;

    public LoaiSP() {
    }

    public LoaiSP(int IDLoai, String tenLoai) {
        this.IDLoai = IDLoai;
        TenLoai = tenLoai;
    }

    public int getIDLoai() {
        return IDLoai;
    }

    public void setIDLoai(int IDLoai) {
        this.IDLoai = IDLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }
}
