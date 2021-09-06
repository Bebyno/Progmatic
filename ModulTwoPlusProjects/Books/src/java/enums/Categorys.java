package enums;

public enum Categorys {

    NOVEL("regény",1),
    EDUCATIONAL("ismeretterjesztő",2),
    CARTON("mese",3),
    ADVENTURE("kalandregény",4),
    DRAMA("romantikus",5),
    YOUTH_EDUCATIONAL("ifjúsági ismeretterjesztő",6),
    YOUTH_NOVEL("ifjúsági kisregény",7),
    SCI_FI("sci-fi",8),
    AUTOBIOGRAPHY("önéletrajzi",9),
    CRIME("krimi",10);

    public final String NAME;
    public final int NUMBER;

    Categorys(String name, int number) {
        this.NAME = name;
        this.NUMBER = number;
    }

    public String getNAME() {
        return NAME;
    }

    public int getNUMBER() {
        return NUMBER;
    }
}
