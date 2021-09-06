package Ingredients.vegetables;

import KitchenTools.FryingPan;

public class Ingredients {
    private boolean cooked = false;
    private boolean poured = false;


    public boolean heated(FryingPan fryingPan){

        return !fryingPan.isCooked();
    }


    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }

    public boolean isPoured() {
        return poured;
    }

    public void setPoured(boolean poured) {
        this.poured = poured;
    }


}
