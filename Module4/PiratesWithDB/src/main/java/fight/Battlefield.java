package fight;

import model.Captain;
import model.Pirate;
import model.Ship;

import java.util.*;


public class Battlefield {
    private List<Ship> shipList;

    public void gettingTheShipsFromDB(List<Ship> ships) {
        shipList = ships;
    }

    List<List<Pirate>> crew = new ArrayList<>();
    List<Captain> captainList = new ArrayList<>();
    List<Pirate> allPirate = new ArrayList<>();
    Ship shipTeamA;
    Ship shipTeamB;


    public List<List<Pirate>> crews(List<Ship> ships) {
        for (int i = 0; i < shipList.size(); i++) {
            crew.add(ships.get(i).getCrew());
        }
        return crew;
    }

    public int max() {
        int max = 0;

        for (Ship ship : shipList) {
            if (ship.getCrew().size() > max) {
                max = ship.getCrew().size();
            }
        }
        return max;
    }

    public int allList() {

        for (int i = 0; i < crew.size(); i++) {
            for (int y = 0; y < crew.get(i).size(); y++) {
                allPirate.add(crew.get(i).get(y));
            }
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
        for (List<Pirate> pirates : crew) {
            Collections.shuffle(pirates);
        }
    }

    public void isCanFight() {

        for (List<Pirate> pirates : crew) {
            for (Pirate pirate : pirates) {
                if (pirate.getStrength() < 1) {
                    pirate.setCanFight(false);
                }
            }
        }
    }

    public void fightablePirateHandling() {
        List<Pirate> deadTeamMember = new ArrayList<>();
        for (List<Pirate> pirates : crew) {
            for (Pirate pirate : pirates) {
                if (pirate.getHealth() < 1 || !pirate.isCanFight()) {
                    deadTeamMember.add(pirate);
                }
            }
            pirates.removeAll(deadTeamMember);
        }
    }

    public boolean navalBattle() {
        if (shipList.size() < 3) {

            for (int i = 0; i < shipList.size() - 1; i++) {
                shipTeamA = shipList.get(i);
                shipTeamB = shipList.get(i + 1);
            }
        } else {
            System.out.println("Work in progress");
        }

        System.out.println("Let the battle begin.");
        System.out.println("Today " + shipTeamA.getName() + " will fight against " + shipTeamB.getName() + ".");
        System.out.println("Fight result: ");
        shipTeamA.shipsRandomization();
        shipTeamB.shipsRandomization();
       /* System.out.println(shipTeamA.getName() +" has "+shipTeamA.getHealth()+" HP");
        System.out.println(shipTeamB.getName() +" has "+shipTeamB.getHealth()+" HP");*/
        return shipTeamA.shipBattle(shipTeamB);
    }

    public void printCrewMembers() {
        int whichOneTeam = 1;
        for (List<Pirate> pirates : crew) {
            System.out.println("\n" + whichOneTeam++ + ".team: ");
            for (Pirate pirate : pirates) {
                System.out.print(pirate.getName() + ", ");
            }
            if (pirates.size() == 0) {
                System.out.println("No one left.");
            }
        }
    }

    public void FootSoldierFight(boolean naval) {
        if (naval) {
            boolean isATeamCaptainLive = true;
            boolean isBTeamCaptainLive = true;
            int round = 1;
            crews(shipList);
            // fillingTheCrews();
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

                    for (int i = 0; i < crew.size() - 1; i++) {

                        for (int y = 0; y < max(); y++) {
                            System.out.println("\n" + crew.get(i).get(y).getName() + "(" + crew.get(i).get(y).getHealth() + "HP" +
                                    "," + crew.get(i).get(y).getStrength() + "STR" + ")" + " vs " + crew.get(i + 1).get(y).getName() + "(" +
                                    "" + crew.get(i + 1).get(y).getHealth() + "HP," + crew.get(i + 1).get(y).getStrength() + "STR" + ")" + "\n");

                            crew.get(i).get(y).fight(crew.get(i + 1).get(y));
                            if (crew.get(i).get(y) instanceof Captain) {
                                if (crew.get(i).get(y).getHealth() < 1) {
                                    isATeamCaptainLive = false;
                                }
                            }
                            if (crew.get(i + 1).get(y) instanceof Captain) {
                                if (crew.get(i + 1).get(y).getHealth() < 1) {
                                    isBTeamCaptainLive = false;
                                }
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