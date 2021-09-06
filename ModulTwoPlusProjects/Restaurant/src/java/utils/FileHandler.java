package utils;

import storage.Drink;
import storage.KitchenTool;
import storage.Meal;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileHandler {
    /**
     * FileHandler class should be used to uplaod data from files
     * <p>
     * hint: String split() method
     */
    private static final String sourceDirectory = "src/resources/";
    private static List<String> forDrinkValidation;
    private static List<String> forFoodValidation;



    public static List<String> readFile(String fileName) throws IOException {
        List<String> myList = new ArrayList<>();
        File file = new File(fileName);
        Scanner sc;
        if (file.exists()) {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                myList.add(line);
            }
        }
        return myList;
    }

    public static List<Drink> readAllDrinks() throws IOException {
        String fileDrinks = sourceDirectory + "Drinks.txt";
        List<String> rawDrinks = readFile(fileDrinks);
        List<Drink> drinks = new ArrayList<>();
        forDrinkValidation = new ArrayList<>();

        for (String rawDrink : rawDrinks) {
            String[] split = rawDrink.split(",");
            String name = split[0].toLowerCase();
            String amount = split[1];
            Drink drink = new Drink();
            drink.setAmount(Integer.parseInt(amount));
            drink.setName(name);
            forDrinkValidation.add(name);


            drinks.add(drink);
        }

        return drinks;
    }

    public static Set<Meal> readAllMeals() throws IOException {
        String fileMeal = sourceDirectory + "Meals.txt";
        List<String> rawMeals = readFile(fileMeal);
        Set<Meal> meals = new HashSet<>();
        forFoodValidation = new ArrayList<>();

        for (String rawMeal : rawMeals) {
            String[] split = rawMeal.split(",");
            String name = split[0].toLowerCase();
            String amount = split[1];
            Meal meal = new Meal();
            meal.setAmount(Integer.parseInt(amount));
            meal.setName(name);
            forFoodValidation.add(name);

            meals.add(meal);


        }

        return meals;
    }

    public static HashMap<String, Integer> readAllKitchenTools() throws IOException {
        String fileKitchenTools = sourceDirectory + "KitchenTools.txt";
        List<String> clearKitchenTools = readFile(fileKitchenTools);
        HashMap<String,Integer> kitchenTools = new HashMap<>();

        for (String rawKitchenTools : clearKitchenTools) {
            String[] split = rawKitchenTools.split(",");
            String name = split[0];
            String amount = split[1];
            KitchenTool kitchenTool = new KitchenTool();

            kitchenTool.setAmount(Integer.parseInt(amount));
            kitchenTool.setName(name);


            kitchenTools.put(name, kitchenTool.getAmount());


    }
        return kitchenTools;


}

    public static List<String> getforDrinksValidation() {
        return forDrinkValidation;
    }

    public static List<String> getforFoodValidation() {
        return forFoodValidation;
    }
}