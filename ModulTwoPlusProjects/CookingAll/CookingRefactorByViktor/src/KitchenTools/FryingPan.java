package KitchenTools;

import Ingredients.General.Liquid;

public class FryingPan extends ContainerTool {

    // ez a főzés metodus, ha minden elem benne van a serpenyőben klsz a kaja
    public boolean isDone() {
        for (int i = 0; i < content.length; i++) {
            if (!content[i].isCooked()) // Ha minden elem cooked értéke true (tehát minde elem megsült) akkor legyen true az értéke.
                return false;
        }
        return true;
    }

    public void cook() {
        for (int i = 0; i < content.length; i++) {
            if (content[i] instanceof Liquid){      // ha az elem Liquid class-ból való, akkor lép be az if-be és melegíti fel az olajat
                ((Liquid) content[i]).setHeated(true);
                 content[i].setCooked(true);
            }
            else
                content[i].setCooked(true);
        }
    }
}
