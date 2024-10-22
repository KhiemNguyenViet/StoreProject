package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Models.Size;
import com.example.storeproject.Repository.ManagerUserReporitory;
import com.example.storeproject.Service.ManagerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerUserServiceImpl implements ManagerUserService {
    @Autowired
    private ManagerUserReporitory managerUserReporitory;

    @Override
    public ManagerUser getManagerUserById (Integer idquyen){
        return managerUserReporitory.findById(idquyen).orElse(null);
    }

    @Override
    public ManagerUser getManagerUserByName(String namequyen){
        return managerUserReporitory.findByNamequyen(namequyen);
    }

    @Override
    public List<ManagerUser> getAllManagerUser() {
        return (List<ManagerUser>) managerUserReporitory.findAll();
    }

    @Override
    public void saveManagerUser(ManagerUser managerUser) {
        managerUserReporitory.save(managerUser);
    }

    @Override
    public void deleteManagerUser(Integer idquyen) {
        managerUserReporitory.deleteById(idquyen);
    }

    @Override
    public ManagerUser findManagerUserById(Integer idquyen) {
        return managerUserReporitory.findByIdquyen(idquyen);
    }
}
