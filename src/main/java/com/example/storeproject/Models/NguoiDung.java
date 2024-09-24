package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
@Table(name="users")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String Ten;
    private Date NgaySinh;
    private String DiaChi;
    private String SDT;
    private String Mail;
    private String GioiTinh;
    private String PassWord;
    private String UserName;
    private Long IDQuyen;

    public NguoiDung() {
    }

    public NguoiDung(int idUser, String ten, Date ngaySinh, String diaChi, String SDT, String mail, String gioiTinh, String passWord, String userName, Long IDQuyen) {
        this.idUser = idUser;
        Ten = ten;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        this.SDT = SDT;
        Mail = mail;
        GioiTinh = gioiTinh;
        PassWord = passWord;
        UserName = userName;
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

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Long getIDQuyen() {
        return IDQuyen;
    }

    public void setIDQuyen(Long IDQuyen) {
        this.IDQuyen = IDQuyen;
    }


}
