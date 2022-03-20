package com.longtien.service.blog;

import com.longtien.model.Blog;
import com.longtien.service.category.ICategoryService;

import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();
    Optional<Blog> findById(Long id);
}
