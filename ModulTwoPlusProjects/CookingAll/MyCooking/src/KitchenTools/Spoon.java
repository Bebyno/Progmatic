package KitchenTools;

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


}
