package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="loaisp")
public class LoaiSP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IDLoai;
    private String TenLoai;

    public LoaiSP() {
    }

    public LoaiSP(Integer IDLoai, String tenLoai) {
        this.IDLoai = IDLoai;
        TenLoai = tenLoai;
    }


    public Integer getIDLoai() {
        return IDLoai;
    }

    public void setIDLoai(Integer IDLoai) {
        this.IDLoai = IDLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }
}
