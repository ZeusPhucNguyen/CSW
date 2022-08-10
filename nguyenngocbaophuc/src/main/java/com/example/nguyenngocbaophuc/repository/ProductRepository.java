package com.example.nguyenngocbaophuc.repository;

import com.example.nguyenngocbaophuc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
