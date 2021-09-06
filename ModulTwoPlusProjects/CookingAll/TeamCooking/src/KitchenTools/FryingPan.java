package KitchenTools;

import Ingredients.Dairis.Egg;

import Ingredients.Ingredient;
import Ingredients.Liquids.Liquid;



public class FryingPan extends KitchenTools{

    private String[] fryingPanArray = new String[5];
    private boolean cooked = false;
    private Ingredient[] foodInPan = new Ingredient[0];

    public void PanArray(Bowl bowl) {
        foodInPan = new Ingredient[bowl.getIngredients().length];
        for (int i = 0; i < bowl.getIngredients().length; i++) {
            foodInPan[i] = bowl.getIngredients()[i];
        }
        bowl.setIngredients(new Ingredient[0]);
    }

    public boolean cracked(Egg egg){ // átállítjuk a tojás állapotát true-ra azaz feltörjük

        return !egg.isCracked();
    }

    public String cracking(Egg egg){ //  ha az álapot true akkor kiírjuk
        String crack= "";
        if(cracked(egg)){
            crack ="The egg is cracked";
        }
        return crack;
    }
    public boolean poured(Liquid liquid){
        return !liquid.isPoured();
    }
    public String pouring(Liquid liquid){
        String pouring= "";
        if(poured(liquid)){
            pouring ="The "+ liquid.getNAME() +" is poured";
        }
        return pouring;
    }


    // ez a végső összefőzés metódusa, ha minden a serpenyőben van (tömb==11) akkor kész az étel
    public boolean done(Bowl bowl){

        if(bowl.getIngredients().length == 0){ // ha a tál üres, tehát 0 akkor kész a kaja mert benne van a serpenyőbe
            cooked = true;

        }
        return cooked;

    }



    public String foodReady(Bowl bowl){
        String finished = "";
        if(done(bowl)){
            finished ="The vegan pancake is done.";
        }
        return finished;
    }





    public String[] getfryingPanArray() {
        return fryingPanArray;
    }

    public void setfryingPanArray(String[] bowlArray) {
        this.fryingPanArray = bowlArray;
    }

    public Ingredient[] getFoodInPan() {
        return foodInPan;
    }

    public void setFoodInPan(Ingredient[] foodInPan) {
        this.foodInPan = foodInPan;
    }
}
