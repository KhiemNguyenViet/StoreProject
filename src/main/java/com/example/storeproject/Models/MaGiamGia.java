package com.example.storeproject.Models;

import java.math.BigDecimal;

public class MaGiamGia {
    private int MaGiamGia;
    private BigDecimal GiaTriGiamGia;
    private String LoaiGiamGia;
    private boolean TrangThai;
    private int SoLuongMaSuDung;
    private String DieuKienApDung;

    public MaGiamGia() {
    }

    public MaGiamGia(int maGiamGia, BigDecimal giaTriGiamGia, String loaiGiamGia, boolean trangThai, int soLuongMaSuDung, String dieuKienApDung) {
        MaGiamGia = maGiamGia;
        GiaTriGiamGia = giaTriGiamGia;
        LoaiGiamGia = loaiGiamGia;
        TrangThai = trangThai;
        SoLuongMaSuDung = soLuongMaSuDung;
        DieuKienApDung = dieuKienApDung;
    }

    public int getMaGiamGia() {
        return MaGiamGia;
    }

    public void setMaGiamGia(int maGiamGia) {
        MaGiamGia = maGiamGia;
    }

    public BigDecimal getGiaTriGiamGia() {
        return GiaTriGiamGia;
    }

    public void setGiaTriGiamGia(BigDecimal giaTriGiamGia) {
        GiaTriGiamGia = giaTriGiamGia;
    }

    public String getLoaiGiamGia() {
        return LoaiGiamGia;
    }

    public void setLoaiGiamGia(String loaiGiamGia) {
        LoaiGiamGia = loaiGiamGia;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean trangThai) {
        TrangThai = trangThai;
    }

    public int getSoLuongMaSuDung() {
        return SoLuongMaSuDung;
    }

    public void setSoLuongMaSuDung(int soLuongMaSuDung) {
        SoLuongMaSuDung = soLuongMaSuDung;
    }

    public String getDieuKienApDung() {
        return DieuKienApDung;
    }

    public void setDieuKienApDung(String dieuKienApDung) {
        DieuKienApDung = dieuKienApDung;
    }
}
