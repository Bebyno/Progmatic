package com.example.BlogSpring.controllers;

import com.example.BlogSpring.models.Blog;
import com.example.BlogSpring.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    private BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/blogs")
    public Blog creatingBlog(@RequestBody Blog newBlog) {
        return blogService.creatingBlog(newBlog);
    }

    @GetMapping("/blogs")
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }


}

