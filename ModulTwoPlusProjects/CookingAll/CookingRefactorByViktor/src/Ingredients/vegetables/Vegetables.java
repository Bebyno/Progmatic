package Ingredients.vegetables;

public class Vegetables extends Ingredient {
    private boolean chopped = false;
    private boolean peel = false;
    private boolean washed = false;




    public Vegetables(String name) {
        super(name);
    }


    public boolean isPeel() {
        return peel;
    }

    public void peel() {
        this.peel = true; // A Peel az egyirányú, ezért itt ne használj set-et. Amit egyszer meghámoztál az hámozva marad
    }

    public boolean isChopped() {
        return chopped;
    }

    public void chop() {
        this.chopped = true;    // A Chop az egyirányú, ezért itt ne használj set-et. Amit egyszer feldarboltál...
    }

    @Override
    public String toString() {
        String name = "";

        name += chopped ? "chopped " : "not chopped ";
        name += peel ? "and peeled " : "and not peeled ";
        name += this.getName();
        return name;
    }

}
