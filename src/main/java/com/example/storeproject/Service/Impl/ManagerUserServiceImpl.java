package com.example.storeproject.Service.Impl;

import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Repository.ManagerUserReporitory;
import com.example.storeproject.Service.ManagerUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerUserServiceImpl implements ManagerUserService {
    @Autowired
    private ManagerUserReporitory managerUserReporitory;

    @Override
    public ManagerUser getManagerUserById (Long idquyen){
        return managerUserReporitory.findById(idquyen).orElse(null);
    }

    @Override
    public ManagerUser getManagerUserByName(String namequyen){
        return managerUserReporitory.findByNamequyen(namequyen);
    }
}
