package KitchenTools;

import Ingredients.Dairis.Egg;

public class Fork extends KitchenTools {

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
