package dataBase;

import enums.Role;
import model.*;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class DBEngine {

    private Connection connection;


    public DBEngine() {
        connection = connect();
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connect() {
        String connectionString = "jdbc:mysql://localhost:3306/Blog?" +
                "useUnicode=yes&characterEncoding=UTF-8&user=";

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(connectionString, properties);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<User> findUserByRole(Role role) {
        String query = "SELECT * FROM users WHERE role = ?";
        User result = null;
        List<User> usersByRoll = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, String.valueOf(role));
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer ID = resultSet.getInt("RegID");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                LocalDate birth = resultSet.getDate("birth").toLocalDate();
                String rollFromDB = resultSet.getString("role").toUpperCase();
                Role userrole = Role.valueOf(rollFromDB);


                result = new User(ID, name, password, email, birth, userrole);
                usersByRoll.add(result);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersByRoll;
    }

    public User selectedUserFromDB(String username) {
        String query = "SELECT * FROM users WHERE name = ?";

        User result = null;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer ID = resultSet.getInt("RegID");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                LocalDate birth = resultSet.getDate("birth").toLocalDate();
                String rollFromDB = resultSet.getString("role").toUpperCase();
                Role role = Role.valueOf(rollFromDB);


                result = new User(ID, name, password, email, birth, role);
                //System.out.println(user.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }



    public int selectedUserIDToWritesBlog(String username) {
        String query = "SELECT * FROM users WHERE name = ?";

        User result = null;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer ID = resultSet.getInt("RegID");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                LocalDate birth = resultSet.getDate("birth").toLocalDate();
                String rollFromDB = resultSet.getString("role").toUpperCase();
                Role role = Role.valueOf(rollFromDB);


                result = new User(ID, name, password, email, birth, role);
                //System.out.println(user.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result.getID();
    }

    public List<Blog> writerBlogs(int num) {
        String query = "SELECT * FROM userBlogWrites WHERE BlogWriteID = ?";
        List<Blog> blogs = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setLong(1, num);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {

                Integer blogID = resultSet.getInt("WriteID");
                String text = resultSet.getString("title");
                Integer writerID = resultSet.getInt("BlogWriteID");
            //    String text = resultSet.getString("text");

                Blog blog = new Blog(blogID,text,writerID);
                blogs.add(blog);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }

//blogallentry
    public int selectedBlogIDToMoreEntryInBlog(String blogName) {
        String query = "SELECT * FROM userBlogWrites WHERE title = ?";

        Blog result = null;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, blogName);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer blogID = resultSet.getInt("WriteID");
                String title = resultSet.getString("title");
                Integer writerID = resultSet.getInt("BlogWriteID");

                result = new Blog(blogID,title,writerID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result.getWriterID();
    }

public List<BlogEntry>  moreEntryInBlog(int id){
    String query = "SELECT * FROM moreEntryInTheSameBlog WHERE BlogWriteID = ?";

    List<BlogEntry> blogEntries = new ArrayList<>();

    try {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setLong(1, id);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {

            Integer blogID = resultSet.getInt("entryID");
            String text = resultSet.getString("text");
            Integer writerID = resultSet.getInt("BlogWriteID");

            BlogEntry entrys = new BlogEntry(blogID,text,writerID);
            blogEntries.add(entrys);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return blogEntries;
}

// SSS

    public int selectedCommentIDToEntryInBlog(int id) {
        String query = "SELECT * FROM moreEntryInTheSameBlog WHERE entryID = ?";

        Blog result = null;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer entryID = resultSet.getInt("entryID");
                String text = resultSet.getString("text");
                Integer writerID = resultSet.getInt("BlogWriteID");

                result = new Blog(entryID,text,writerID);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result.getId();
    }

    public List<Comment> EntryInBlog(int id){
        String query = "SELECT * FROM comments WHERE PplcommentID = ?";

        List<Comment> comments = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {

                Integer commentID = resultSet.getInt("CommentID");
                String commentText = resultSet.getString("commentText");
                Integer PplcommentID = resultSet.getInt("PplcommentID");

                Comment entryComment = new Comment(commentID,PplcommentID,commentText);
                comments.add(entryComment);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }

/*

    public List<Blog> BlogsByName(int num) {
        String query = "SELECT * FROM moreEntryInTheSameBlog WHERE BlogWriteID = ?";
        List<Blog> blogs = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setLong(1, num);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {

                Integer blogID = resultSet.getInt("entryID");
                String text = resultSet.getString("text");
                Integer writerID = resultSet.getInt("BlogWriteID");
                //    String text = resultSet.getString("text");

                Blog blog = new Blog(blogID,text,writerID);
                blogs.add(blog);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }
*/



    //logg


    public User login(String username, String pass){
        // átad felhasználónév- jelszó ->ezzel a párossal lekérdez, és visszaad,.

        String query = "SELECT * FROM users WHERE name = ? AND password = ?";

        User result = null;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pass);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer ID = resultSet.getInt("RegID");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                LocalDate birth = resultSet.getDate("birth").toLocalDate();
                String rollFromDB = resultSet.getString("role").toUpperCase();
                Role role = Role.valueOf(rollFromDB);


                result = new User(ID, name, password, email, birth, role);
                //System.out.println(user.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }



/*
    public List<User> usersFromDB() {
        String query = "SELECT * FROM " + DBHelper.TABLE_REG;

        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Integer ID = resultSet.getInt("RegID");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                Date birth = resultSet.getDate("birth");
                String rollFromDB = resultSet.getString("roll").toUpperCase();
                Access access = Access.valueOf(rollFromDB);


                User user = new User(ID, name, password, email, birth, access);
                //System.out.println(user.getName());
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public Map<BlogEntrys, Blog> userBlogs() {

        String query =
                " SELECT userBlogs.*,userBlogWrites.text,userBlogWrites.BlogWriteID" +
                        " FROM userBlogs" +
                        " LEFT JOIN userBlogWrites ON userBlogs.BlogID = userBlogWrites.BlogWriteID;";

        // comments.PplcommentID,comments.commentText
        //" LEFT JOIN comments ON userBlogWrites.WriteID = comments.PplcommentID;";
*//*
    String query =
            "SELECT userBlogs.* FROM userBlogs";
*//*


        Map<BlogEntrys, Blog> userBlogs = new HashMap<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            //userBlog
            Integer bloggerID = resultSet.getInt("BlogID");
            String whosBlog = resultSet.getString("blogName");
            //blogs
            Integer blogID = resultSet.getInt("WriteID");
            Integer writerID = resultSet.getInt("BlogWriteID");
            String text = resultSet.getString("text");

      //      BlogEntrys blogger = new BlogEntrys(bloggerID, whosBlog);
         //   Blog blog = new Blog(blogID, text, writerID);

     //       userBlogs.put(blogger, blog);

*//*
        //comments
        Integer commentID = resultSet.getInt("CommentID");
        Integer PplcommentID = resultSet.getInt("PplcommentID");
        String commentText = resultSet.getString("commentText");*//*


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBlogs;

    }


    public Blog Blog() {
        String query =
                "SELECT userBlogWrites.*, blogSablon.*,comments.text FROM userBlogWrites" +
                        " LEFT JOIN comments ON userBlogWrites.WriteID = comments.PplcommentID;";


        List<Blog> userBlog = new ArrayList<>();


        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                //writedBlog
                Integer blogID = resultSet.getInt("WriteID");
                Integer writerID = resultSet.getInt("BlogWriteID");
                String text = resultSet.getString("text");
                //comments
                Integer commentID = resultSet.getInt("CommentID");
                Integer PplcommentID = resultSet.getInt("PplcommentID");
                String commentText = resultSet.getString("commentText");


                //  System.out.println(sablon.getColor());
                // userBlog.add(sablon);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // return userBlog;
        return null;
    }

    public Sablon blogSablon() {
        String query = "SELECT * FROM blogSablon";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            Integer ID = resultSet.getInt("SablonID");
            String name = resultSet.getString("blogSablonName");
            String category = resultSet.getString("category");
            String ColorFromDB = resultSet.getString("color").toUpperCase();
            Color color = Color.valueOf(ColorFromDB);

            Sablon sablon = new Sablon(ID, name, category, color);
            return sablon;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<User> usersBlogs() {
        String query = "SELECT users.*, userBlogs.blogName, blogSablon.*,userBlogWrites.* FROM users" +
                " LEFT JOIN userBlogs ON users.RegID = userBlogs.BlogID" +
                " LEFT JOIN blogSablon ON userBlogs.BlogID = blogSablon.whosBlogId" +
                " LEFT JOIN userBlogWrites ON userBlogs.BlogID = userBlogWrites.WriteID" +
                " LEFT JOIN comments ON userBlogWrites.WriteID = comments.PplcommentID;";

        //vegyük ki azt a részt ami a névBlogja

        //Map<User, Blog> userBlog = new HashMap<>();
        List<User> allUser = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // user
                Integer ID = resultSet.getInt("RegID");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                Date birth = resultSet.getDate("birth");
                String rollFromDB = resultSet.getString("roll").toUpperCase();
                Access access = Access.valueOf(rollFromDB);
                //user'sBlogname

                String blogName = resultSet.getString(("blogName"));

                //blogSablon
                Integer sablonID = resultSet.getInt("SablonID");
                String blogSablonName = resultSet.getString("blogSablonName");
                String category = resultSet.getString("category");
                String colorFromDB = resultSet.getString("color").toUpperCase();
                Color color = Color.valueOf(colorFromDB);
                Integer whosBlogId = resultSet.getInt("whosBlogId");


                // filling in
                User user = new User(ID, name, password, email, birth, access);
                Blog blog = new Blog(blogName);

                //  Sablon sablon = new Sablon(sablonID, blogSablonName, category, color, whosBlogId);
                // a value legyen egy List<Blog>, és így kezeljük a több bloguságot (?)

                //  userBlog.put(user, blog);
                allUser.add(user);
            }
            // Nem jó ötlet a MAP by Viktor.

            // 1 map -> user neve és az adatkok, - adadt: blog/platform -> 2. map : platform neve a key és a value a többi adat
            //TODO szedjük ketté a USER-t a BLOG-tól!

        } catch (SQLException e) {
            e.printStackTrace();
        }
        *//*userBlog.forEach((user,platform)->
                {
                    System.out.println(user.getName());
                    System.out.println(platform.getCategory());
                }
                );*//*
        return allUser;
    }*/


}




