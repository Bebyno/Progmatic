package KitchenTools;

import Ingredients.Liquids.Liquid;

public class Stove extends KitchenTools{



    public boolean heated(Liquid liquid){

        return !liquid.isHeated();
    }

    public String heating(Liquid liquid){
        String heating= "";
        if(heated(liquid)){
            heating ="The " + liquid.getNAME() + " is heated";
        }
        return heating;
    }

}
