package Jeve.spice;

public class Salt extends Spice{

    public Salt() {
        this(0);
    }

    public Salt(int quantity) {
        basePeppery = 4;
        this.name = "Salt";
        this.quantity = quantity;
    }
}
