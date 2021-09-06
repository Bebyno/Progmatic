package hu.SourceSCOde.ChefTools.Ingredients;

public class Tomato extends Ingredient {


    public Tomato(int quantity, String MEASURE) {
        super(quantity, MEASURE, new String[] {"raw", "washed", "cutted", "cooked"});
        setBitter(0);
        setHot(0);
        setSalty(0);
        setSour(0.03);
        setSweet(0.27);
    }
}
