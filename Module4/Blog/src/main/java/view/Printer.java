package view;

import dataBase.DBEngine;
import model.Blog;
import model.BlogEntrys;
import model.Comment;
import model.User;

import java.util.List;

public class Printer {
    // usereknek adni 1 boolean pl.: regisztálva, és akkor ha ez true akkor tud irni?

    DBEngine dbEngine = new DBEngine();


    public void printUsersByRoll(List<User> list) {
        System.out.println("Selected users by roll are: ");
        list.forEach(user -> {
                    System.out.println("ID: " + user.getID());
                    System.out.println("Name: " + user.getName());
                    System.out.println("PW: " + user.getPassword());
                    System.out.println("Email: " + user.getEmail());
                    System.out.println("Birth: " + user.getBirth());
                    System.out.println("roll: " + user.getAccess());
                    System.out.println("____");

                }
        );

    }

    public void printSelectedUser(User user) {
        System.out.println("Seleceted user all infos are: ");
        System.out.println("ID: " + user.getID());
        System.out.println("Name: " + user.getName());
        System.out.println("PW: " + user.getPassword());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Birth: " + user.getBirth());
        System.out.println("roll: " + user.getAccess());

    }

    public void printedSelectedUserBlogs(List<Blog> blogs) {
        System.out.println("Selected user all blogs are: ");
        blogs.forEach(blog -> {

                    System.out.println(blog.getTitle());
                }
        );
    }

    public void printedSelectedBlogAllEntry(List<BlogEntrys> entrys) {
        System.out.println("Selected blog all entrys are: ");
        entrys.forEach(blog -> System.out.println(blog.getText()));

    }

    public void printedSelectedBlogComments(List<Comment> comments) {
        System.out.println("Selected entry all comments are: ");
        comments.forEach(blog -> System.out.println(blog.getCommentText()));

    }

}