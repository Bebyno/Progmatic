package cloth;

import clothAttribute.Quality;
import clothAttribute.Wearer;

public class TShirt extends Cloth {
    private String color;
    private String design;

    public TShirt(Wearer wearer, Quality quality, String color, String design) {
        super(wearer, quality);
        this.color = color;
        this.design = design;
    }

    @Override
    public String type() {
        return "póló";
    }
}
