package controller;


import table.Table;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TableController {
    private StorageController storageController;

    private List<Table> tables = new ArrayList<Table>();

    public TableController(StorageController storageController) {
        this.storageController = storageController;
    }

    public void addTable() {
        tables.add(new Table());
    }

    public void tableHandler() throws IOException {
        for (int currentTable = 0; currentTable < tables.size(); currentTable++) {
            Table table = tables.get(currentTable);

            do {
                table.validityFoodCheck();
                table.validityFoodAmountCheck(storageController);
                storageController.meal(table.getFoodName(), table.getFoodAmount());
            } while (!table.anythingElse("food"));

            do {
                table.validityDrinkCheck();
                table.validityDrinkAmountCheck(storageController);
                storageController.drink(table.getDrinkName(), table.getDrinkAmount());
            } while (!table.anythingElse("drink"));
            System.out.println(currentTable == tables.size() - 1 ? "No more table!\n"
                    : ("We have " + (tables.size() - 1 - currentTable) + " free table left.\n"));
        }


    }

}

