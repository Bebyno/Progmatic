package KitchenTools;

import Ingredients.Solids.Solids;
import Spices.Spices;

public class Spoon extends KitchenTools{


    public boolean spreaded(Spices spices){

        return !spices.isSpices();
    }

    public String spreading(Spices spices){
        String spice= "";
        if(spreaded(spices)){
            spice ="spreaded";
        }
        return spice;
    }

    public boolean sprinkled(Solids solid){

        return !solid.isSprinkled();
    }

    public String sprinkling(Solids solid){
        String sprinkle= "";
        if(sprinkled(solid)){
            sprinkle ="sprinkled";
        }
        return sprinkle;
    }



}
