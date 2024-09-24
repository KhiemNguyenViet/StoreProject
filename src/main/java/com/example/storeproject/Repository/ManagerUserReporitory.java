package com.example.storeproject.Repository;

import com.example.storeproject.Models.ManagerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerUserReporitory extends JpaRepository<ManagerUser, Long> {
    ManagerUser findByNamequyen(String namequyen);
}
