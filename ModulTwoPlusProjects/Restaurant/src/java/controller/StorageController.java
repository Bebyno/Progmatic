package controller;

import storage.Drink;
import storage.KitchenTool;
import storage.Meal;
import table.Table;
import utils.FileHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class StorageController {
    /**
     * StorageController class shall be used to handle our storages
     * It shall dynamically handle the amounts each of our storage elements
     */

    private static List<Drink> drinks;
    private static Map<String,Integer> kitchenTools;
    private static Set<Meal> meals;



    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public static List<Drink> getDrinks() {
        return drinks;
    }

    public void setKitchenTools(HashMap<String,Integer> kitchenTools) {
        this.kitchenTools = kitchenTools;
    }

    public static Map<String, Integer> getKitchenTools() {
        return kitchenTools;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    public static Set<Meal> getMeals() {
        return meals;
    }


    public static void drink(String drinkName) throws IOException {
        // list of drinks
        int amountOrder = Table.getDrinkAmount();
        for( Drink drink : drinks){
            if(drink.getName().equals(drinkName)){
              //  System.out.println("Before"+drink.getAmount());
                drink.setAmount(drink.getAmount()-amountOrder);
               // System.out.println("After"+drink.getAmount());
            }
        }

    }

    public static void meal(String mealName)throws IOException {
        // list of meals
        int amountOrder = Table.getFoodAmount();
        for( Meal food : meals){
            if((food.getName().equals(mealName))){
                System.out.println("Before"+food.getAmount());
                food.setAmount(food.getAmount()-amountOrder);
               System.out.println("After"+food.getAmount());

            }
        }

    }

   /* public static void areEnoughKitchenTools(Map<String,Integer> kitchenTool) {
                //korábbi bemenet : int foodAmount, int drinkAmout
        for (Map.Entry<String, Integer> entry : kitchenTool.entrySet()) {
            if (entry.getValue() < 0) {
                System.out.println("Before" + kitchenTool);
                System.out.println("We run out of " + entry.getKey());
                System.out.println("After" + kitchenTool);
            }

        }
    }*/


        public static void kitchenTool(int foodAmount, int drinkAmout) throws IOException{
        System.out.println("Before"+kitchenTools);
        kitchenTools.put("Tányér",kitchenTools.get("Tányér")-foodAmount);
        kitchenTools.put("Evőeszköz",kitchenTools.get("Evőeszköz")-foodAmount*3);
        kitchenTools.put("Tálca",kitchenTools.get("Tálca")-foodAmount);
        kitchenTools.put("Szalvéta",kitchenTools.get("Szalvéta")-foodAmount);

        kitchenTools.put("Pohár",kitchenTools.get("Pohár")-drinkAmout);

        System.out.println("After"+kitchenTools);


            for (Map.Entry<String, Integer> entry : kitchenTools.entrySet()) {
                if (entry.getValue() < 0) {
                    System.out.println("Before" + kitchenTools);
                    System.out.println("We run out of " + entry.getKey());
                    System.out.println("After" + kitchenTools);
                    System.out.println("We have to close!");
                    System.exit(1);
                }

            }

    }



        /*kitchenTools("Tányér",kitchenTools.get("Tányér")-foodAmount);
        kitchenTools.get("Evőeszköz",kitchenTools.get("Evőeszköz")-foodAmount*3);
        kitchenTools.get("Tálca",kitchenTools.get("Tálca")-foodAmount);
        kitchenTools.get("Szalvéta",kitchenTools.get("Szalvéta")-foodAmount);

        kitchenTools.get("Pohár",kitchenTools.get("Pohár")-drinkAmout);
*/

    }



