package database;

import enums.DrunkLvL;
import enums.FootSoldier;
import model.Pirate;
import model.Ship;

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
        String url = "jdbc:mysql://localhost:3306/Pirates?" +
                "useUnicode=yes&characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER")); // username legyen root ez a név
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Pirate findPirateByName(String searchName) {
        String query = "SELECT * FROM "+ DBHelper.TABLE_PIRATE+" WHERE pirate_name = ?";// ha több kérdőjel lenne ?(0. index), ?(1. index), ?,
        Pirate result = null;

        try {
            //Statement statement = connection.createStatement();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, searchName); // a ?-let kicserélni a bemeneti paraméterre (index alapú csere)
            // több kérdőjel esetén  ps.setString(2,searchName), ps.setString(2,searchName)
            ResultSet resultSet = ps.executeQuery();


            while (resultSet.next()) {
                // getXXX("column_name_in_DB")
                String name = resultSet.getString("pirate_name");// ez az adatbázisból való kell hogy legyen
                String drunkLVLFromDB = resultSet.getString("drunkLVL").toUpperCase();
                DrunkLvL drunkLvL = DrunkLvL.valueOf(drunkLVLFromDB);
                Boolean isCanFight = resultSet.getBoolean("canFight");
                String statusFromDB = resultSet.getString("status").toUpperCase();
                FootSoldier footSoldier = FootSoldier.valueOf(statusFromDB);

                result = new Pirate(name, drunkLvL,isCanFight, footSoldier);

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return result;
    }

    public List<Pirate> ListAllPirate() {
        String query = "SELECT * FROM "+ DBHelper.TABLE_PIRATE;

        List<Pirate> pirates = new ArrayList<>();
        Ship ship = new Ship();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // getXXX("column_name_in_DB")
                String name = resultSet.getString("pirate_name");// ez az adatbázisból való kell hogy legyen
                String drunkLVLFromDB = resultSet.getString("drunkLVL").toUpperCase();
                DrunkLvL drunkLvL = DrunkLvL.valueOf(drunkLVLFromDB);
                Boolean isCanFight = resultSet.getBoolean("canFight");
                String statusFromDB = resultSet.getString("status").toUpperCase();
                FootSoldier footSoldier = FootSoldier.valueOf(statusFromDB);

                Pirate pirate = new Pirate(name, drunkLvL,isCanFight, footSoldier);
            //    ship.setCrew(findDragonElements(id));
                System.out.println(pirate);
                pirates.add(pirate);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pirates;
    }


}
