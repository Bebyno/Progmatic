package com.example.BlogSpring.services;

import com.example.BlogSpring.jpaRepo.BlogRepo;
import com.example.BlogSpring.models.Blog;
import com.example.BlogSpring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    UserService userService;

    @Autowired
    BlogRepo blogRepo;

    public List<Blog> getAllBlogs() {
        return blogRepo.findAll();

    }

    public Blog creatingBlog(Blog newBlog) {
        if (userService.getLoggedInUser() != null) {    // ????
            newBlog.setOwner(userService.getLoggedInUser());
            return blogRepo.save(newBlog);
        }
        return null;

    }
}
