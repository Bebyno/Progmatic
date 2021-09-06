import controller.StorageController;
import controller.TableController;
import utils.FileHandler;
import java.io.IOException;

public class Restaurant {
    private StorageController storageController;
    private TableController tableController;

    public void startDay() throws IOException {
        storageController = new StorageController();
        fillStorage();

        tableController = new TableController(storageController);

        tableController.addTable();
        tableController.addTable();

        storageController.kitchenToolsHandling();
        tableController.tableHandler();
    }

    private void fillStorage() throws IOException {
        storageController.setDrinks(FileHandler.readAllDrinks());
        storageController.setMeals(FileHandler.readAllMeals());
        storageController.setKitchenTools(FileHandler.readAllKitchenTools());
    }


    public static void main(String[] args) throws IOException {
        Restaurant restaurant = new Restaurant();
        restaurant.startDay();
    }
// double to int ahol nem szükséges a d.
}

