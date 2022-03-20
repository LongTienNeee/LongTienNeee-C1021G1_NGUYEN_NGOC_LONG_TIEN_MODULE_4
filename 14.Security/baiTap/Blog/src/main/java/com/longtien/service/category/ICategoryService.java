package com.longtien.service.category;

import com.longtien.model.Blog;
import com.longtien.model.Category;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();
    Optional<Category> findById(Long id);
}
