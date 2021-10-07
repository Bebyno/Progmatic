package model;

import enums.Color;

public class Sablon {
    private Integer sablonID;
    private String blogSablonName;
    private String category;
    private Color color;
    private Integer whosBlogId;

    public Sablon(Integer sablonID, String blogSablonName, String category, Color color) {
        this.sablonID = sablonID;
        this.blogSablonName = blogSablonName;
        this.category = category;
        this.color = color;
       // this.whosBlogId = whosBlogId;
    }
}
