package com.example.storeproject.Models;

import java.math.BigDecimal;


    public class BaoCaoThongKe {
        private String spBanChay;
        private BigDecimal doanhThu;
        private int spTonKho;
        private int idSP;

        // Getters và Setters
        public String getSpBanChay() {
            return spBanChay;
        }

        public void setSpBanChay(String spBanChay) {
            this.spBanChay = spBanChay;
        }

        public BigDecimal getDoanhThu() {
            return doanhThu;
        }

        public void setDoanhThu(BigDecimal doanhThu) {
            this.doanhThu = doanhThu;
        }

        public int getSpTonKho() {
            return spTonKho;
        }

        public void setSpTonKho(int spTonKho) {
            this.spTonKho = spTonKho;
        }

        public int getIdSP() {
            return idSP;
        }

        public void setIdSP(int idSP) {
            this.idSP = idSP;
        }
    }

