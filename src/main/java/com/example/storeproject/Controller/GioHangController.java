package com.example.storeproject.Controller;

import com.example.storeproject.Models.GioHang;
import com.example.storeproject.Service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class GioHangController {
    @Autowired
    private GioHangService gioHangService;

    @PostMapping("/add")
    public void addToCart(@RequestBody GioHang gioHang) {
        gioHangService.addToCart(gioHang);
    }

    @PutMapping("/update/{id}/{quantity}")
    public void updateCart(@PathVariable int id, @PathVariable int quantity) {
        gioHangService.updateCart(id, quantity);
    }

    @GetMapping("/items")
    public List<GioHang> getCartItems() {
        return gioHangService.getCartItems();
    }

    @DeleteMapping("/remove/{id}")
    public void removeFromCart(@PathVariable int id) {
        gioHangService.removeFromCart(id);
    }
}
