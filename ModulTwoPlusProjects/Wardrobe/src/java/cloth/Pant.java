package cloth;

import clothAttribute.PantLongness;
import clothAttribute.Quality;
import clothAttribute.Wearer;

public class Pant extends Cloth {
    private PantLongness longness;

    public Pant(Wearer wearer, Quality quality, PantLongness longness) {
        super(wearer, quality);
        this.longness = longness;
    }

    @Override
    public String type() {
        return "nadrág";
    }
}
