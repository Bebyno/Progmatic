package KitchenTools;

import Ingredients.General.Oil;

public class Stove extends KitchenTools{



    public boolean heated(Oil oil){

        return !oil.isHeated();
    }

    public String heating(Oil oil){
        String heating= "";
        if(heated(oil)){
            heating ="The oil is heated";
        }
        return heating;
    }

}
