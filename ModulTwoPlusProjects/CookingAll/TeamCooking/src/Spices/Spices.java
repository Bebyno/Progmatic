package Spices;

import Ingredients.Ingredient;

public class Spices extends Ingredient {
    private boolean isSpices= false;

    public Spices(String name) {
        super(name);
    }


    public String spreadedStatus(Spices spices) { // ha a státusz false akkor nem tettük bele a tálba a fűszert
        String status = "";
        if (!isSpices) {
            status = "not spreaded";
        }
        return status;
    }


    public boolean isSpices() {
        return isSpices;
    }

    public void setSpices(boolean spices) {
        this.isSpices = spices;
    }



}
