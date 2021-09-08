package model;

import enums.DrunkLvL;
import enums.FootSoldier;

import static enums.FootSoldier.CAPTAIN;

public class Pirate {

    String name;
    int health;
    int strength;
    DrunkLvL drunkness;
    boolean canFight;
    FootSoldier status;


    public Pirate(String name, DrunkLvL drunkness, boolean canFight, FootSoldier status) {
        this.name = name;
        this.drunkness = drunkness;
        this.canFight = canFight;
        this.status = status;
        status();
        drunkLVL();
    }


    public void status() {
        if (status == FootSoldier.WEAK) {
            health += 50;
            strength += 10;
        } else if (status == FootSoldier.NORMAL) {
            health += 90;
            strength += 40;
        } else if ((status == FootSoldier.STRONG)) {
            health += 100;
            strength += 50;
        } else {
            health += 110;
            strength += 60;
        }
    }

    public void drunkLVL() {

        if (drunkness == DrunkLvL.PICKLED) {
            strength += 5;
        } else if (drunkness == DrunkLvL.DRUNK) {
            strength += 3;
        } else if (drunkness == DrunkLvL.DRUNKASHELL) {
            strength -= 5;
            health -= 5;
        }
    }

    public void fight(Pirate pirate) {
        int pirate1Hp;
        int pirate2Hp;

        if (pirate.status != CAPTAIN) {
            addStrength(5);
        }
        pirate1Hp = this.health - pirate.strength;

        if (pirate1Hp < 1) {
            System.out.println(this.name + " is dead");
        } else {
            System.out.println(this.name + " has: " + pirate1Hp + " health left.");
        }

        pirate2Hp = (pirate.health - (this.strength - 5));

        if (pirate.status == CAPTAIN && pirate2Hp < 1) {
            System.out.println(pirate.name.toUpperCase() + " IS DEAD!!!");
        } else if (pirate2Hp < 1) {
            System.out.println(pirate.name + " is dead");
        } else {
            System.out.println(pirate.name + " has : " + pirate2Hp + " health left.");
        }
        this.health = pirate1Hp;
        pirate.health = pirate2Hp;

    }

    public String getName() {
        return name;
    }

    public DrunkLvL getDrunkness() {
        return drunkness;
    }

    public void setDrunkness(DrunkLvL drunkness) {
        this.drunkness = drunkness;
    }

    public int getHealth() {
        return health;
    }

    public void addHealth(int health) {
        this.health += health;
    }

    public int getStrength() {
        return strength;
    }

    public void addStrength(int strength) {
        this.strength += strength;
    }

    public boolean isCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    @Override
    public String toString() {
        return
                name + "," +
                        drunkness + "," +
                        canFight +
                        status;
    }


}
