package model;

public class BlogEntry {

private Integer entryID;
private String text;
private Integer writerID;

    public BlogEntry(Integer entryID, String text, Integer writerID) {
        this.entryID = entryID;
        this.text = text;
        this.writerID = writerID;
    }

    public Integer getEntryID() {
        return entryID;
    }

    public String getText() {
        return text;
    }

    public Integer getWriterID() {
        return writerID;
    }

    public void setText(String text) {
        this.text = text;
    }
}
