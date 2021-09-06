package utils;

import storage.Drink;
import storage.KitchenTool;
import storage.Meal;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileHandler {

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
            String name = split[0];
            String amount = split[1];
            Drink drink = new Drink(name, Integer.parseInt(amount));
            forDrinkValidation.add(name.toLowerCase());
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
            String name = split[0];
            String amount = split[1];
            Meal meal = new Meal(name, Integer.parseInt(amount));
            forFoodValidation.add(name.toLowerCase());

            meals.add(meal);
        }
        return meals;
    }

    public static HashMap<String, KitchenTool> readAllKitchenTools() throws IOException {
        String fileKitchenTools = sourceDirectory + "KitchenTools.txt";
        List<String> clearKitchenTools = readFile(fileKitchenTools);
        HashMap<String,KitchenTool> kitchenTools = new HashMap<>();

        for (String rawKitchenTools : clearKitchenTools) {
            String[] split = rawKitchenTools.split(",");
            String name = split[0];
            int amount = Integer.parseInt(split[1]);
            KitchenTool kitchenTool = new KitchenTool(name,amount);



            kitchenTools.put(name, kitchenTool);


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