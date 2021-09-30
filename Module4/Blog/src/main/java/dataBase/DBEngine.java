package dataBase;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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
                "useUnicode=yes&characterEncoding=UTF-8&user=" ;

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
public List<User> RegInfos(){
String query = DBHelper.TABLE_REG;

    List<User> users = new ArrayList<>();
    try {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String password = resultSet.getString("password");
            String email = resultSet.getString("email");
            Date birth = resultSet.getDate("birth");

        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    System.out.println(users);
    return users;
}
}




