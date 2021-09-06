package KitchenTools;





public class Plate extends KitchenTools{
    private boolean served = false;



    public String foodServed(String[] FinishedCookedArray, FryingPan fryingPan){
        String finished = "";
        if(fryingPan.done(FinishedCookedArray) ){
            finished ="The omelette is served.";
        }
        return finished;
    }

}
