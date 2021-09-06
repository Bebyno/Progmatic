package storage;

public class KitchenTool extends StorageElement {

    private double usedPerFood;
    private double usedPerDrink;

    public KitchenTool(String name, int amount) {
        super(name, amount);
    }

    public void initializeUsage(double usedPerFood, double usedPerDrink) {
        this.usedPerFood = usedPerFood;
        this.usedPerDrink = usedPerDrink;
    }


    public boolean hasEnoughFor(double foodAmount, double drinkAmount) {
        return this.amount >= foodAmount * usedPerFood + drinkAmount * usedPerDrink;
    }

    public void removeFor(double foodAmount, double drinkAmount) {
        this.amount -= Math.ceil(foodAmount * usedPerFood) + Math.ceil(drinkAmount * usedPerDrink);
    }

}
