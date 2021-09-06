package KitchenTools;

import Ingredients.Plants.Plant;

public class Tap extends KitchenTools{

    public boolean washed(Plant plant){

        return !plant.isWashed();
    }

    public String washing(Plant plant){
        String washingString= "";
        if(washed(plant)){
            washingString ="washed";
        }
        return washingString;
    }
}
