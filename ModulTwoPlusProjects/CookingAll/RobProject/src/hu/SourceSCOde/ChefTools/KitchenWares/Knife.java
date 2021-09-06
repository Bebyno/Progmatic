package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;
import hu.SourceSCOde.ChefTools.Ingredients.Onion;

import java.util.Locale;

public class Knife extends KitchenWare{

    /**
     * Kést nem használunk vágódeszka nélkül.
     */

    private CuttingBoard cuttingBoard;

    public Knife(CuttingBoard cuttingBoard) {
        super("clean");
        this.cuttingBoard = cuttingBoard;
    }

    public CuttingBoard getCuttingBoard() {
        return cuttingBoard;
    }

    public void setCuttingBoard(CuttingBoard cuttingBoard) {
        this.cuttingBoard = cuttingBoard;
    }

    /**
     * A vágódeszkán található hozzávalókat összevágjuk.
     */

    public void process(){
        this.setStatus("In Use");
        Ingredient ing = cuttingBoard.getIngredient();
        ing.setStateIndex(ing.getStateIndex() + 1);
    }
}
