package KitchenTools;

import Ingredients.Dairis.Egg;

public class Bowl extends ContainerTool {

    public void stirContent(Fork fork) {
        for (int i = 0; i < content.length; i++) {
            if (content[i] instanceof Egg) {        // instanceof az vizsgálja, hogy az aktuális elem az Egg osztályból való-e.
                fork.stirEgg((Egg)content[i]);      // Ha igen, akkor lép bele az if belsejében és
            }                                       //jelen esetben felveri a tojást a villával.
        }
    }
}
