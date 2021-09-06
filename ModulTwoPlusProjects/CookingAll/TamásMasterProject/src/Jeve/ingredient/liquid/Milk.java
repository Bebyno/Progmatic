package Jeve.ingredient.liquid;

import Jeve.ingredient.Ingredient;

public class Milk extends Ingredient{
    public Milk(int quantity) {
        this.name = "Milk";
        this.state = Ingredient.STATE_LIQUID;
        this.quantity = quantity;
        this.peppery = quantity * (-7);
        this.clean = true;
    }
}
