package KitchenTools;

import Ingredients.Plants.Plant;


public class Knife extends KitchenTools{



    public String myKnife(){
        return " sharp knife";
    }

    public boolean chopping(Plant plant){

        return !plant.isChopped();
         }

    public String chopp(Plant plant){
        String cuttinString= "";
        if(chopping(plant)){
            cuttinString ="chopped";
        }
        return cuttinString;
    }

    public boolean peel(Plant plant){

        return !plant.isPeel();
    }

    public String peeling(Plant plant){
        String peelingString= "";
        if(peel(plant)){
            peelingString ="peeled";
        }
        return peelingString;
    }



}
