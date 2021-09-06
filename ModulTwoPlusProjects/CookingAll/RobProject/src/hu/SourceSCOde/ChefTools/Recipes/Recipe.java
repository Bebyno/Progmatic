package hu.SourceSCOde.ChefTools.Recipes;

import hu.SourceSCOde.ChefTools.Chef;
import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;
import hu.SourceSCOde.ChefTools.KitchenWares.FirePlace;
import hu.SourceSCOde.ChefTools.KitchenWares.KitchenWare;
import hu.SourceSCOde.ChefTools.KitchenWares.Knife;

public class Recipe {

    private Ingredient[] ingredients;
    private KitchenWare[] tools;
    private String name;
    private double saltiness;
    private double hotness;
    private final int COOKING_TIME;


    public Recipe(Ingredient[] ingredients, KitchenWare[] tools, double saltiness, double hotness, String name) {
        this.ingredients = ingredients;
        this.tools = tools;
        this.saltiness = saltiness;
        this.hotness = hotness;
        this.name = name;
        COOKING_TIME = 250 * ingredients.length;
    }


    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public KitchenWare[] getTools() {
        return tools;
    }

    public void setTools(KitchenWare[] tools) {
        this.tools = tools;
    }

    public double getSaltiness() {
        return saltiness;
    }

    public void setSaltiness(double saltiness) {
        this.saltiness = saltiness;
    }

    public double getHotness() {
        return hotness;
    }

    public void setHotness(double hotness) {
        this.hotness = hotness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cooking() throws InterruptedException {
        Knife knife = Chef.searchForKnife(tools);
        if (knife == null) {
            System.out.println("Go and get a knife!");
            return;
        }
        FirePlace firePlace = Chef.searchForFirePlace(tools);
        if (firePlace == null) {
            System.out.println("Buy a fireplace first!");
            return;
        }
        for (Ingredient ingr : ingredients) {
            Chef.wash(ingr);
            Chef.peel(ingr, knife);
            Chef.cut(ingr, knife);
            firePlace.getPan().addIngredient(ingr);
        }

        Chef.cook(firePlace, COOKING_TIME);
        boolean isReady = Chef.isCooked(firePlace.getPan().getIngredients());
        boolean isTasty = Chef.spicing(firePlace.getPan().getIngredients(), saltiness, hotness);
        System.out.println((isReady ? name + " is ready" +
                " and it is " + (isTasty ? "delicious!" : "not so tasty.") : "No dinner today"));
    }
}
