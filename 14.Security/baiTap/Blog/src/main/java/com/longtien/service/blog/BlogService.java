package com.longtien.service.blog;

import com.longtien.model.Blog;
import com.longtien.model.Category;
import com.longtien.repository.IBLogRepository;
import com.longtien.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBLogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }
}
