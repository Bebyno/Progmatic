package clothAttribute;

public enum Quality {

    BEST(1),
    GOOD(2),
    MEDIUM(3),
    BAD(4),
    CRAP(5);

    public final int NUMBER;


    Quality(int number){
        this.NUMBER = number;

    }
}
