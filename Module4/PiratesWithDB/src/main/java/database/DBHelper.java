package database;

public class DBHelper {
    public static final String TABLE_PIRATE = "pirate";
    public static final String TABLE_SHIP = "ship";
    public static final String TABLE_CAPTAIN = "captain";

    public static final String PATH = "SELECT " + DBHelper.TABLE_PIRATE + ".*," +DBHelper.TABLE_CAPTAIN+ "." +
            "pirate_id AS is_captain,"+"" +DBHelper.TABLE_CAPTAIN+ ".rumOwned," +DBHelper.TABLE_CAPTAIN+ ".ship_id," +
            "" +DBHelper.TABLE_SHIP+ ".ship_name FROM " + DBHelper.TABLE_PIRATE + " LEFT JOIN " +
            "" +DBHelper.TABLE_CAPTAIN+ " ON " + DBHelper.TABLE_PIRATE + ".pirate_id = " +DBHelper.TABLE_CAPTAIN+ "." +
            "pirate_id LEFT JOIN " +DBHelper.TABLE_SHIP+ " ON " +DBHelper.TABLE_CAPTAIN+ ".ship_id = " +
            "" +DBHelper.TABLE_SHIP+ ".ship_id;";

     /*

        "SELECT " + DBHelper.TABLE_PIRATE + ".*," +DBHelper.TABLE_CAPTAIN+ ".pirate_id AS is_captain," +
                "" +DBHelper.TABLE_CAPTAIN+ ".rumOwned," +DBHelper.TABLE_CAPTAIN+ ".ship_id FROM" +
                " " + DBHelper.TABLE_PIRATE + " LEFT JOIN " +
                "" +DBHelper.TABLE_CAPTAIN+ " ON " + DBHelper.TABLE_PIRATE + ".pirate_id = " +
                "" +DBHelper.TABLE_CAPTAIN+ ".pirate_id;";

        * */
}
