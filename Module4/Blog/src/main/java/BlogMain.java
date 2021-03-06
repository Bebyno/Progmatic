import Exceptions.NotAuthorizedException;
import dataBase.DBEngine;
import enums.Role;
import services.LoginManager;
import services.UserManager;
import view.Printer;

public class BlogMain {
    DBEngine dbEngine = new DBEngine();
    Printer printer = new Printer();

    public void DBTasks() {
        if (dbEngine.isConnected()) {
            System.out.println("Task1:");
            printer.printUsersAsRole(dbEngine.findUserAsRole(Role.USER));
            System.out.println();
            System.out.println("Task2:");
            printer.printSelectedUser(dbEngine.selectedUserFromDB("Johan"));
            System.out.println();
            System.out.println("Task3:");
            printer.printedSelectedUserBlogs(dbEngine.writerBlogs(dbEngine.selectedUserIDToWritesBlog("Will")));
            System.out.println();
            System.out.println("Task4:");
            printer.printedSelectedBlogAllEntry(dbEngine.moreEntryInBlog(dbEngine.selectedBlogIDToMoreEntryInBlog("cats")));
            System.out.println();
            System.out.println("Task5:");
            printer.printedSelectedBlogComments(dbEngine.EntryInBlog(dbEngine.selectedCommentIDToEntryInBlog(1)));

        }
    }

    public static void main(String[] args) throws NotAuthorizedException {
        BlogMain blogMain = new BlogMain();
        Printer printer = new Printer();
        blogMain.DBTasks();

        //!bug  run-> edit config -> mindig kiszedi a hozzáférést!

        LoginManager loginManager = new LoginManager(blogMain.dbEngine);
        UserManager userManager = new UserManager(loginManager, blogMain.dbEngine);
       // loginManager.login("Will", "12345");
       // loginManager.login("Johan", "admin");
        loginManager.login("Leader", "Admin");
       // loginManager.login("Boldizsar", "asdasd");
      //  printer.printSelectedUser(userManager.getUserInfo("Will"));
     //   printer.printSelectedUser(userManager.changeUserInfo("Will"));
    //printer.printedSelectedBlogComments(userManager.commentWrite(1,"Boring blog, delete pls"));

    }
}
