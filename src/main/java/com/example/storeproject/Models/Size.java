package com.example.storeproject.Models;

public class Size {
    private int IDSize;
    private String TenSize;

    public Size() {
    }

    public Size(int IDSize, String tenSize) {
        this.IDSize = IDSize;
        TenSize = tenSize;
    }

    public int getIDSize() {
        return IDSize;
    }

    public void setIDSize(int IDSize) {
        this.IDSize = IDSize;
    }

    public String getTenSize() {
        return TenSize;
    }

    public void setTenSize(String tenSize) {
        TenSize = tenSize;
    }
}
