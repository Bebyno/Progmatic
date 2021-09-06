package Ingredients.Dairis;

import Ingredients.vegetables.Ingredients;

public class Egg extends Ingredients {
    private boolean isCracked= false;
    private String name;





    public boolean isCracked() {
        return isCracked;
    }

    public void setCracked(boolean cracked) {
        isCracked = cracked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
