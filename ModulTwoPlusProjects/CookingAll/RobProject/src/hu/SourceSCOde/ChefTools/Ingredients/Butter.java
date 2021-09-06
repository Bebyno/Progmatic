package hu.SourceSCOde.ChefTools.Ingredients;

public class Butter extends Ingredient{

    public Butter(int quantity, String MEASURE) {
        super(quantity, MEASURE, new String[] {"raw", "cooked"});
        setBitter(0);
        setHot(0);
        setSalty(0.05);
        setSour(0);
        setSweet(0);
    }
}
