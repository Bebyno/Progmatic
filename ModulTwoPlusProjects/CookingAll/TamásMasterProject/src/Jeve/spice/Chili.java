package Jeve.spice;

public class Chili extends Spice{

    public Chili() {
        this(0);
    }

    public Chili(int quantity) {
        basePeppery = 8;
        this.name = "Chili";
        this.quantity = quantity;
    }
}
