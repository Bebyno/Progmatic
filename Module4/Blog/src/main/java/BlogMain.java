import dataBase.DBEngine;
import enums.Access;
import view.Printer;

public class BlogMain {
    DBEngine dbEngine = new DBEngine();
    Printer printer = new Printer();

    public void start() {
        if (dbEngine.isConnected()) {
            System.out.println("Task1:");
            printer.printUsersByRoll(dbEngine.findUserByRoll(Access.USER));
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


    public static void main(String[] args) {
        BlogMain blogMain = new BlogMain();
        blogMain.start();

    }
}
