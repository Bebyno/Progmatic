package Things;

public class Lamp {
    public String type;
    public String bulbType;
    public int bulbLumen;
    public String colour;
    public boolean isEnergySaver;
    public boolean hasGenie;

    public Lamp() {
    }

    public Lamp(String type, String bulbType, int bulbLumen, String colour, boolean isEnergySaver, boolean hasGenie) {
        this.type = type;
        this.bulbType = bulbType;
        this.bulbLumen = bulbLumen;
        this.colour = colour;
        this.isEnergySaver = isEnergySaver;
        this.hasGenie = hasGenie;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBulbType() {
        return bulbType;
    }

    public void setBulbType(String bulbType) {
        this.bulbType = bulbType;
    }

    public int getBulbLumen() {
        return bulbLumen;
    }

    public void setBulbLumen(int bulbLumen) {
        this.bulbLumen = bulbLumen;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isEnergySaver() {
        return isEnergySaver;
    }

    public void setEnergySaver(boolean energySaver) {
        isEnergySaver = energySaver;
    }

    public boolean isHasGenie() {
        return hasGenie;
    }

    public void setHasGenie(boolean hasGenie) {
        this.hasGenie = hasGenie;
    }


    public void rubTheLamp() {
        if (this.hasGenie) {
            System.out.println("Oi! Ten thousand years will give you such a crick in the neck!");
        } else {
            System.out.println("The lamp is a little shinier.");
        }
    }
}
