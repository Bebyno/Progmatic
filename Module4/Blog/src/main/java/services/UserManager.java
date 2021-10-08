package services;

import Exceptions.NotAuthorizedException;
import dataBase.DBEngine;
import enums.Role;
import model.Blog;
import model.BlogEntry;
import model.User;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserManager {
    private LoginManager loginManager;
    private DBEngine dbEngine;

    public UserManager(LoginManager loginManager, DBEngine dbEngine) {
        this.loginManager = loginManager;
        this.dbEngine = dbEngine;
    }

    //itt lesz az admin és  a hívogatás (ellenörzések)

    // tesztre meghívód ezeket a függvénykeet amkiet írsz

    public User getUserInfo(String name) throws NotAuthorizedException {
        User currentuser = this.loginManager.getCurrentUser();
        User selectedUser = dbEngine.selectedUserFromDB(name);
        if (currentuser != null && selectedUser.getID().equals(currentuser.getID())) {
            //user can acces his own data

        } else if (currentuser == null || currentuser.getRole() != Role.ADMIN) {
            throw new NotAuthorizedException();

        }

        return selectedUser;
    }

    public User changeUserInfo(String name) throws NotAuthorizedException {
        User selecetedUser = getUserInfo(name);
        selecetedUser.setEmail("Will@freemail.com");
        selecetedUser.setBirth(LocalDate.of(1991, 01, 01));
        return selecetedUser;
    }


    public List<BlogEntry> modifyBlogEntrys(String name, String blogName) throws NotAuthorizedException {
        List<BlogEntry> entrys = new ArrayList<>();
        User selecetedUser = getUserInfo(name);
        // valszeg a fenti így most nem elsz jó mert nincs kezelve a moderátor és itt már kell

        List<Blog> userBlogs = dbEngine.writerBlogs(selecetedUser.getID());    // ez 1 list blog
        for (int i = 0; i < userBlogs.size(); i++) {
            if (userBlogs.get(i).getTitle().equals(blogName)) {
                entrys = dbEngine.moreEntryInBlog(dbEngine.selectedBlogIDToMoreEntryInBlog(userBlogs.get(i).getTitle()));
            }
        }
/*
        userBlogs.forEach(blog -> {
            if (blog.getTitle().equals(blogName)){
                entrys = dbEngine.moreEntryInBlog(dbEngine.selectedBlogIDToMoreEntryInBlog(blog.getTitle()));
            }
        });*/



        return entrys;
    }


}
