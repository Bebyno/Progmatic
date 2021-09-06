import Ingredients.Liquids.Oil;
import Ingredients.Liquids.RiceMilk;
import Ingredients.Plants.Fruits.Banana;
import Ingredients.Plants.Fruits.Blueberry;
import Ingredients.Solids.ChiaSeeds;
import Ingredients.Solids.Oat;
import KitchenTools.*;
import Spices.Salt;

import java.util.Arrays;

public class Recipes {
    public static void main(String[] args) {

        //Liquids
        Oil oil = new Oil();
        //SparklingWater sparklingWater = new SparklingWater();
        RiceMilk riceMilk = new RiceMilk();

        //Solids
        ChiaSeeds chiaSeeds = new ChiaSeeds();
        Oat oat = new Oat();

        //Fruits
        Banana banana = new Banana();
        Blueberry blueberry = new Blueberry();

        //KitchenTools
        Bowl bowl = new Bowl();
        Fork fork = new Fork();
        FryingPan fryingPan = new FryingPan();
        Knife knife = new Knife();
        Spoon spoon = new Spoon();
        Stove stove = new Stove();
        Tap tap = new Tap();

        //Spices
        Salt salt = new Salt();


        tap.washed(blueberry);
        knife.peel(banana);
        knife.chopp(banana);

        bowl.containedIngredients(banana);
        bowl.containedIngredients(blueberry);
        bowl.containedIngredients(riceMilk);
        bowl.containedIngredients(chiaSeeds);
        bowl.containedIngredients(oat);
        bowl.containedIngredients(salt);


        System.out.println("The bowl contains these ingredients: " + Arrays.toString(bowl.getIngredients()));
        bowl.mixWithFork(bowl.getIngredients(), fork);
        System.out.println("Then we mix the ingredients with a fork: " + Arrays.toString(bowl.getIngredients()));


        fryingPan.pouring(oil);
        stove.heating(oil);
        fryingPan.PanArray(bowl);
        System.out.println("We pour the ingredients into the pan " + Arrays.toString(fryingPan.getFoodInPan()));
        System.out.println("Then the cooking process takes place!");
        System.out.println(fryingPan.foodReady(bowl));



    }
}
