package Ingredients.Plants.vegetables;

public class Onion extends Vegetables {
    public Onion() {
        super("onion", 1);
    }

    @Override
    public boolean isPeel() {
        return true;
    }
}
