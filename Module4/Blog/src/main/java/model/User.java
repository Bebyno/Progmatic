package model;

import enums.Access;

import java.util.Date;

public class User {
    private String name;
    private String password;
    private String email;
    private Date birth;

    private Access access;


    public User(String name,String password, String email, Date birth) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.birth = birth;
    }


}
