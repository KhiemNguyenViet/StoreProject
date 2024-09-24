//package com.example.storeproject.Service;
//
//import com.example.storeproject.Models.NguoiDung;
//import com.example.storeproject.Repository.NguoiDungRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//    @Autowired
//    private NguoiDungRepository userRepository;
//
//    public NguoiDung authenticate(String username, String password) {
//        NguoiDung user = userRepository.findByUsername(username);
//        if (user != null && user.getPassWord().equals(password)) {
//            return user;
//        }
//        return null;
//    }
//
//    public Long getUserRoleId(NguoiDung user) {
//        return user.getIDQuyen();
//    }
//}
