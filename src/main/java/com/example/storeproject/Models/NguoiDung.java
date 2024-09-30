package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Entity
@Table(name = "users")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String Ten;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date NgaySinh;
    private String DiaChi;
    private String SDT;
    private String Mail;
    private String GioiTinh;
    private String password;
    private String username;
    private Long IDQuyen;

    public NguoiDung() {
    }

    public NguoiDung(int idUser, String ten, Date ngaySinh, String diaChi, String SDT, String mail, String gioiTinh, String password, String username, Long IDQuyen) {
        this.idUser = idUser;
        Ten = ten;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        this.SDT = SDT;
        Mail = mail;
        GioiTinh = gioiTinh;
        this.password = password;
        this.username = username;
        this.IDQuyen = IDQuyen;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getIDQuyen() {
        return IDQuyen;
    }

    public void setIDQuyen(Long IDQuyen) {
        this.IDQuyen = IDQuyen;
    }
}
