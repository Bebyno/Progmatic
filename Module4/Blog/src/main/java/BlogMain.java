import dataBase.DBEngine;

public class BlogMain {
    DBEngine dbEngine = new DBEngine();

    public void start() {
        if (dbEngine.isConnected()) {
            dbEngine.RegInfos();
        }
    }


    public static void main(String[] args) {
        BlogMain blogMain = new BlogMain();
        blogMain.start();
    }
}
