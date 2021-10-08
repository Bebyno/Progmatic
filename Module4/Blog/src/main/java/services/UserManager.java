package services;

import Exceptions.NotAuthorizedException;
import dataBase.DBEngine;
import enums.Role;
import model.Blog;
import model.BlogEntry;
import model.Comment;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private LoginManager loginManager;
    private DBEngine dbEngine;

    public UserManager(LoginManager loginManager, DBEngine dbEngine) {
        this.loginManager = loginManager;
        this.dbEngine = dbEngine;
    }

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

    public List<BlogEntry> helperToEntrys(String name, String blogName, int entryID) throws NotAuthorizedException {
        List<BlogEntry> entrys = new ArrayList<>();

        User currentuser = this.loginManager.getCurrentUser();
        User selectedUser = dbEngine.selectedUserFromDB(name);
        if (currentuser != null && selectedUser.getID().equals(currentuser.getID())) {

        } else if (currentuser == null || !(currentuser.getRole() == Role.ADMIN || currentuser.getRole() == Role.MODERATOR)) {
            throw new NotAuthorizedException();
        }
        List<Blog> userBlogs = dbEngine.writerBlogs(selectedUser.getID());
        for (int i = 0; i < userBlogs.size(); i++) {
            if (userBlogs.get(i).getTitle().equals(blogName)) {
                entrys = dbEngine.moreEntryInBlog(dbEngine.selectedBlogIDToMoreEntryInBlog(userBlogs.get(i).getTitle()));
            }
        }
        return entrys;
    }

    public BlogEntry modifyBlogEntrys(String name, String blogName, int entryID, String entrysText) throws NotAuthorizedException {
        List<BlogEntry> entrys = helperToEntrys(name, blogName, entryID);

        BlogEntry currentEntry = null;
        for (int i = 0; i < entrys.size(); i++) {
            if (entrys.get(i).getEntryID().equals(entryID)) {
                entrys.get(i).setText(entrysText);
                currentEntry = entrys.get(i);
            }

        }
        return currentEntry;
    }

    public List<BlogEntry> deleteBlogEntrys(String name, String blogName, int entryID) throws NotAuthorizedException {
        List<BlogEntry> entrys = helperToEntrys(name, blogName, entryID);
        List<BlogEntry> deleteEntry = new ArrayList<>();

        for (int i = 0; i < entrys.size(); i++) {
            if (entrys.get(i).getEntryID().equals(entryID)) {
                deleteEntry.add(entrys.get(i));
            }
        }
        entrys.removeAll(deleteEntry);
        return entrys;
    }

    public List<Comment> commentWrite(int selectedBlog, String commentText) throws NotAuthorizedException {
        User currentuser = this.loginManager.getCurrentUser();

        if(currentuser.isRegistered()){
          List<Comment> comments =  dbEngine.EntryInBlog(dbEngine.selectedCommentIDToEntryInBlog(selectedBlog));
           Comment newComment = new Comment(commentText);
           comments.add(newComment);
           return comments;
       }
        throw new NotAuthorizedException();
    }
}
