package Jeve.controller;


import Jeve.ingredient.Ingredient;
import Jeve.kitchen_tool.Pan;

public class HeatProcessor {

    Ingredient[] heatIngredients(Ingredient[] ingredients) {
        Pan pan = new Pan();
        for (Ingredient ingredient : ingredients) {
            pan.processIngredient(ingredient);
        }

        return ingredients;
    }
}
