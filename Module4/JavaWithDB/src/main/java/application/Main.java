package application;

import application.database.DBEngine;
import application.models.Dragon;
import application.models.Rarity;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DBEngine engine = new DBEngine();

       // System.out.println(System.getenv("DB_USER"));
if(engine.isConnected()){
    List<Dragon> dragons = engine.ListAllDragon();
    System.out.println(dragons);

    Dragon dragon = engine.findDragonByName("Sari");
    System.out.println(dragon);
    System.out.println("AAAAAAAAAAAAAAAAAA");

    Dragon dragon2 = new Dragon("Paff","a bűvős", Rarity.HEROIC);
 //   boolean succes = engine.addDragonToDB(dragon2);
  //  System.out.println(succes);

    for(Dragon dragon1: dragons){
        System.out.println(dragon1);
    }
    System.out.println("BBBBBBBBBBBBBBBBBb");



}
       // System.out.println(engine.isConnected());
    }
}
