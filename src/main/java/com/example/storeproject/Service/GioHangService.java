package com.example.storeproject.Service;

import com.example.storeproject.Models.GioHang;

import java.util.List;

public interface GioHangService {
    void addToCart(GioHang gioHang);
    Integer updateCart(int id, int newQuantity);
    List<GioHang> getCartItems();
    void removeFromCart(int id);
    GioHang getGioHangId (int id);
}
