package com.example.storeproject.Service;

import com.example.storeproject.Models.ManagerUser;
import com.example.storeproject.Models.NguoiDung;
import com.example.storeproject.Models.Size;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ManagerUserService {
    ManagerUser getManagerUserById(Integer idquyen);
    ManagerUser getManagerUserByName(String namequyen);
    List<ManagerUser> getAllManagerUser();

    void saveManagerUser(ManagerUser managerUser);

    void deleteManagerUser(Integer idquyen);

    ManagerUser findManagerUserById(Integer idquyen);
}
