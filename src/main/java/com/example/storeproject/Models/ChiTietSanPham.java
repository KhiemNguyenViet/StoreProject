package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Entity
@Table(name = "ctsp")
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IDSP;

    private String TenSP;
    private BigDecimal Gia;
    private String ChiTietSP;
    private String AnhSP;
    private int SoLuong;
    private int IDLoai;
    private String ChatLieu;
    private Date NgayThemVao;
    private int IDKhuyenMai;
    private int IDSize;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(int IDSP, String tenSP, BigDecimal gia, String chiTietSP, String anhSP, int soLuong, int IDLoai, String chatLieu, Date ngayThemVao, int IDKhuyenMai, int IDSize) {
        this.IDSP = IDSP;
        TenSP = tenSP;
        Gia = gia;
        ChiTietSP = chiTietSP;
        AnhSP = anhSP;
        SoLuong = soLuong;
        this.IDLoai = IDLoai;
        ChatLieu = chatLieu;
        NgayThemVao = ngayThemVao;
        this.IDKhuyenMai = IDKhuyenMai;
        this.IDSize = IDSize;
    }

    public int getIDSP() {
        return IDSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public BigDecimal getGia() {
        return Gia;
    }

    public String getChiTietSP() {
        return ChiTietSP;
    }

    public String getAnhSP() {
        return AnhSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getIDLoai() {
        return IDLoai;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public Date getNgayThemVao() {
        return NgayThemVao;
    }

    public int getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    public int getIDSize() {
        return IDSize;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public void setGia(BigDecimal gia) {
        Gia = gia;
    }

    public void setChiTietSP(String chiTietSP) {
        ChiTietSP = chiTietSP;
    }

    public void setAnhSP(String anhSP) {
        AnhSP = anhSP;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public void setIDLoai(int IDLoai) {
        this.IDLoai = IDLoai;
    }

    public void setChatLieu(String chatLieu) {
        ChatLieu = chatLieu;
    }

    public void setNgayThemVao(Date ngayThemVao) {
        NgayThemVao = ngayThemVao;
    }

    public void setIDKhuyenMai(int IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    public void setIDSize(int IDSize) {
        this.IDSize = IDSize;
    }
}
