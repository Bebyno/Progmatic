package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;

public class FirePlace extends KitchenWare{

    /**
     * A serpenyőben lévő dolgokat tudjuk megfőzni a tűzhelyen.
     */

    private Pan pan;

    public FirePlace(Pan pan) {
        super("clean");
        this.pan = pan;
    }

    public Pan getPan() {
        return pan;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }


}
