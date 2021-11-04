package com.example.BlogSpring.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private User owner;

    private String blogName;

    @CreationTimestamp
    private LocalDateTime creationTime;
    private boolean isHidden;

    @OneToMany(mappedBy = "releasedBlog")
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public Blog(User owner, String blogName) {
        this();
        this.owner = owner;
        this.blogName = blogName;
    }
    public Blog(User owner, String blogName, boolean isHidden) {
        this(owner, blogName);
        this.isHidden = isHidden;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public boolean isHidden() {
        return isHidden;
    }

    private void setHidden(boolean hidden) {
        if (isHidden != hidden) {
            isHidden = hidden;
        }
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
