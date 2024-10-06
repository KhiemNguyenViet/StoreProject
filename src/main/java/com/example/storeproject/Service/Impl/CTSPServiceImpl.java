package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ChiTietSanPham;
import com.example.storeproject.Models.LoaiSP;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Repository.ChiTietSanPhamRepository;
import com.example.storeproject.Repository.LoaiRepository;
import com.example.storeproject.Repository.SizeRepository;
import com.example.storeproject.Service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CTSPServiceImpl implements CTSPService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private LoaiRepository loaiRepository;

    @Override
    public void save(ChiTietSanPham product) {
        chiTietSanPhamRepository.save(product);
    }

    @Override
    public ChiTietSanPham updateProduct(int id, ChiTietSanPham product) {
        // Kiểm tra xem sản phẩm có tồn tại không
        if (chiTietSanPhamRepository.existsById(id)) {
            product.setIDSP(id);
            return chiTietSanPhamRepository.save(product);
        } else {
            throw new RuntimeException("Sản phẩm không tồn tại");
        }
    }

    @Override
    public void deleteProduct(int id) {
        chiTietSanPhamRepository.deleteById(id);
    }

    @Override
    public List<ChiTietSanPham> getAllProducts() {
        return chiTietSanPhamRepository.findAll();
    }

    @Override
    public ChiTietSanPham getProductById(int id) {
        // Trả về sản phẩm hoặc ném ra ngoại lệ nếu không tìm thấy
        return chiTietSanPhamRepository.findById(id).orElse(null);
    }

//    public String getSizeName(int id) {
//        Size size = sizeRepository.findByIDSize(id);
//        return size != null ? size.getTenSize() : "Không xác định";
//    }
//
//    public String getLoaiName(int id) {
//        LoaiSP loaiSP = loaiRepository.findByIDLoai(id);
//        return loaiSP != null ? loaiSP.getTenLoai() : "Không xác định";
//    }
}
