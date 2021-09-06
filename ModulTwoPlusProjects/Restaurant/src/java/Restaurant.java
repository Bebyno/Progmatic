import controller.StorageController;
import controller.TableController;
import table.Table;
import utils.FileHandler;

import java.io.IOException;

public class Restaurant {
    private StorageController storageController;


    public static void main(String[] args) throws IOException {
        Restaurant restaurant = new Restaurant();
        restaurant.storageController = new StorageController();

        restaurant.storageController.setDrinks(FileHandler.readAllDrinks());
        restaurant.storageController.setMeals(FileHandler.readAllMeals());
        restaurant.storageController.setKitchenTools(FileHandler.readAllKitchenTools());


       TableController.tableHandler(restaurant.storageController);

/*
javitani kell:

-Eszközök ha elfogynak fatális megoldás


 */
    }

}
