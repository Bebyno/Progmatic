package model;

import enums.Access;

import java.util.Date;

public class User {
    private Integer ID;
    private String name;
    private String password;
    private String email;
    private Date birth;

    private boolean registered;
    private Access access;

    private Blog blog;



    public User(Integer id,String name,String password, String email, Date birth, Access access) {
        this.ID = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.birth = birth;
        this.access = access;
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

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
