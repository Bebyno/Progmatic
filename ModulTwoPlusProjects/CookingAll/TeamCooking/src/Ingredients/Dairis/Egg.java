package Ingredients.Dairis;

import Ingredients.Ingredient;

public class Egg extends Ingredient {
    private boolean isCracked= false;

    public Egg() {
        super("egg",1);
    }


    public boolean isCracked() {
        return isCracked;
    }

    public void setCracked(boolean cracked) {
        isCracked = cracked;
    }

}
