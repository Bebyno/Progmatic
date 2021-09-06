package Spices;

import Ingredients.vegetables.Ingredients;

public class Spices extends Ingredients {
    private String name;
    private boolean isSpices= false;



    public String spreadedStatus(Spices spices) { // ha a státusz false akkor még nincs a tálban a fűszer
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
