package hu.SourceSCOde.ChefTools;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;
import hu.SourceSCOde.ChefTools.Ingredients.Onion;
import hu.SourceSCOde.ChefTools.Ingredients.Spice;
import hu.SourceSCOde.ChefTools.KitchenWares.*;


public class Chef {

    public static void wash(Ingredient ingredient) {
        if (ingredient.getNextState().equals("washed")) {
            ingredient.setStateIndex(ingredient.getStateIndex() + 1);
            System.out.println("The " + ingredient.getClass().getSimpleName().toLowerCase()
                    + " has been " + ingredient.getCurrentState() + ".");
        }
    }

    public static void wash(KitchenWare kitchenWare) {
        kitchenWare.setStatus("clean");
    }


    public static void peel(Ingredient ingredient, Knife knife) {
        knife.getCuttingBoard().setIngredient(ingredient);
        if (ingredient.getNextState().equals("peeled")) {
            knife.process();
            System.out.println("The " + ingredient.getClass().getSimpleName().toLowerCase()
                    + " has been " + ingredient.getCurrentState() + ".");
        }
    }


    public static void cut(Ingredient ingredient, Knife knife) {
        knife.getCuttingBoard().setIngredient(ingredient);
        if (ingredient.getNextState().equals("cutted") || ingredient.getNextState().equals("diced")) {
            knife.process();
            System.out.println("The " + ingredient.getClass().getSimpleName().toLowerCase() + " has been "
                    + ingredient.getCurrentState() + ".");
        }
        if (ingredient instanceof Onion && ingredient.getPossibleStates(ingredient.getStateIndex()).equals("diced")) {
            System.out.println("(My eyes! MY EYES!!!)");
        }
        knife.setStatus("dirty");
        knife.getCuttingBoard().setStatus("dirty");
    }


    public static void cook(FirePlace firePlace, int time) throws InterruptedException {

        System.out.print("Cooking in progress");
        Thread.sleep(time);
        System.out.print(".");
        Thread.sleep(time);
        System.out.print(".");
        Thread.sleep(time);
        System.out.print(".\n");
        Thread.sleep(time);

        for (Ingredient ingredient : firePlace.getPan().getIngredients()) {
            ingredient.setStateIndex(ingredient.getStateIndex() + 1);
            if (!(ingredient instanceof Spice)) {
                System.out.println("The " + ingredient.getClass().getSimpleName().toLowerCase() + " has been "
                        + ingredient.getCurrentState() + ".");
            }
        }

        firePlace.setStatus("dirty");
        firePlace.getPan().setStatus("dirty");
    }


    public static boolean spicing(Ingredient[] ingredients, double goalSaltiness, double goalHotness) {
        return Spice.spicing(ingredients, goalSaltiness, goalHotness);
    }

    public static Knife searchForKnife(KitchenWare[] kitchenWares) {
        for (KitchenWare kitchenWare : kitchenWares){
            if (kitchenWare instanceof Knife) {
                return (Knife) kitchenWare;
            }
        }
        return null;
    }

    public static FirePlace searchForFirePlace(KitchenWare[] kitchenWares) {
        for (KitchenWare kitchenWare : kitchenWares){
            if (kitchenWare instanceof FirePlace) {
                return (FirePlace) kitchenWare;
            }
        }
        return null;
    }

    public static boolean isCooked(Ingredient[] ingredients) {
        for (Ingredient ingr : ingredients) {
            if (!ingr.getCurrentState().equals("cooked")) {
                return false;
            }
        }
        return true;
    }
}
