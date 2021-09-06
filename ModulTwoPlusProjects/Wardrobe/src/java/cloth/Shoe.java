package cloth;

import clothAttribute.Quality;
import clothAttribute.Wearer;

public class Shoe extends Cloth {
    private int size;

    public Shoe(Wearer wearer, Quality quality, int size) {
        super(wearer, quality);
        this.size = size;
    }

    @Override
    public String type() {
        return "cipő";
    }
}
