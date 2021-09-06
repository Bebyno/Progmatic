package Ingredients.Dairis;

import Ingredients.vegetables.Ingredient;

public class Egg extends Ingredient {
    private boolean isCracked = false;
    private boolean isStirred = false;

    public Egg() {
        super("egg");
    }

    public boolean isCracked() {
        return isCracked;
    }

    public void crack() {
        isCracked = true;
    }

    public boolean isStirred() {
        return isStirred;
    }

    public void stir() {
        isStirred = true;
    }

    @Override
    public String toString() {
        return (isStirred ? "stirred " : "not stirred ") + super.toString();
    }

                                            // super.toString()

    // super.toString() felfelé haladva az alfajtól az ősanyákban az 1. amit talál azt az Override-ot fogja meghívni.
    // Addig megy amíg nem  talál egyet, tehát ha a tőbb leszármazás van és az alfaj egyed anyjának nincs Override-ja
    // akkor szülő anyját nézi és így tovább, amíg nem talál egy ősszülő Override-ot.
    // Normál esetben, ha több Override van (tehát van a szülőben és az egyedben is ) akkor mindig a belsőbb, a specifi-
    //kusabb fog lefutni, tehát az alfaj/egyed Override-ja fut le.

}
