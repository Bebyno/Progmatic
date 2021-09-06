package cloth;

import clothAttribute.Quality;
import clothAttribute.Wearer;

public class Shirt extends Cloth {
    private String sleeved;

    public Shirt(Wearer wearer, Quality quality, String sleeved) {
        super(wearer, quality);
        this.sleeved = sleeved;
    }

    @Override
    public String type() {
        return "ing";
    }
}
