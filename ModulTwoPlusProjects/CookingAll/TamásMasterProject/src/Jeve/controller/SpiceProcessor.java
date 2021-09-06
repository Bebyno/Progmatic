package Jeve.controller;

import Jeve.ingredient.Ingredient;
import Jeve.spice.Salt;
import Jeve.spice.Spice;

public class SpiceProcessor {

    void addSpices(Ingredient[] ingredients, Spice[] spices, int peppery, int basicSaltLvl) {
        Salt salt = new Salt();
        salt.setQuantity(
                getSpiceQuantity(
                        ingredients,
                        basicSaltLvl,
                        salt.getBasePeppery()));
        addToSpices(spices, salt);
        System.out.println("Added salt!");

        for (Spice spice : spices) {
            spice.setQuantity(
                    getSpiceQuantity(
                            ingredients,
                            (peppery-basicSaltLvl)/spices.length,
                            spice.getBasePeppery()));
            addToSpices(spices, spice);
        }
        System.out.println("Spices are added to peppery lvl " + peppery + " using the following spices: ");
        for (Spice spice : spices) {
            System.out.println(spice.getName() + " peppery amount: " + spice.getQuantity());
        }
    }

    private int getSpiceQuantity(Ingredient[] ingredients, int pepperyLvl, int basePeppery) {
        int peppery = checkPeppery(ingredients);
        int pepperyDiff = pepperyLvl - peppery;
        return pepperyDiff > 0 ? pepperyDiff / basePeppery : 0;
    }

    private void addToSpices(Spice[] spices, Spice spice) {
        Spice[] newSpices = new Spice[spices.length + 1];
        for (int i = 0; i < spices.length; i++) {
            newSpices[i] = spices[i];
        }
        newSpices[spices.length] = spice;
        spices = newSpices;
    }

    private int checkPeppery(Ingredient[] ingredients) {
        int mealPeppery = 0;
        for(Ingredient ingredient : ingredients) {
            mealPeppery += ingredient.getPeppery();
        }
        return mealPeppery;
    }
}
