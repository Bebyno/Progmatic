import database.DBEngine;
import fight.Battlefield;
import model.Pirate;

public class PirateMain {
    Battlefield battlefield = new Battlefield();
    DBEngine dbEngine = new DBEngine();


    public void start() {
        // battlefield.bigBattle();

        if (dbEngine.isConnected()) {
        /*    Pirate pirate = dbEngine.findPirateByName("Jim");
            System.out.println(pirate.getName() + " " + pirate.getDrunkness() + " " + pirate.isCanFight());*/

            dbEngine.ListAllShip(dbEngine.ListAllPirate());

        }
    }

    public static void main(String[] args) {
        PirateMain main = new PirateMain();

        main.start();

    }
}
