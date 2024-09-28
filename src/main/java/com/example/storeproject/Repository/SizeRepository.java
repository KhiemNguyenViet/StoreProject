package com.example.storeproject.Repository;

import com.example.storeproject.Models.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends CrudRepository<Size,Integer> {
    Size findByIDSize(int IDSize);
}
