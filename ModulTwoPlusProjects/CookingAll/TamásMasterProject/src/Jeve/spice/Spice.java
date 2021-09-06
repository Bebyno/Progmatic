package Jeve.spice;

public class Spice {
    protected String name;
    protected int quantity;
    protected int basePeppery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBasePeppery() {
        return basePeppery;
    }

    public void setBasePeppery(int basePeppery) {
        this.basePeppery = basePeppery;
    }

    public int getPepperyModifier() {
        return basePeppery * quantity;
    }

}
