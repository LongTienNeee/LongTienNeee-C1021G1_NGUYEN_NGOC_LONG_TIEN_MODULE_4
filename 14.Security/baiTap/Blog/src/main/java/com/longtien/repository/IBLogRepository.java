package com.longtien.repository;

import com.longtien.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBLogRepository extends JpaRepository<Blog, Long> {
}
