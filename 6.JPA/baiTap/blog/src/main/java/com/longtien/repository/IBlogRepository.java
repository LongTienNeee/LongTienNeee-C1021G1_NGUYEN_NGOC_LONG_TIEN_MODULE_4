package com.longtien.repository;

import com.longtien.model.Blog;

import java.util.List;

public interface IBlogRepository {
    public List<Blog> findAll();
    void save(Blog blog);
    void delete(long id);
    Blog findById(long id);
    void edit(long id);
}
