package view;

import dataBase.DBEngine;
import model.Blog;
import model.Blogger;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    // usereknek adni 1 boolean pl.: regisztálva, és akkor ha ez true akkor tud irni?

    DBEngine dbEngine = new DBEngine();
    List<User> users = dbEngine.usersFromDB();
    List<User> allUser = dbEngine.usersBlogs();
    //Map<User, model.Blog> userBlog = dbEngine.usersBlogs();


public void printUsersByRoll(List<User> list){
    list.forEach(user -> {
                    System.out.println("ID: "+user.getID());
                    System.out.println("Name: "+user.getName());
                    System.out.println("PW: "+user.getPassword());
                    System.out.println("Email: "+user.getEmail());
                    System.out.println("Birth: "+user.getBirth());
                    System.out.println("roll: "+user.getAccess());
                    System.out.println("__");

            }
    );

}
public void printSelectedUser(User user){

        System.out.println("ID: "+user.getID());
        System.out.println("Name: "+user.getName());
        System.out.println("PW: "+user.getPassword());
        System.out.println("Email: "+user.getEmail());
        System.out.println("Birth: "+user.getBirth());
        System.out.println("roll: "+user.getAccess());
        System.out.println("__");

}
public void printedSelectedUserBlogs(List<Blog> blogs){
    System.out.println("Blogs are: ");
    blogs.forEach(blog -> {

        System.out.println(blog.getWriterText());
    }
    );
}









    public void selectedAccessData(Enum access) {


        users.forEach(user -> {
                    if (user.getAccess().equals(access)) {
                        System.out.println(user.getID());
                        System.out.println(user.getName());
                        System.out.println(user.getPassword());
                        System.out.println(user.getEmail());
                        System.out.println(user.getBirth());
                        System.out.println(user.getAccess());
                    }
                }
        );
    }

    public void selectedUserAllInfo(String name){
        users.forEach((user) -> {
            if (user.getName().equals(name)) {
                System.out.println(user.getID());
                System.out.println(user.getName());
                System.out.println(user.getPassword());
                System.out.println(user.getEmail());
                System.out.println(user.getBirth());
                System.out.println(user.getAccess());
            }
        }
    );
}
public void selectedBloggerBlogs(String name){

}

/*public void selectedUserAllBlog(String name){
    userBlog.forEach((writerName,blog) -> {
                if (writerName.getName().equals(name)) {
                    System.out.println(blog.getCategory());
                }
            }
    );

}
public void selectedBlodAllComment(String blogName){
    userBlog.forEach((userblog,blog) -> {
                if (blog.getCategory().equals(blogName)) {
                    System.out.println(blog.getCategory());
                }
            }
    );

}*/

}
