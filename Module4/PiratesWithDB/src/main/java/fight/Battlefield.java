package fight;

import enums.DrunkLvL;
import enums.FootSoldier;
import enums.ShipState;
import model.Captain;
import model.Pirate;
import model.Ship;

import java.util.*;


public class Battlefield {

    List<Pirate> Ateam = new ArrayList<>();
    List<Pirate> Bteam = new ArrayList<>();

    List<Captain> captainList = new ArrayList<>();
    List<Pirate> allPirate = new ArrayList<>();

    Ship shipTeamA = new Ship("Black Pearl", ShipState.SHATTERED, Ateam);
    Ship shipTeamB = new Ship("White Pearl", ShipState.GOODCONDITION, Bteam);

    public void fillingTheCrews() {

        Pirate james = new Pirate("James", DrunkLvL.PICKLED, true, FootSoldier.WEAK);
        Pirate joe = new Pirate("Joe", DrunkLvL.DRUNK, true, FootSoldier.STRONG);
        Pirate joly = new Pirate("Joly", DrunkLvL.CLEARHEADED, true, FootSoldier.NORMAL);
        Pirate Bill = new Pirate("Bill", DrunkLvL.CLEARHEADED, true, FootSoldier.NORMAL);
        Pirate jack = new Pirate("Jack", DrunkLvL.DRUNKASHELL, true, FootSoldier.WEAK);
        Pirate will = new Pirate("Will", DrunkLvL.DRUNK, true, FootSoldier.STRONG);
        Captain blackBeard = new Captain("BlackBeard", DrunkLvL.CLEARHEADED, true, shipTeamA, 3);
        Ateam.add(james);
        Ateam.add(joe);
        Ateam.add(joly);
        Ateam.add(Bill);
        Ateam.add(jack);
        Ateam.add(will);
        Ateam.add(blackBeard);

        Pirate bob = new Pirate("Bob", DrunkLvL.PICKLED, true, FootSoldier.WEAK);
        Pirate zoro = new Pirate("Zoro", DrunkLvL.DRUNK, true, FootSoldier.STRONG);
        Pirate brad = new Pirate("Brad", DrunkLvL.CLEARHEADED, true, FootSoldier.NORMAL);
        Pirate aladin = new Pirate("Aladin", DrunkLvL.DRUNKASHELL, true, FootSoldier.WEAK);
        Pirate lajos = new Pirate("Lajcsi", DrunkLvL.CLEARHEADED, true, FootSoldier.NORMAL);
        Pirate wilmos = new Pirate("Wilmos", DrunkLvL.DRUNK, true, FootSoldier.STRONG);
        Captain ironBeard = new Captain("IronBeard", DrunkLvL.CLEARHEADED, true, shipTeamB, 3);
        Bteam.add(bob);
        Bteam.add(zoro);
        Bteam.add(brad);
        Bteam.add(aladin);
        Bteam.add(lajos);
        Bteam.add(wilmos);
        Bteam.add(ironBeard);
    }
    public int max() {
        int max = 0;
        if (Ateam.size() > Bteam.size()) {
            max = Ateam.size();
        }
        max = Bteam.size();
        return max;
    }

    public int allList() {
        for (int i = 0; i < max(); i++) {
            allPirate.add(Ateam.get(i));
            allPirate.add(Bteam.get(i));
        }
        return allPirate.size();
    }

    public List<Captain> captainList(int number) {

        for (int i = 0; i < number; i++) {
            if (allPirate.get(i) instanceof Captain) {
                captainList.add((Captain) allPirate.get(i));
            }
        }
        return captainList;
    }

    public void dropRumToPirates(List<Captain> list) {
        Random random = new Random();

        try {
            System.out.println("\nBefore the big battle start the captains give rum to his pirates.");
            for (Captain captain : list) {
                System.out.println("\n" + captain.getName() + " has " + captain.getRumOwned() + " bottle of Rum to drop.");
                Thread.sleep(2000);

                for (Pirate pirate : captain.getMyShip().getCrew()) {
                    if (captain.getRumOwned() > 0 && pirate != captain) {
                        int pirateThrow = random.nextInt(6) + 1;
                        int captainThrow = random.nextInt(6) + 1;

                        if (pirateThrow == captainThrow) {
                            System.out.println(pirate.getName() + "'s state: " + pirate.getDrunkness() + "," +
                                    " " + pirate.getStrength() + " attack power");

                            captain.giveRumToPirate(pirate);
                            pirate.drunkLVL();

                            System.out.println(captain.getName() + " has decided to give rum to " + pirate.getName() +
                                    ". Now the captain has " + captain.getRumOwned() + " bottle of Rum left.");
                            System.out.println(pirate.getName() + "'s state: " + pirate.getDrunkness() + "," +
                                    " " + pirate.getStrength() + " attack power");
                        }

                    } else if (captain.getRumOwned() == 0) {
                        System.out.println("No more rum.");
                        break;
                    }

                }
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public void randomization() {
        Collections.shuffle(Ateam);
        Collections.shuffle(Bteam);
    }

    public void isCanFight() {
        for (Pirate pirate : Ateam) {
            if (pirate.getStrength() < 1) {
                pirate.setCanFight(false);
            }
        }
        for (Pirate pirate : Bteam) {
            if (pirate.getStrength() < 1) {
                pirate.setCanFight(false);
            }
        }
    }

    public void fightablePirateHandling() {
        List<Pirate> deadATeam = new ArrayList<>();
        List<Pirate> deadBTeam = new ArrayList<>();

        for (Pirate pirate : Ateam) {
            if (pirate.getHealth() < 1 || !pirate.isCanFight()) {
                deadATeam.add(pirate);
            }
        }
        for (Pirate pirate : Bteam) {
            if (pirate.getHealth() < 1 || !pirate.isCanFight()) {
                deadBTeam.add(pirate);
            }
        }
        Ateam.removeAll(deadATeam);
        Bteam.removeAll(deadBTeam);
    }

    public boolean navalBattle() {
        System.out.println("Let the battle begin.");
        System.out.println("Today " + shipTeamA.getName() + " will fight against " + shipTeamB.getName() + ".");
        System.out.println("Fight result: ");
        shipTeamA.shipsRandomization();
        shipTeamB.shipsRandomization();
       /* System.out.println(shipTeamA.getName() +" has "+shipTeamA.getHealth()+" HP");
        System.out.println(shipTeamB.getName() +" has "+shipTeamB.getHealth()+" HP");*/
        return shipTeamA.shipBattle(shipTeamB);
    }

    public void printCrewMembers(){
        System.out.println("1.team: ");
        for (int i = 0; i < Ateam.size(); i++) {
            System.out.print(Ateam.get(i).getName() + ", ");
        }
        if (Ateam.size() == 0) {
            System.out.println("No one left.");
        }
        System.out.println();
        System.out.println("2.team: ");
        for (int i = 0; i < Bteam.size(); i++) {
            System.out.print(Bteam.get(i).getName() + ", ");
        }
        if (Bteam.size() == 0) {
            System.out.println("No one left.");
        }
    }

    public void FootSoldierFight(boolean naval) {
        if (naval) {
            boolean isATeamCaptainLive = true;
            boolean isBTeamCaptainLive = true;
            int round = 1;
            fillingTheCrews();
            shipTeamA.buffingSoldier(shipTeamB);
            dropRumToPirates(captainList(allList()));
            isCanFight();
            fightablePirateHandling();

            System.out.println("\nThe two crew members are: ");
            printCrewMembers();
            System.out.println("\n\nLet the pirates fight begin. ");
            do {
                randomization();
                try {
                    System.out.println("Round: " + round++);
                    System.out.println();
                    Thread.sleep(2000);

                    for (int i = 0; i < max(); i++) {

                        System.out.print("\n" + Ateam.get(i).getName() + "(" + Ateam.get(i).getHealth() + "HP" +
                                "," + Ateam.get(i).getStrength() + "STR" + ")" + " vs " + Bteam.get(i).getName() + "(" +
                                "" + Bteam.get(i).getHealth() + "HP," + Bteam.get(i).getStrength() + "STR" + ")" + "\n");

                        Ateam.get(i).fight(Bteam.get(i));

                        if (Ateam.get(i) instanceof Captain) {
                            if (Ateam.get(i).getHealth() < 1) {
                                isATeamCaptainLive = false;
                            }
                        }
                        if (Bteam.get(i) instanceof Captain) {
                            if (Bteam.get(i).getHealth() < 1) {
                                isBTeamCaptainLive = false;
                            }
                        }
                    }
                    if (!isATeamCaptainLive && !isBTeamCaptainLive) {
                        System.out.println();
                        System.out.println("Both captains died this round, so there are no winners, it's a tie!");
                        fightablePirateHandling();
                        break;
                    } else if (!isATeamCaptainLive) {
                        System.out.println();

                        System.out.println(shipTeamB.getName() + "'s crew have won the fight!");
                        fightablePirateHandling();
                        break;
                    } else if (!isBTeamCaptainLive) {
                        System.out.println();
                        System.out.println(shipTeamA.getName() + "'s crew have won the fight!");
                        fightablePirateHandling();
                        break;
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("No enemy on the other side!");
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
                fightablePirateHandling();
                System.out.println("____________________________");
            }
            while (isATeamCaptainLive && isBTeamCaptainLive);
            printCrewMembers();

        }
    }


    public void bigBattle() {
        FootSoldierFight(navalBattle());

    }
}