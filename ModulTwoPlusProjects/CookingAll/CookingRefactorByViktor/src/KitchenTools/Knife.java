package KitchenTools;

import Ingredients.vegetables.Vegetables;

public class Knife extends KitchenTool{
    private boolean isSharp = false;

    public void sharpen() {
        isSharp = true;
    }

    public void chop(Vegetables vegetables){
        vegetables.chop();
    }

    @Override
    public String toString() {
        if (isSharp)
            return "sharp knife";
        return "blunt knife";
    }
    // a toString Override úgy működik, hogy a class egyik egyedét hozzá '+' -od egy string környezethez akkor Override-ja
    // fog meghívodni.
    // Lépj át az Egg-be az ősanya - leszármazott Override magyarázatért!

}
