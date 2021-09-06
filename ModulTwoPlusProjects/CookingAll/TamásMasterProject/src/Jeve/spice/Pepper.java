package Jeve.spice;

public class Pepper extends Spice{

    public Pepper() {
        this(0);
    }

    public Pepper(int quantity) {
        basePeppery = 3;
        this.name = "Pepper";
        this.quantity = quantity;
    }
}
