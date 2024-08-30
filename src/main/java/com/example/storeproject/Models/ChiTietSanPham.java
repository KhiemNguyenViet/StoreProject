package com.example.storeproject.Models;

import java.math.BigDecimal;
import java.util.Date;

public class ChiTietSanPham {
    private int IDSP;
    private String TenSP;
    private BigDecimal Gia;
    private String ChiTietSP;
    private String AnhSP;
    private int SoLuong;
    private int IDLoai;
    private int PhanLoai;
    private String ChatLieu;
    private Date NgayThemVao;
    private int IDKhuyenMai;
    private int IDSize;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(int IDSP, String tenSP, BigDecimal gia, String chiTietSP, String anhSP, int soLuong, int IDLoai, int phanLoai, String chatLieu, Date ngayThemVao, int IDKhuyenMai, int IDSize) {
        this.IDSP = IDSP;
        TenSP = tenSP;
        Gia = gia;
        ChiTietSP = chiTietSP;
        AnhSP = anhSP;
        SoLuong = soLuong;
        this.IDLoai = IDLoai;
        PhanLoai = phanLoai;
        ChatLieu = chatLieu;
        NgayThemVao = ngayThemVao;
        this.IDKhuyenMai = IDKhuyenMai;
        this.IDSize = IDSize;
    }

    public int getIDSP() {
        return IDSP;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public BigDecimal getGia() {
        return Gia;
    }

    public void setGia(BigDecimal gia) {
        Gia = gia;
    }

    public String getChiTietSP() {
        return ChiTietSP;
    }

    public void setChiTietSP(String chiTietSP) {
        ChiTietSP = chiTietSP;
    }

    public String getAnhSP() {
        return AnhSP;
    }

    public void setAnhSP(String anhSP) {
        AnhSP = anhSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getIDLoai() {
        return IDLoai;
    }

    public void setIDLoai(int IDLoai) {
        this.IDLoai = IDLoai;
    }

    public int getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(int phanLoai) {
        PhanLoai = phanLoai;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String chatLieu) {
        ChatLieu = chatLieu;
    }

    public Date getNgayThemVao() {
        return NgayThemVao;
    }

    public void setNgayThemVao(Date ngayThemVao) {
        NgayThemVao = ngayThemVao;
    }

    public int getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    public void setIDKhuyenMai(int IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    public int getIDSize() {
        return IDSize;
    }

    public void setIDSize(int IDSize) {
        this.IDSize = IDSize;
    }
}
