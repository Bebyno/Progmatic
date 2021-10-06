package dataBase;

import enums.Color;
import model.Platform;
import model.Sablon;
import model.User;

import java.sql.*;
import java.sql.Date;
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

   /* public List<User> users() {
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


                User user = new User(ID, name, password, email, birth);
                //System.out.println(user.getName());
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;}*/


    public List<Platform> BlogSablon() {
        String query = "SELECT * FROM " + DBHelper.TABLE_BLOG;
        List<Platform> plaforms = new ArrayList<>();


        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Integer ID = resultSet.getInt("SablonID");
                String name = resultSet.getString("blogSablonName");
                String category = resultSet.getString("category");

                String ColorFromDB = resultSet.getString("color").toUpperCase();
                Color color = Color.valueOf(ColorFromDB);


                Platform sablon = new Platform(ID, name, category, color);
                //  System.out.println(sablon.getColor());
                plaforms.add(sablon);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return plaforms;
    }

    public Map<User, Platform> usersBlogs() {
        String query = "SELECT registration.*, userBlogs.blogName, blogSablon.*,userBlogWrites.* FROM registration" +
                " LEFT JOIN userBlogs ON registration.RegID = userBlogs.BlogID" +
                " LEFT JOIN blogSablon ON userBlogs.BlogID = blogSablon.whosBlogId" +
                " LEFT JOIN userBlogWrites ON userBlogs.BlogID = userBlogWrites.WriteID" +
                " LEFT JOIN comments ON userBlogWrites.WriteID = comments.PplcommentID;";


        Map<User, Platform> userBlog = new HashMap<>();
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
                User user = new User(ID, name, password, email, birth);
                Platform platform = new Platform(blogName);
                Sablon sablon = new Sablon(sablonID, blogSablonName, category, color, whosBlogId);
                userBlog.put(user, platform);
            }
            // 1 map -> user neve és az adatkok, - adadt: blog/platform -> 2. map : platform neve a key és a value a többi adat
            //TODO legyen a platform is egy mao

        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*userBlog.forEach((user,platform)->
                {
                    System.out.println(user.getName());
                    System.out.println(platform.getCategory());
                }
                );*/
        return userBlog;
    }


}




