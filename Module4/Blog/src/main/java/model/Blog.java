package model;

public class Blog {
    private Integer id;
    private Integer writerID;
    private String writerText;
    private String title;

    private String comments;

    public Blog(Integer id, String text,String title, Integer writerID) {
        this.id = id;
        this.writerText = text;
        this.title = title;
        this.writerID = writerID;
    }

    public Blog(Integer id, String title, Integer writerID) {
        this.id = id;
        this.title = title;
        this.writerID = writerID;
    }

    public Blog(String category) {
        this.writerText = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWriterText() {
        return writerText;
    }

    public void setWriterText(String writerText) {
        this.writerText = writerText;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public Integer getWriterID() {
        return writerID;
    }
}
