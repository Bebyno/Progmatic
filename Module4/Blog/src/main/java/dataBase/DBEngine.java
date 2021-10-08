package dataBase;

import enums.Role;
import model.*;

import java.sql.*;
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

    public List<User> findUserAsRole(Role role) {
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
// select blog by user
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

//getting entrys from blog
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

// getting comments from entrys

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
}




