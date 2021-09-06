package Ingredients;

public class Ingredient  {
    private boolean cooked = false;
    private final String NAME;
    private int piece;

    public Ingredient(String name, int piece) {
        this.NAME = name;
        this.piece = piece;

    }

    public Ingredient(String NAME) {
        this.NAME = NAME;
    }

    public String getNAME() {
        return NAME;
    }


    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = true; // ha egyszer meghámoztuk már nem lehet visszafordítani
    }
    @Override
    public String toString(){
        return getNAME();
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }



}
