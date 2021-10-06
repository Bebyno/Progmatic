package workplace;

import dataBase.DBEngine;
import model.Platform;
import model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Blog {
    // usereknek adni 1 boolean pl.: regisztálva, és akkor ha ez true akkor tud irni?

    DBEngine dbEngine = new DBEngine();
 //   List<User> allUser = dbEngine.users();
    Map<User, Platform> userBlog = dbEngine.usersBlogs();
 /*   public void selectedAccessData(Enum access) {


        allUser.forEach(element -> {
                    if (element.getAccess().equals(access)) {           // TODO ACCES a usereknek
                        System.out.println(element.getName());
                        System.out.println(element.getEmail());
                        System.out.println(element.getBirth());
                    }
                }
        );
    }*/

    public void selectedUserAllInfo(String name){
        userBlog.forEach((userName,value) -> {
            if (userName.getName().equals(name)) {
                System.out.println(userName.getID());
                System.out.println(userName.getName());
                System.out.println(userName.getPassword());
                System.out.println(userName.getEmail());
                System.out.println(userName.getBirth());
                System.out.println(userName.getAccess());
            }
        }
    );
}
public void selectedUserAllBlog(String name){
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

}

}
