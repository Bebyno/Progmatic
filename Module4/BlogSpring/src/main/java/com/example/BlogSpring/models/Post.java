package com.example.BlogSpring.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Blog releasedBlog;

    private String title;

    private String text;

    @CreationTimestamp
    private LocalDateTime writtenTime;

    @OneToMany(mappedBy = "postTo")
    private List<Comment> comments;


    public Post() {
        comments = new ArrayList<>();
    }

    public Post(Blog releasedBlog, String title, String text) {
        this();
        this.releasedBlog = releasedBlog;
        this.title = title;
        this.text = text;
    }

}
