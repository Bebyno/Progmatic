package Ingredients.vegetables;

public class Ingredient {
    private boolean cooked = false;

    private final String NAME;

    public Ingredient(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }

    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }

    @Override
    public String toString() {
        return (cooked ? "cooked " : "not cooked ") + NAME;
    }
}
