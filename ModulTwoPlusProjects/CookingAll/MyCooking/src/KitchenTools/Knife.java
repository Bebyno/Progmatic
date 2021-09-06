package KitchenTools;

import Ingredients.vegetables.Vegetables;

public class Knife extends KitchenTools{



    public String myKnife(){
        return " sharp knife";
    }

    public boolean chopping(Vegetables vegetables){

        return !vegetables.isChopped();
         }

    public String chopp(Vegetables vegetables){
        String cuttinString= "";
        if(chopping(vegetables)){
            cuttinString ="chopped";
        }
        return cuttinString;
    }



}
