package com.longtien.service;

import com.longtien.model.Product;
import net.bytebuddy.dynamic.DynamicType;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
