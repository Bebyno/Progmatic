package cloth;

import clothAttribute.JacketStyle;
import clothAttribute.Quality;
import clothAttribute.Wearer;

public class Jacket extends Cloth {

    private JacketStyle style;

    public Jacket(Wearer wearer, Quality quality, JacketStyle style) {
        super(wearer, quality);
        this.style = style;
    }

    @Override
    public String type() {
        return "kabát";
    }
}
