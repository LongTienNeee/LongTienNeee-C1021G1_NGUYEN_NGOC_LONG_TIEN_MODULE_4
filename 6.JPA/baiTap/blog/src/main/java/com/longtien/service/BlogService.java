package com.longtien.service;

import com.longtien.model.Blog;
import com.longtien.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(long id) {
        blogRepository.delete(id);
    }

    @Override
    public Blog findById(long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void edit(long id) {
        blogRepository.edit(id);
    }
}
