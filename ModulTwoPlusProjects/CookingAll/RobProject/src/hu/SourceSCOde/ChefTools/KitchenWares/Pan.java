package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;

public class Pan extends KitchenWare{

    private Ingredient[] ingredients;

    public Pan() {
        super("clean");
        ingredients = new Ingredient[0];
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        Ingredient[] temp = new Ingredient[ingredients.length + 1];
        System.arraycopy(ingredients, 0, temp, 0, ingredients.length);
        temp[ingredients.length] = ingredient;
        setIngredients(temp);
    }
}
