package cloth;
import clothAttribute.Quality;
import clothAttribute.Wearer;

public abstract class Cloth {
    // private String type;  -> ez maga a class kéne hogy legyen
    private Wearer wearer;
    private Quality quality;


    public Cloth(Wearer wearer, Quality quality) {
        this.wearer = wearer;
        this.quality = quality;
    }

    public Quality getQuality() {
        return quality;
    }

    public abstract String type();
}

