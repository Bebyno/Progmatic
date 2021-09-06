package KitchenTools;

import Ingredients.Dairis.Egg;

import Ingredients.General.Liquid;


public class FryingPan extends KitchenTools{

    private String[] fryingPanArray = new String[5];
    private boolean cooked = false;



    public boolean cracked(Egg egg){ //átállítjuk a tojáj állapotát true-ra, azaz feltörjük.

        return !egg.isCracked();
    }

    public String cracking(Egg egg){ // ha az állapot true akkor kiírjuk
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
            pouring ="The "+ liquid.getName() +" is poured";
        }
        return pouring;
    }
    // ez a főzés metodus, ha minden elem benne van a serpenyőben klsz a kaja
    public boolean done(String[] FinishedCookedArray){

        if(FinishedCookedArray.length == 11){
            cooked = true;

        }
        return cooked;

    }



    public String foodReady(String[] FinishedCookedArray){
        String finished = "";
        if(done(FinishedCookedArray)){
            finished ="The omelette is done.";
        }
        return finished;
    }





    public String[] getfryingPanArray() {
        return fryingPanArray;
    }

    public void setfryingPanArray(String[] bowlArray) {
        this.fryingPanArray = bowlArray;
    }
}
