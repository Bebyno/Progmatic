package Jeve.recipe;

import Jeve.controller.RecipeProcessor;
import Jeve.ingredient.*;
import Jeve.ingredient.animalproduct.Bacon;
import Jeve.ingredient.animalproduct.Egg;
import Jeve.spice.Chili;
import Jeve.spice.Pepper;
import Jeve.spice.Spice;
import Jeve.ingredient.vegetables.Onion;
import Jeve.ingredient.vegetables.Paprika;
import Jeve.ingredient.vegetables.Tomato;
import Jeve.utils.LogUtils;




public class Lecso  {
    int basicSaltLvl = 3;

    public void process(int eggQuantity, int peppery) {
        LogUtils.printRecipe("Lecsó");
        Ingredient[] ingredients = {
                new Onion(eggQuantity/2),
                new Paprika(eggQuantity),
                new Tomato(eggQuantity),
                new Egg(eggQuantity),
                new Bacon(eggQuantity)};

        Spice[] spices = {
                new Pepper(),
                new Chili()
        };

        RecipeProcessor lecsoProcessor =
                new RecipeProcessor(ingredients, spices, peppery, basicSaltLvl);

        LogUtils.printBonApetit();
    }

}

