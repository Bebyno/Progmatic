package Ingredients.General;

import Ingredients.vegetables.Ingredient;

public class Liquid extends Ingredient {
    private boolean isHeated = false;

    public Liquid(String name) {
        super(name);
    }

    public boolean isHeated() {
        return isHeated;
    }

    public void setHeated(boolean heated) {
        isHeated = heated;
    }

    @Override
    public String toString() {
        return (isHeated ? "heated " : "not heated ") +getName();
    }
}
