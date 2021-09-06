package cloth;

import clothAttribute.Quality;
import clothAttribute.SocksStyle;
import clothAttribute.Wearer;

public class Sock extends Cloth {
    private SocksStyle style;

    public Sock(Wearer wearer, Quality quality, SocksStyle style) {
        super(wearer, quality);
        this.style = style;
    }

    @Override
    public String type() {
        return "zokni";
    }
}
