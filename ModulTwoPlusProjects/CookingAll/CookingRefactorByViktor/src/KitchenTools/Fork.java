package KitchenTools;

import Ingredients.Dairis.Egg;

public class Fork extends KitchenTool {
    
    public void crackEgg(Egg egg) {
        egg.crack();
    }

    public void stirEgg(Egg egg) {
        egg.stir();
    }
}
