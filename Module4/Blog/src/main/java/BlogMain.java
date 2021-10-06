import dataBase.DBEngine;
import workplace.Blog;

public class BlogMain {
    DBEngine dbEngine = new DBEngine();
    Blog blog = new Blog();

    public void start() {
        if (dbEngine.isConnected()) {
         //   dbEngine.users();
            dbEngine.BlogSablon();
            dbEngine.usersBlogs();
            blog.selectedUserAllInfo("Will");
            System.out.println("aaaa");
            blog.selectedUserAllBlog("Will");
        }
    }


    public static void main(String[] args) {
        BlogMain blogMain = new BlogMain();
        blogMain.start();

    }
}
