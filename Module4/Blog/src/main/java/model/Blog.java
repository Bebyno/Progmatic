package model;

public class Blog {
    private Integer id;
    private Integer writedID;
    private String writerText;

    private String comments;

    public Blog(Integer id, String text, Integer writedID) {
        this.id = id;
        this.writerText = text;
        this.writedID = writedID;
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
}
