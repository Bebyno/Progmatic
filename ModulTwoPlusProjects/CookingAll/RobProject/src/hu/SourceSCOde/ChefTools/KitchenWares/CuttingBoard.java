package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;

  /**
  * A felszeletelendő összetevők összegyűjtésére szolgál.
  */

public class CuttingBoard extends KitchenWare{
     private Ingredient ingredient;

    public CuttingBoard() {
        super("clean");
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
