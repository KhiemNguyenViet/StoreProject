package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="thanhtoan")
public class PhuongThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IDThanhToan;
    private int quantity;
    private String tenSP;
    private int soluong;
    private int magiamgia;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private GioHang gioHang;

    public PhuongThucThanhToan() {
    }

    public PhuongThucThanhToan(int IDThanhToan, int quantity, String tenSP, int soluong, int magiamgia, GioHang gioHang) {
        this.IDThanhToan = IDThanhToan;
        this.quantity = quantity;
        this.tenSP = tenSP;
        this.soluong = soluong;
        this.magiamgia = magiamgia;
        this.gioHang = gioHang;
    }

    public int getIDThanhToan() {
        return IDThanhToan;
    }

    public void setIDThanhToan(int IDThanhToan) {
        this.IDThanhToan = IDThanhToan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getMagiamgia() {
        return magiamgia;
    }

    public void setMagiamgia(int magiamgia) {
        this.magiamgia = magiamgia;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }
}
