package controller;


import table.Table;

import java.io.IOException;
import controller.StorageController;

public class TableController {

    /**
     * TableController class shall be used to control our customer requests for each table
     * Shall cooperate with the StorageController
     */

    public static void tableHandler(StorageController storageController) throws IOException {
// bementi paraméter StorageController storageController)
        int tableLimit = 2;
        int currentTable = 0;
     while(currentTable <tableLimit){
         currentTable++;

        Table.validityFoodCheck();
         Table.validityFoodAmountCheck();
         StorageController.meal(Table.getFoodName());
         StorageController.kitchenTool(Table.getFoodAmount(),0);
         Table.moreFoodOrder();
         Table.validityDrinkCheck();
         Table.validityDrinkAmountCheck();
         StorageController.drink(Table.getDrinkName());
         StorageController.kitchenTool(Table.getFoodAmount(),Table.getDrinkAmount());
         Table.moreDrinkOrder();
        // StorageController.kitchenTool(Table.getFoodAmount(),Table.getDrinkAmount());
         //StorageController.areEnoughKitchenTools(StorageController.kitchenTool.getFoodAmount(),Table.getDrinkAmount());

         System.out.println(currentTable == tableLimit ? "No more table!\n" : ("We have " + (tableLimit-currentTable)+ " free table left.\n"));

     }

    }


}
