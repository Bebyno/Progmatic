package Ingredients.Solids;

import Ingredients.Ingredient;

public class Solids extends Ingredient {
    private boolean sprinkled = false;
    private int gramm;

    public Solids(String name, int gramm) {
        super(name);
        this.gramm = gramm;
    }



    public boolean isSprinkled() {
        return sprinkled;
    }

    public void setSprinkled(boolean sprinkled) {
        this.sprinkled = sprinkled;
    }


}
