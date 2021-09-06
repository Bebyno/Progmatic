package Fight;

import enums.ShipState;

import java.util.List;
import java.util.Random;

public class Ship {
    String name;
    int health;
    int attackPower;
    ShipState state;
    List<Pirate> crew;

    public Ship() {
    }

    public Ship(String name, ShipState state, List<Pirate> crew) {
        this.name = name;
        this.state = state;
        this.crew = crew;
        healthSetUp();
    }



    public void shipsRandomization() {
        Random random = new Random();
        int throwDice = random.nextInt(3) + 1;

        //  System.out.println(throwDice);
        if (throwDice == 3) {
            this.state = ShipState.goodCondition;
        } else if (throwDice == 2) {
            this.state = ShipState.shattered;
        } else {
            this.state = ShipState.almostWrecked;
        }
        //  System.out.println(this.state);
        healthSetUp();
    }

    public void healthSetUp() {
        if (state == ShipState.goodCondition) {
            health = 30;
            attackPower = 30;
        } else if (state == ShipState.shattered) {
            health = 15;
            attackPower = 15;
        } else {
            health = 0;
            attackPower = 0;
        }
    }

    public boolean shipBattle(Ship ship) {
        if (this.state == ship.state) {
            System.out.println("Both ships are immobile, there will be no more fight today.");
            return false;
        } else {
            attack(ship);
            return true;
        }
    }

    public void attack(Ship enemy) {
        int ship1Hp;
        int ship2Hp;

        ship1Hp = this.health - enemy.attackPower;

        if (ship1Hp < 1) {
            this.setState(ShipState.almostWrecked);
        } else {
            System.out.println(this.name + " has won this fight. Now " + this.name + "'s crew can" +
                    " attack the "+ enemy.getName()+"'s. ");
        }

        ship2Hp = enemy.health - this.attackPower;

        if (ship2Hp < 1) {
            enemy.setState(ShipState.almostWrecked);
        } else {
            System.out.println(enemy.name + " has won this fight. Now " +enemy.name +"'s crew can" +
                    " attack the "+ this.name+"'s." );
        }
        this.health = ship1Hp;
        enemy.health = ship2Hp;
    }

    public void buffingSoldier(Ship ship) {

        if (this.state != ShipState.almostWrecked) {
            for (int i = 0; i < this.crew.size(); i++)
                if (this.crew.get(i) instanceof Captain) {
                    this.crew.get(i).addHealth(5);
                    this.crew.get(i).addStrength(5);
                }
        } else {
            for (int i = 0; i < ship.crew.size(); i++)
                if (ship.crew.get(i) instanceof Captain) {
                    ship.crew.get(i).addHealth(5);
                    ship.crew.get(i).addStrength(5);
                }
        }
    }

    public List<Pirate> getCrew() {
        return crew;
    }

    public void setState(ShipState state) {
        this.state = state;
    }

    public ShipState getState() {
        return state;
    }

    public String getName() {
        return name;
    }
}
