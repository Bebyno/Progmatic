package hu.SourceSCOde.ChefTools.Ingredients;

public class Water extends Ingredient {


    public Water(int quantity, String MEASURE) {
        super(quantity, MEASURE, new String[] {"raw", "cooked"});
        setBitter(0d);
        setHot(0d);
        setSalty(0.0000000);
        setSour(0d);
        setSweet(0d);
    }
}
