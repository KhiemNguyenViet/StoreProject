package com.example.storeproject.Service;

import com.example.storeproject.Models.ManagerUser;

public interface ManagerUserService {
    ManagerUser getManagerUserById(Long idquyen);
    ManagerUser getManagerUserByName(String namequyen);
}
