package Jeve.ingredient;

public class Ingredient {
    public static final String STATE_RAW = "Raw";
    public static final String STATE_COOKED = "Cooked";
    public static final String STATE_CUT = "Cut";
    public static final String STATE_LIQUID = "Liquid";

    protected String name;
    protected int quantity;
    protected String state = STATE_RAW;
    protected int peppery = 0;
    protected boolean clean = false;
    protected boolean toCut = true;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPeppery() {
        return peppery;
    }

    public void setPeppery(int peppery) {
        this.peppery = peppery;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isToCut() {
        return toCut;
    }

    public void setToCut(boolean needToCut) {
        this.toCut = needToCut;
    }
}
