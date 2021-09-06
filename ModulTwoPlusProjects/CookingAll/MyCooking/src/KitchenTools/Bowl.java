package KitchenTools;


import Ingredients.vegetables.Ingredients;

public class Bowl extends KitchenTools{
    private String current= "empty";

    private String[] bowlArray = new String[5];
    private Ingredients stirEgg;

    public Ingredients getStirEgg() {
        return stirEgg;
    }

    public void setStirEgg(Ingredients stirEgg) {
        this.stirEgg = stirEgg;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String[] getBowlArray() {
        return bowlArray;
    }

    public void setBowlArray(String[] bowlArray) {
        this.bowlArray = bowlArray;
    }
}
