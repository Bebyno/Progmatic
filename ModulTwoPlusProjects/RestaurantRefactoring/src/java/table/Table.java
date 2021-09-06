package table;

import controller.StorageController;
import storage.Drink;
import storage.Meal;
import utils.FileHandler;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Table {

    private double foodAmount;
    private double drinkAmount;
    private String foodName;
    private String drinkName;
    private int limit =0;


    public String foodTypeOrder() throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Here is the food-menu:");
        for (Meal str : FileHandler.readAllMeals()) {
            System.out.println("-" + str.getName());
        }
        System.out.println();
        System.out.println("What do you want to eat?");
        foodName = sc.nextLine().toLowerCase();
        return foodName;
    }

    public boolean isValidFood(List<String> rawMeals) throws IOException {
        String validFood = foodTypeOrder();
        for (String str : rawMeals) {
            if (str.toLowerCase().equals(validFood)) {
                return true;
            }
        }
        return false;
    }

    public void validityFoodCheck() throws IOException {
        while (!isValidFood(FileHandler.getforFoodValidation())) {
            System.out.println("No such a food on the menu. Please choose a valid food.");
        }
    }

    public double foodAmountOrder() {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many dose do u want?");
        foodAmount = sc.nextDouble();
        return foodAmount;
    }


    public boolean validAmountFoodOrder(StorageController storage) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputFoodName = foodName;
        double inputAmount = foodAmountOrder();          // casting double to int !!
        if (inputAmount == 0) {
            System.out.println("Sorry, did you change your mind, or why did you say 0?\n");
            return false;
        }
        if (!(inputAmount % 1 == 0)) {
            System.out.println("Sorry, only whole doses!");
            return false;
        }


        for (Meal food : storage.getMeals()) {
            if ((food.getName().toLowerCase().equals(inputFoodName))) {
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


    public void validityFoodAmountCheck(StorageController storage) throws IOException {
        while (!validAmountFoodOrder(storage)) {
        }
    }

    public String drinkTypeOrder() throws IOException {
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

    public boolean isValidDrink(List<String> rawDrink) throws IOException {
        String validDrink = drinkTypeOrder();
        for (String str : rawDrink) {
            if (str.toLowerCase().equals(validDrink)) {
                return true;
            }
        }
        return false;
    }

    public double drinkAmountOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many dose do u want?");
        drinkAmount = sc.nextDouble();
        // System.out.println(drinkAmount);
        return drinkAmount;
    }

    public boolean validAmountDrinkOrder(StorageController storage) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputDrinkName = drinkName;
        double inputAmount = drinkAmountOrder();
        if (inputAmount == 0) {
            System.out.println("Sorry, did you change your mind, or why did you say 0?");
            return false;
        }
        if (!(inputAmount % 1 == 0)) {
            System.out.println("Sorry, only whole doses!");
            return false;
        }

        for (Drink drink : storage.getDrinks()) {
            if ((drink.getName().toLowerCase().equals(inputDrinkName))) {
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

    public void validityDrinkCheck() throws IOException {
        while (!isValidDrink(FileHandler.getforDrinksValidation())) {
            System.out.println("No such a drink on the menu. Please choose a valid drink.");
        }
    }

    public void validityDrinkAmountCheck(StorageController storage) throws IOException {
        while (!validAmountDrinkOrder(storage)) {
        }

    }

    public boolean anythingElse(String what) throws IOException {
        Scanner sc = new Scanner(System.in);
        String answear = "No";
        limit++;
        if(limit <4) {
            System.out.println("Do you wish to order more " + what + "?(Yes/No)");
            answear = sc.nextLine();
        }else{System.out.println("\nAs this is a table for 4 people I will not take any more "+ what+ " orders.\n");}

        if (answear.toLowerCase().equals("yes") || answear.toLowerCase().equals("y") && limit<4){

            return false;
        }else if(answear.toLowerCase().equals("no") || answear.toLowerCase().equals("n")){
        limit = 0;
        return true;}
        System.out.println("Sorry? I guess it was a no!\n");
        limit = 0;
        return true;
    }


    public double getFoodAmount() {
        return foodAmount;
    }


    public String getFoodName() {
        return foodName;
    }

    public double getDrinkAmount() {
        return drinkAmount;
    }

    public String getDrinkName() {
        return drinkName;
    }
}
