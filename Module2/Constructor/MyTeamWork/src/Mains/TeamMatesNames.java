package Mains;

/**
 * Create a program which contains the TeamMate class with at least the following properties:
 *      ManPower - should be a static class variable containing the number of people in the team
 *          Needs to be incremented by every new TeamMate
 *      Name - The name of the teammate
 *      Sex - The sex of the teammate
 *      Mood - The mood of the teammate
 *  The TeamMate class should be placed in the .team class
 * Create the people in Your team in the main() method
 */



import TeamMates.TeamData;


public class TeamMatesNames {
    public static void main(String[] args) {

        TeamData Zsófa = new TeamData("Zsófa");
        Zsófa.setGernder("female");
        Zsófa.setMood("happy");
        TeamData Dávid = new TeamData("Dávid");
        TeamData Bea = new TeamData("Bea");
        Dávid.setGernder("male");
        Dávid.setMood("unhappy");
        Bea.setGernder("female");
        Bea.setMood("neutral");
        TeamData Beni = new TeamData("Beni");
        Beni.setGernder("male");
        Beni.setMood("happy");

        System.out.println("Teammembers are: "+Zsófa.getNAME()+", "+Dávid.getNAME()+", "+Bea.getNAME()+", "+Beni.getNAME());
        System.out.println("Crewnumber: "+ TeamData.crewNumber);


    }
}
