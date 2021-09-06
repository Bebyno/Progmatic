package TeamMates;

public class TeamData {
    public static int crewNumber = 0;
    public final String NAME;
    private String gernder;
    private String mood;

    public TeamData(String NAME) {
        this.NAME = NAME;
        crewNumber++;
    }

    public TeamData(String NAME1, String gernder, String mood) {
        this.NAME = NAME1;
        this.gernder = gernder;
        this.mood = mood;
        crewNumber++;
    }

    public static int getCrewNumber() {
        return crewNumber;
    }

    public static void setCrewNumber(int crewNumber) {
        TeamData.crewNumber = crewNumber;
    }

    public String getNAME() {
        return NAME;
    }

  /*  public String getNAME2() {
        return NAME2;
    }

    public String getNAME3() {
        return NAME3;
    }

    public String getNAME4() {
        return NAME4;
    }*/

    public String getGernder() {
        return gernder;
    }

    public void setGernder(String gernder) {
        this.gernder = gernder;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
