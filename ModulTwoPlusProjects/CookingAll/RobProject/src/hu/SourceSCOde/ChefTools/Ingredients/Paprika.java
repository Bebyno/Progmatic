package hu.SourceSCOde.ChefTools.Ingredients;

public class Paprika extends Ingredient {
    public Paprika(int quantity, String MEASURE) {
        super(quantity, MEASURE, new String[] {"raw", "washed", "cutted", "cooked"});
        setBitter(0.025);
        setHot(0.05);
        setSalty(0);
        setSour(0.05);
        setSweet(0.10);
    }
}
