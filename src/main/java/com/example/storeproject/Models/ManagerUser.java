package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="usermanager")
public class ManagerUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IDQuyen;

    private String TenQuyen;

    public ManagerUser() {
    }

    public ManagerUser(int IDQuyen, String tenQuyen) {
        this.IDQuyen = IDQuyen;
        TenQuyen = tenQuyen;
    }

    public int getIDQuyen() {
        return IDQuyen;
    }

    public void setIDQuyen(int IDQuyen) {
        this.IDQuyen = IDQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        TenQuyen = tenQuyen;
    }
}
