
package com.longtien.service;

import com.longtien.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(long id);

    Blog findById(long id);

    void edit(long id);
}
