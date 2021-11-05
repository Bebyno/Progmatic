package com.example.BlogSpring.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private long id;

    //fetch = FetchType.EAGER, ?
    @ManyToOne
    private User author;

    @ManyToOne
    private Post postTo;

    @ManyToOne
    private Comment commentTo;

    private String text;

    @CreationTimestamp
    private LocalDateTime writtenTime;

    private boolean isDeleted;

    public Comment() {}

    public Comment(User author, Post postTo, String text) {
        this();
        this.author = author;
        this.postTo = postTo;
        this.text = text;
    }

    public Comment(User author, Post postTo, Comment commentTo, String text) {
        this(author, postTo, text);
        this.commentTo = commentTo;
    }
}
