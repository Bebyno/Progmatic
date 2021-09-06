package KitchenTools;


import Ingredients.Ingredient;

import java.util.Random;

public class Bowl extends KitchenTools{
    private String current= "empty";
    private Ingredient[] bowlArray = new Ingredient[5];
    private Ingredient stirEgg;
    private Ingredient[] ingredients = new Ingredient[0]; // később feltöltjük

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients)     {
        this.ingredients = ingredients;
    }

    private Random random = new Random();

    public void containedIngredients(Ingredient ingredient) {
        Ingredient[] temp = new Ingredient[ingredients.length + 1]; // mert mindig hozzáadunk egy plusz elemet
        for (int i = 0; i < temp.length - 1; i++) {
            temp[i]= ingredients[i];
        }

        temp[temp.length-1] = ingredient; // mindig az utolsó helyre tegye be, ne előről 0.-ról
        ingredients = temp; // átadja az elemet

    }



    public void mixWithFork(Ingredient[] ingredients, Fork fork) {
        if (fork.isForkReady()) { // elkeverjük a ready villával a hozzávalókat
            for (int i = 0; i < ingredients.length; i++) { // random megkeverése a hozzávalóknak a tömbben
                int j = random.nextInt(ingredients.length);
                Ingredient helper = ingredients[i];
                ingredients[i] = ingredients[j];
                ingredients[j] = helper;
            }
        }
    }
    public Ingredient getStirEgg() {
        return stirEgg;
    }

    public void setStirEgg(Ingredient stirEgg) {
        this.stirEgg = stirEgg;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public Ingredient[] getBowlArray() {
        return bowlArray;
    }

    public void setBowlArray(Ingredient[] bowlArray) {
        this.bowlArray = bowlArray;
    }
}

