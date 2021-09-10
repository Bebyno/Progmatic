package database;

import enums.DrunkLvL;
import enums.FootSoldier;
import enums.ShipState;
import model.Captain;
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
        String connectionString = "jdbc:mysql://localhost:3306/Pirates?" +
                "useUnicode=yes&characterEncoding=UTF-8&user="+System.getenv("DB_USER");

        Properties properties = new Properties();
       // properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(connectionString, properties);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Pirate findPirateByName(String searchName) {
        String query = "SELECT * FROM " + DBHelper.TABLE_PIRATE + " WHERE pirate_name = ?";
        Pirate result = null;

        try {
            PreparedStatement ps = connection.prepareStatement(query);  // ez mindig prepared legyen a trollok miatt.
            ps.setString(1, searchName);        //legalábbis akkor ha USERtől származó paraméter van benne.(input)
            ResultSet resultSet = ps.executeQuery();


            while (resultSet.next()) {
                String name = resultSet.getString("pirate_name");
                String drunkLVLFromDB = resultSet.getString("drunkLVL").toUpperCase();
                DrunkLvL drunkLvL = DrunkLvL.valueOf(drunkLVLFromDB);
                Boolean isCanFight = resultSet.getBoolean("canFight");
                String statusFromDB = resultSet.getString("status").toUpperCase();
                FootSoldier footSoldier = FootSoldier.valueOf(statusFromDB);

                result = new Pirate(name, drunkLvL, isCanFight, footSoldier);

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return result;
    }
/*
    public List<Ship> listAllShip(){
        String query = "SELECT * FROM " + DBHelper.TABLE_SHIP;
List<Ship> ships = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("ship_name");
                String shipStateFromDB = resultSet.getString("state").toUpperCase();
                ShipState shipState = ShipState.valueOf(shipStateFromDB);


                Ship ship = new Ship(name,shipState,null);
                System.out.println(ship);
                ships.add(ship);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }*/


    public List<Pirate> ListAllPirate(Ship ship) {
        String query = DBHelper.PATH;

        List<Pirate> pirates = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("pirate_name");
                String drunkLVLFromDB = resultSet.getString("drunkLVL").toUpperCase();
                DrunkLvL drunkLvL = DrunkLvL.valueOf(drunkLVLFromDB);
                Boolean isCanFight = resultSet.getBoolean("canFight");
                String statusFromDB = resultSet.getString("status").toUpperCase();
                FootSoldier footSoldier = FootSoldier.valueOf(statusFromDB);


                if(resultSet.getObject("is_captain")==null){  // table/class mappelés.
                    Pirate pirate = new Pirate(name, drunkLvL, isCanFight, footSoldier);
                 //   System.out.println(pirate);
                    pirates.add(pirate);
                }else{
                    int rumOwned = resultSet.getInt("rumOwned");
                    int shipID = resultSet.getInt("ship_id");
                    Captain captain = new Captain(name,drunkLvL,isCanFight,ship,rumOwned);

                    // ID megadjuk és a kap. hajóját késöbb be set-telem.

                    //  System.out.println(captain);
                    pirates.add(captain);


                   // resultSet.getObject(String.valueOf(DBHelper.TABLE_CAPTAIN +".ship_id" == DBHelper.TABLE_SHIP +".ship_id"));

                    /*String shipName = resultSet.getString("ship_name");
                    String shipState = resultSet.getString("state").toUpperCase();
                    ShipState state = ShipState.valueOf(shipState);
                    Ship ship = new Ship(shipName,state,null);*/


                }
                // if status nem 4 , akkor pirate jön létre ha 4 akkor captain
                // P p = p ha nem 4 és C c = C ha 4 tehát IF-ben hozod létre a példányokat a kikötésnek megfelelően

           /*     Pirate pirate = new Pirate(name, drunkLvL, isCanFight, footSoldier);
                System.out.println(pirate);
                pirates.add(pirate);*/

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pirates;
    }

    /*public List<Ship> ListAllShipBad() {
        String query = "SELECT * FROM " + DBHelper.TABLE_SHIP;
        List<Ship> shipsList = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                String name = resultSet.getString("ship_name");
                String shipState = resultSet.getString("state").toUpperCase();
                ShipState state = ShipState.valueOf(shipState);


                Ship ship = new Ship(name, state, ListAllPirate());
                System.out.println(ship);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return shipsList;
    }
*/


    public Ship ShipFromDB() {
        String query = "SELECT * FROM " + DBHelper.TABLE_SHIP;
       // List<Ship> shipsList = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                String name = resultSet.getString("ship_name");
                String shipState = resultSet.getString("state").toUpperCase();
                ShipState state = ShipState.valueOf(shipState);


                Ship ship = new Ship(name, state, null);

                ship.setCrew(ListAllPirate(ship));

                System.out.println(ship);

                return ship;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }









    public Captain captain(Ship ship) {
        String query = "SELECT * FROM " + DBHelper.TABLE_CAPTAIN;
      //  List<Pirate> crew = ListAllPirate();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("ship_name");
                int rumInNumber = resultSet.getInt("rumOwned");

        //        Captain captain = new Captain("asd")

       //         Ship myShip = new Ship(name,ShipState.SHATTERED,crew);


              //  Captain captain = new Captain();
                System.out.println();

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }
}
