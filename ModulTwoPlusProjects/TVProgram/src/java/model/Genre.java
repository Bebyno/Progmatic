package model;

public enum Genre {

    HORROR("horror"),
    SCI_FI("sci-fi"),
    CARTOON("rajzfilm"),
    PORN("pornó"),
    SITCOM("sit-com"),
    SERIES("sorozat"),
    ANIME("animáció"),
    NEWS("hír"),
    FANTASY("fantasy"),
    ACTION("akció"),
    CRIME("krimi"),
    ROMANTIC("romantikus"),
    DOCUMENTARY("ismeretterjesztő"),
    COMEDY("vígjáték"),
    DRAMA("dráma"),
    SHOW("show"),
    FAMILY("családi"),
    MUSICAL("musical"),
    OTHER("egyéb");

    private final String NAME;

    Genre(String genre) {
        this.NAME = genre;
    }

    public static Genre getGenreByNAME(String name) {
        for (Genre genre : values()) {
            if(genre.NAME.equals(name)) {
                return genre;
            }
        }
        return Genre.OTHER;
    }
}
