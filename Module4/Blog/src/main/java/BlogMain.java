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
            printer.printUsersByRoll(dbEngine.findUserByRole(Role.USER));
            System.out.println();
            System.out.println("Task2:");
            printer.printSelectedUser(dbEngine.selectedUserFromDB("Johan"));
            System.out.println();
            System.out.println("Task3:");
            printer.printedSelectedUserBlogs(dbEngine.writerBlogs(dbEngine.selectedUserID("Will")));
            System.out.println();
            System.out.println("Task4:");
            printer.printedSelectedBlogAllEntry(dbEngine.moreEntryInBlog(dbEngine.selectedBlogID("cats")));
            System.out.println();
            System.out.println("Task5:");
            printer.printedSelectedBlogComments(dbEngine.EntryInBlog(dbEngine.selectedCommentID(1)));

        }
    }


    public static void main(String[] args) throws NotAuthorizedException {
        BlogMain blogMain = new BlogMain();
        blogMain.DBTasks();
//blogMain.dbEngine.isConnected();
        LoginManager loginManager = new LoginManager(blogMain.dbEngine);
        UserManager userManager = new UserManager(loginManager);
       // loginManager.login("Will", "12345");
        loginManager.login("Leader", "Admin");
        userManager.getAllUserInfo();

    }
}
