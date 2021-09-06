package KitchenTools;

import Ingredients.Dairis.Egg;

public class Fork extends KitchenTools {
    private boolean isReady = false;


    public boolean isForkReady() {
        return isReady = true;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public boolean cracked(Egg egg) {

        return !egg.isCracked();
    }

    public String stirring(Egg egg) {
        String stir = "";
        if (cracked(egg)) {
            stir = "Let's stir the egg.";
        }
        return stir;

    }
}
