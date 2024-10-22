package com.example.storeproject.Models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="usermanager")
public class ManagerUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idquyen;

    private String namequyen;

    public ManagerUser() {
    }

    public ManagerUser(Long idquyen, String namequyen) {
        this.idquyen = idquyen;
        this.namequyen = namequyen;
    }

    public Long getIdquyen() {
        return idquyen;
    }

    public void setIdquyen(Long idquyen) {
        this.idquyen = idquyen;
    }

    public String getNamequyen() {
        return namequyen;
    }

    public void setNamequyen(String namequyen) {
        this.namequyen = namequyen;
    }
}
