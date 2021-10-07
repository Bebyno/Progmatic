import dataBase.DBEngine;
import view.Printer;

public class BlogMain {
    DBEngine dbEngine = new DBEngine();
    Printer printer = new Printer();

    public void start() {
        if (dbEngine.isConnected()) {
         //   dbEngine.users();
         /*   dbEngine.Blog();
            dbEngine.usersBlogs();*/

          //  printer.printUsersByRoll(dbEngine.findUserByRoll(Access.USER));
           // printer.printSelectedUser(dbEngine.selectedUserFromDB("Johan"));
            //printer.printedSelectedUserBlogs(dbEngine.blog(dbEngine.selectedUserID("Will")));





           /* blog.selectedUserAllInfo("Will");
            System.out.println("_____");
          //  blog.selectedUserAllBlog("Will");
            blog.selectedAccessData(Access.USER);
            //blog.userBlogs()*/
        }
    }


    public static void main(String[] args) {
        BlogMain blogMain = new BlogMain();
        blogMain.start();

    }
}
