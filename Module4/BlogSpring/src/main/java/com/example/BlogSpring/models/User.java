package com.example.BlogSpring.models;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails {
    @Id
    private String username;

    private String nickName;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole authority;

    @CreationTimestamp
    private LocalDateTime regTime;

    private boolean isLocked;

    @OneToMany(mappedBy = "owner")
    private List<Blog> blogs;

    public User() {
        blogs = new ArrayList<>();
    }

    public User(String username, String nickName, String password, UserRole authority) {
        this();
        this.username = username;
        this.nickName = nickName;
        this.password = password;
        this.authority = authority;
        //  this.authority = authority;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> list = new ArrayList<>();

        for (UserAuth auth : authority.AUTHS) {
            list.add(new SimpleGrantedAuthority(auth.toString()));
        }

        return list;

    }


    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return !isLocked;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !isLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !isLocked;
    }

    @Override
    public boolean isEnabled() {
        return !isLocked;
    }
}
