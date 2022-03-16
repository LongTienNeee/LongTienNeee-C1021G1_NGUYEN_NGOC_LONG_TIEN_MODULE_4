package com.longtien.repository;

import com.longtien.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Product, Long> {
}
