package Ingredients.Liquids;

import Ingredients.Ingredient;

public class Liquid extends Ingredient {
    private boolean isPoured = false;
    private boolean isHeated = false;
    private int dl;

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public Liquid(String name, int dl) {
        super(name);
        this.dl = dl;
    }



    public String liquidStatus(Liquid liquid) {
        String status = "";
        if (!isPoured) {
            status = "Not poured";
        }
        return status;
    }

    public boolean isPoured() {
        return isPoured;
    }

    public void setPoured(boolean poured) {
        isPoured = poured;
    }

    public boolean isHeated() {
        return isHeated;
    }

    public void setHeated(boolean heated) {
        isHeated = heated;
    }


}
