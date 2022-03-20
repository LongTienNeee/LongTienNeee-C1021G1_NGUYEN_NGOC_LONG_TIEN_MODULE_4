package com.longtien.service;

import com.longtien.model.Product;

import java.util.Optional;

public interface IProductService{
   Iterable<Product> findAll();
   Optional<Product> findById(Long id);
   void save(Product product);
   void delete(Product product);
}
