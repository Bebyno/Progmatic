package com.example.BlogSpring.jpaRepo;

import com.example.BlogSpring.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog, Long> {
}
