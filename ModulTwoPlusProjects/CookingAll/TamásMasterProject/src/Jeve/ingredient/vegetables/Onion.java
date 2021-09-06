package Jeve.ingredient.vegetables;

import Jeve.ingredient.Ingredient;

public class Onion extends Ingredient {
    public Onion(int quantity) {
        this.name = "Onion";
        this.peppery = quantity * (-1);
        this.quantity = quantity < 1 ? 1 : quantity;
    }
}
