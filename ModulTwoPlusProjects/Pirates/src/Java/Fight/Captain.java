package Fight;

import enums.DrunkLvL;

import static enums.FootSoldier.captain;

public class Captain extends Pirate {

    Ship myShip;
    int rumOwned;

    public Captain(String name, DrunkLvL drunkness, boolean canFight, Ship myShip, int rumOwned) {
        super(name, drunkness, canFight, captain);
        this.myShip = myShip;
        this.rumOwned = rumOwned;
    }


    public void giveRumToPirate(Pirate pirate) {
        this.rumOwned -= 1;
        if (pirate.getDrunkness() == DrunkLvL.clearHeaded) {
            pirate.setDrunkness(DrunkLvL.pickled);
        } else if (pirate.getDrunkness() == DrunkLvL.pickled) {
            pirate.setDrunkness(DrunkLvL.drunk);
        } else {
            pirate.setDrunkness(DrunkLvL.drunkAsHell);
        }
    }

    public int getRumOwned() {
        return rumOwned;
    }

    @Override
    public void fight(Pirate pirate) {

        if(pirate.status == captain){
            pirate.strength =+ 5;
        }

        int pirate1Hp;
        int captainHP;

            captainHP = this.health - (pirate.strength - 5 );
            if (captainHP == 0 || captainHP < 0) {
                System.out.println(this.name.toUpperCase() + " IS DEAD!!!");
            } else {
                System.out.println(this.name + " has: " + captainHP + " health left.");
            }

            pirate1Hp = pirate.health - this.strength;

            if (pirate.status == captain && pirate1Hp < 1) {
                System.out.println(pirate.name.toUpperCase() + " IS DEAD!!!");
            } else if (pirate1Hp < 1){
                System.out.println(pirate.name + " is dead");

            }
            else {
                System.out.println(pirate.name + " has : " + pirate1Hp + " health left.");
            }

            this.health = captainHP;
            pirate.health = pirate1Hp;
        }

    public Ship getMyShip() {
        return myShip;
    }
}

