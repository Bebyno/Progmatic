package table;

import controller.StorageController;
import storage.Drink;
import storage.Meal;
import storage.StorageElement;
import utils.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Table {
    /**
     * Table class is used to follow our customer requests
     * Needs to contain and follow the storage elements requested by our customers
     */
    private static int foodAmount;
    private static int drinkAmount;
    private static String foodName;
    private static String drinkName;


    public static String foodTypeOrder() throws IOException {

        Scanner sc = new Scanner(System.in);
        //String foodName;


        System.out.println("Here is the food-menu:");
        // System.out.println();
        for (Meal str : FileHandler.readAllMeals()) {
            System.out.println("-" + str.getName());
        }
        System.out.println();
        System.out.println("What do you want to eat?");
        foodName = sc.nextLine().toLowerCase();
        //System.out.println(foodName);

        return foodName;
    }

    public static boolean isValidFood(List<String> rawMeals) throws IOException {
        String validFood = foodTypeOrder();
        for (String str : rawMeals) {

            if (str.equals(validFood)) {
                return true;
            }
        }
        return false;

    }


    public static void validityFoodCheck() throws IOException {
        while (!isValidFood(FileHandler.getforFoodValidation())) {
            System.out.println("No such a food on the menu. Please choose a valid food.");
        }

    }

    public static int foodAmountOrder() {

        Scanner sc = new Scanner(System.in);


        System.out.println("How many dose do u want?");
        foodAmount = sc.nextInt();
        //System.out.println(foodAmount);
        return foodAmount;
    }

    public static boolean validAmountFoodOrder() throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputFoodName = foodName;
        int inputAmount = foodAmountOrder();
        if (inputAmount == 0) {
            System.out.println("Sorry, did you change your mind, or why did you say 0?\n");
            return false;
        }

        for (Meal food : StorageController.getMeals()) {
            if ((food.getName().equals(inputFoodName))) {
                if (food.getAmount() == 0) {
                    System.out.println("Sorry, but we run out of " + food.getName() + ". Please pick an another!\n");
                    validityFoodCheck();
                    return false;
                }
                if (food.getAmount() < inputAmount) {
                    System.out.println("We have only " + food.getAmount() + " dose of " + inputFoodName + ". Please change " +
                            "an another food or I can bring only " + food.getAmount() + " dose of " + inputFoodName + ".");
                    System.out.println("If enough please say: \"enough\", if you want to change say \"change\" .");

                    String answear = sc.nextLine();
                    if (answear.toLowerCase().equals("enough")) {
                        foodAmount = food.getAmount();
                        // System.out.println(getFoodAmount());
                        return true;
                    } else if ((answear.toLowerCase().equals("change"))) {
                        validityFoodCheck();
                        return false;
                    } else {
                        System.out.println("Sorry, what? I guess it was a change. So what do you wish?\n");
                        validityFoodCheck();
                        return false;
                    }


                }

            }

        }
        return true;
    }


    public static void validityFoodAmountCheck() throws IOException {
        while (!validAmountFoodOrder()) {
            //Ha ezt kiszedem, akkor a "change" után a egyből levonja a következő ételből a rendelés számot
            //és akár minuszba is átmegy, szóval nem fölösleges függvény ez.
        }

    }

    public static void moreFoodOrder() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean order = false;
        while (!order) {
            order = true;
            System.out.println("Do you wish anything else?(Yes/No)");
            String answear =sc.nextLine();
            if (answear.toLowerCase().equals("yes") || answear.toLowerCase().equals("y") ) {
                validityFoodCheck();
                validityFoodAmountCheck();
                StorageController.meal(getFoodName());
                StorageController.kitchenTool(Table.getFoodAmount(),0);
                order=false;
            }
        }

    }

    public static String drinkTypeOrder() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Here is the drink-menu:");
        // System.out.println();
        for (Drink str : FileHandler.readAllDrinks()) {
            System.out.println("-" + str.getName());
        }
        System.out.println();
        System.out.println("What do you want to drink?");
        drinkName = sc.nextLine().toLowerCase();
        // System.out.println(drinkName);

        return drinkName;
    }

    public static boolean isValidDrink(List<String> rawDrink) throws IOException {
        String validDrink = drinkTypeOrder();
        for (String str : rawDrink) {

            if (str.equals(validDrink)) {
                return true;
            }
        }
        return false;

    }


    public static int drinkAmountOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many dose do u want?");
        drinkAmount = sc.nextInt();
        // System.out.println(drinkAmount);
        return drinkAmount;
    }

    public static boolean validAmountDrinkOrder() throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputDrinkName = drinkName;
        int inputAmount = drinkAmountOrder();
        if (inputAmount == 0) {
            System.out.println("Sorry, did you change your mind, or why did you say 0?");
            return false;
        }

        for (Drink drink : StorageController.getDrinks()) {
            if ((drink.getName().equals(inputDrinkName))) {
                if (drink.getAmount() == 0) {
                    System.out.println("Sorry, but we run out of " + drink.getName() + ". Please pick an another!\n");
                    validityDrinkCheck();
                    return false;
                }
                if (drink.getAmount() < inputAmount) {
                    System.out.println("We have only " + drink.getAmount() + " dose of " + inputDrinkName + ". Please change " +
                            "an another drink or I can bring only " + drink.getAmount() + " dose of " + inputDrinkName + ".");
                    System.out.println("If enough please say: \"enough\", if you want to change say \"change\" .");

                    String answear = sc.nextLine();
                    if (answear.toLowerCase().equals("enough")) {
                        drinkAmount = drink.getAmount();
                        //  System.out.println(getDrinkAmount());
                        return true;
                    } else if ((answear.toLowerCase().equals("change"))) {
                        validityDrinkCheck();
                        return false;
                    } else {
                        System.out.println("Sorry, what? I guess it was a change. So what do you wish?\n");
                        validityDrinkCheck();
                        return false;
                    }


                }

            }

        }
        return true;
    }

    public static void validityDrinkCheck() throws IOException {
        while (!isValidDrink(FileHandler.getforDrinksValidation())) {
            System.out.println("No such a drink on the menu. Please choose a valid drink.");
        }

    }

    public static void validityDrinkAmountCheck() throws IOException {
        while (!validAmountDrinkOrder()) {
            //Ha ezt kiszedem, akkor a "change" után a egyből levonja a következő ételből a rendelés számot
            //és akár minuszba is átmegy, szóval nem fölösleges függvény ez.
        }

    }

    public static void moreDrinkOrder() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean order = false;
        while (!order) {
            order = true;
            System.out.println("Do you wish anything else?(Yes/No)");
            String answear =sc.nextLine();
            if (answear.toLowerCase().equals("yes") || answear.toLowerCase().equals("y") ) {
                validityDrinkCheck();
                validityDrinkAmountCheck();
                StorageController.drink(getDrinkName());
                StorageController.kitchenTool(Table.getFoodAmount(),Table.getDrinkAmount());
                order=false;
            }
        }

    }


    public static int getFoodAmount() {
        return foodAmount;
    }


    public static String getFoodName() {
        return foodName;
    }

    public static int getDrinkAmount() {
        return drinkAmount;
    }

    public static String getDrinkName() {
        return drinkName;
    }
}
