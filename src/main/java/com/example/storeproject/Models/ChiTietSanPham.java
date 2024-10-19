package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
@Setter
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
    private String ChatLieu;
    private Date NgayThemVao;

    @ManyToOne
    @JoinColumn(name = "IDKhuyenMai", nullable = false)
    private KhuyenMai khuyenMai;

    @ManyToOne
    @JoinColumn(name = "IDSize", nullable = false)
    private Size size;

    @ManyToOne
    @JoinColumn(name = "IDLoai", nullable = false)
    private LoaiSP loaisp;


    public ChiTietSanPham() {
    }

    public ChiTietSanPham(int IDSP, String tenSP, BigDecimal gia, String chiTietSP, String anhSP, int soLuong, String chatLieu, Date ngayThemVao, KhuyenMai khuyenMai, Size size, LoaiSP loaisp) {
        this.IDSP = IDSP;
        TenSP = tenSP;
        Gia = gia;
        ChiTietSP = chiTietSP;
        AnhSP = anhSP;
        SoLuong = soLuong;
        ChatLieu = chatLieu;
        NgayThemVao = ngayThemVao;
        this.khuyenMai = khuyenMai;
        this.size = size;
        this.loaisp = loaisp;
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

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public LoaiSP getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(LoaiSP loaisp) {
        this.loaisp = loaisp;
    }
}
