package Spices;

import Ingredients.vegetables.Ingredient;

public class Spice extends Ingredient {
    
    private boolean isSpices= false;

    public Spice(String name){
        super(name);
    }

    public String spreadedStatus(Spice spice) { // ha a státusz false akkor még nincs a tálban a fűszer
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
