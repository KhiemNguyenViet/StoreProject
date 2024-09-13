package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="loaisp")
public class LoaiSP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
