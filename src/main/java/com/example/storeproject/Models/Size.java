package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="size")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IDSize;
    private String TenSize;

    public Size() {
    }

    public Size(Integer IDSize, String tenSize) {
        this.IDSize = IDSize;
        TenSize = tenSize;
    }

    public Integer getIDSize() {
        return IDSize;
    }

    public void setIDSize(Integer IDSize) {
        this.IDSize = IDSize;
    }

    public String getTenSize() {
        return TenSize;
    }

    public void setTenSize(String tenSize) {
        TenSize = tenSize;
    }
}
