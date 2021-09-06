package hu.SourceSCOde.ChefTools.Ingredients;

/**
 * Egyes összetevők ősosztálya.
 */

public class Ingredient {

    private int quantity;
    final String MEASURE;
    private final String[] POSSIBLE_STATES;// = {"raw", "washed", "peeled", "cutted", "cooked"};
    private int stateIndex = 0;

    //0 = 0% ; 1 = 100%
    private double salty;
    private double sweet;
    private double sour;
    private double hot;
    private double bitter;

    public Ingredient(int quantity, String MEASURE, String[] POSSIBLE_STATES) {
        this.quantity = quantity;
        this.MEASURE = MEASURE;
        this.POSSIBLE_STATES = POSSIBLE_STATES;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMEASURE() {
        return MEASURE;
    }

    public String getPossibleStates(int index) {
        return POSSIBLE_STATES[index];
    }

    public int getStateIndex() {
        return stateIndex;
    }

    public void setStateIndex(int stateIndex) {
        this.stateIndex = stateIndex;
    }

    public double getSalty() {
        return salty;
    }

    public void setSalty(double salty) {
        this.salty = salty;
    }

    public double getSweet() {
        return sweet;
    }

    public void setSweet(double sweet) {
        this.sweet = sweet;
    }

    public double getSour() {
        return sour;
    }

    public void setSour(double sour) {
        this.sour = sour;
    }

    public double getHot() {
        return hot;
    }

    public void setHot(double hot) {
        this.hot = hot;
    }

    public double getBitter() {
        return bitter;
    }

    public void setBitter(double bitter) {
        this.bitter = bitter;
    }

    public String getCurrentState() {
        return POSSIBLE_STATES[stateIndex];
    }

    public String getNextState() {
        return POSSIBLE_STATES[stateIndex + 1];
    }
}
