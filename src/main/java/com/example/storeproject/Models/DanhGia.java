package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="danhgia")
public class DanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IDDanhGia;

    private int IDSP;
    private int IDKhachHang;
    private int SoSao;
    private String BinhLuan;

    public DanhGia() {
    }

    public DanhGia(int IDDanhGia, int IDSP, int IDKhachHang, int soSao, String binhLuan) {
        this.IDDanhGia = IDDanhGia;
        this.IDSP = IDSP;
        this.IDKhachHang = IDKhachHang;
        SoSao = soSao;
        BinhLuan = binhLuan;
    }

    public int getIDDanhGia() {
        return IDDanhGia;
    }

    public void setIDDanhGia(int IDDanhGia) {
        this.IDDanhGia = IDDanhGia;
    }

    public int getIDSP() {
        return IDSP;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }

    public int getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(int IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public int getSoSao() {
        return SoSao;
    }

    public void setSoSao(int soSao) {
        SoSao = soSao;
    }

    public String getBinhLuan() {
        return BinhLuan;
    }

    public void setBinhLuan(String binhLuan) {
        BinhLuan = binhLuan;
    }
}
