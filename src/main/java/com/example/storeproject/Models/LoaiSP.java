package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name="loaisp")
public class LoaiSP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IDLoai;
    private String TenLoai;

    @OneToMany(mappedBy = "loaisp")
    private List<ChiTietSanPham> chiTietSanPhams;

    public LoaiSP() {
    }

    public LoaiSP(Integer IDLoai, String tenLoai) {
        this.IDLoai = IDLoai;
        TenLoai = tenLoai;
    }

    public LoaiSP(List<ChiTietSanPham> chiTietSanPhams) {
        this.chiTietSanPhams = chiTietSanPhams;
    }

    public List<ChiTietSanPham> getChiTietSanPhams() {
        return chiTietSanPhams;
    }

    public void setChiTietSanPhams(List<ChiTietSanPham> chiTietSanPhams) {
        this.chiTietSanPhams = chiTietSanPhams;
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
