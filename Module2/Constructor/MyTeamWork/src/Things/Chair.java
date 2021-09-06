package Things;

public class Chair extends Stuffs{
    public final int NUMBER = 1;
    public static int ChairNumbers = 123;


  /*  public int legs;
    public String matter;
    public boolean hasArmRest;
    public String colour;*/

    public Chair() {
    }

    public Chair(int legs, String matter, boolean armRest, String colour) {
        this.legs = legs;
        this.matter = matter;
        this.hasArmRest = armRest;
        this.colour = colour;
    }


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public boolean isArmRest() {
        return hasArmRest;
    }

    public void setArmRest(boolean armRest) {
        this.hasArmRest = armRest;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
