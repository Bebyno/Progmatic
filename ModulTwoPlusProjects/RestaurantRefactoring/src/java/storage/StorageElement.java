package storage;

public class StorageElement {


    protected String name;
    protected double amount;


    public StorageElement(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String   getName() {
        return name;
    }


    public double getAmount() {
        return amount;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }
}
