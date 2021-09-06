package Things;

public class Desk {
    public int legs;
    public String matter;
    public boolean hasDrawer;
    public String colour;

    public Desk() {
    }

    public Desk(int legs, String matter, boolean hasDrawer, String colour) {
        this.legs = legs;
        this.matter = matter;
        this.hasDrawer = hasDrawer;
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

    public boolean isHasDrawer() {
        return hasDrawer;
    }

    public void setHasDrawer(boolean hasDrawer) {
        this.hasDrawer = hasDrawer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
