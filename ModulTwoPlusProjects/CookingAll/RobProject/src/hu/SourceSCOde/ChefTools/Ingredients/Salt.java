package hu.SourceSCOde.ChefTools.Ingredients;

public class Salt extends Spice{
    public Salt(int quantity, String MEASURE) {
        super(quantity, MEASURE);
        setBitter(0);
        setHot(0);
        setSalty(1);
        setSour(0);
        setSweet(0);
    }
}
