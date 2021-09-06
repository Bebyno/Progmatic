package Ingredients.Plants;
import Ingredients.Ingredient;
public class Plant extends Ingredient {
    private boolean chopped = false;
    private boolean peel = false;
    private boolean washed = false;


    public Plant(String name, int piece) {
        super(name,piece);

    }


    public boolean isChopped() {
        return chopped;
    }

    public void setChopped(boolean chopped) {
        this.chopped = true;
    }

    public boolean isPeel() {
        return peel;
    }

    public void setPeel(boolean peel) {
        this.peel = true;
    }

    public boolean isWashed() {
        return washed;
    }

    public void setWashed(boolean washed) {
        this.washed = washed; // marad mert leeshet
    }
}
