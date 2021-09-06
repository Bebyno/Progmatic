package Jeve.ingredient.liquid;

import Jeve.ingredient.Ingredient;

public class Water extends Ingredient {
    public Water(int quantity) {
        this.name = "Water";
        this.state = Ingredient.STATE_LIQUID;
        this.quantity = quantity;
        this.peppery = quantity * (-10);
        this.clean = true;
    }
}
