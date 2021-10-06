package model;

import enums.Color;

public class Platform {
    private Integer id;
    private String category;
    private String tittle;
    private Color color;

    private String comments;

    public Platform(Integer id, String category, String tittle, Color color) {
        this.id = id;
        this.category = category;
        this.tittle = tittle;
        this.color = color;
    }

    public Platform(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
