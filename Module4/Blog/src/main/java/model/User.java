package model;

import enums.Role;

import java.util.Date;

public class User {
    private Integer ID;
    private String name;
    private String password;
    private String email;
    private Date birth;

    private boolean registered;
    private Role role;

    private Blog blog;



    public User(Integer id,String name,String password, String email, Date birth, Role role) {
        this.ID = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.birth = birth;
        this.role = role;
        this.registered = true;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }


}
