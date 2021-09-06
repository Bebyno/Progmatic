package controller;

import storage.Drink;
import storage.KitchenTool;
import storage.Meal;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class StorageController {

    private List<Drink> drinks;
    private Map<String, KitchenTool> kitchenTools;
    private Set<Meal> meals;


    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setKitchenTools(HashMap<String, KitchenTool> kitchenTools) {
        this.kitchenTools = kitchenTools;
    }

    public Map<String, KitchenTool> getKitchenTools() {
        return kitchenTools;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    public Set<Meal> getMeals() {
        return meals;
    }


    public boolean drink(String drinkName, double amount) throws IOException {
        for (Drink drink : drinks) {
            if (drink.getName().toLowerCase().equals(drinkName)) {
                if (drink.getAmount() >= amount) {
                    if (kitchenTool(0, amount)) {
                        System.out.println();
                        System.out.println("Drink Before:" + (int)drink.getAmount());
                        drink.addAmount(-amount);
                        System.out.println("Drink After:" + (int)drink.getAmount());
                        return true;
                    } else {
                        System.out.println("We dont have enough " + drinkName + "!");
                    }
                }
            }
        }
        return false;
    }

    public boolean meal(String mealName, double amount) throws IOException {
        for (Meal food : meals) {
            if ((food.getName().toLowerCase().equals(mealName))) {
                if (food.getAmount() >= amount) {
                    if (kitchenTool(amount, 0)) {
                        System.out.println();
                        System.out.println("Food Before:" + (int)food.getAmount());
                        food.addAmount(-amount);
                        System.out.println("Food After:" + (int)food.getAmount());
                        return true;
                    } else {
                        System.out.println("We dont have enough " + mealName + "!");
                    }
                }
            }
        }
        return false;
    }

    public boolean kitchenTool(double foodAmount, double drinkAmout) throws IOException {

        for (Map.Entry<String, KitchenTool> entry : kitchenTools.entrySet()) {

            if (!entry.getValue().hasEnoughFor(foodAmount, drinkAmout)) {
                System.out.println("We dont have enough " + entry.getKey() + "! We have to make a break to fill our " +
                        "storage. Come back later, sorry");
                System.exit(1); // brutal solution, didnt have better until this.
                return false;
            }
        }
        for (Map.Entry<String, KitchenTool> entry : kitchenTools.entrySet()) {
            System.out.print(entry.getValue().getName() + ":");
            System.out.print("Before "+ (int) entry.getValue().getAmount() + ",");
            entry.getValue().removeFor(foodAmount, drinkAmout);
            System.out.print("After " + (int) entry.getValue().getAmount() + ",");

        }
        return true;
    }
    public void kitchenToolsHandling(){

        kitchenTools.get("Tányér").initializeUsage(1, 0);
        kitchenTools.get("Evőeszköz").initializeUsage(3, 0);
        kitchenTools.get("Tálca").initializeUsage(0.5, 0.25);
        kitchenTools.get("Szalvéta").initializeUsage(1, 0);
        kitchenTools.get("Pohár").initializeUsage(0, 1);
    }

}



