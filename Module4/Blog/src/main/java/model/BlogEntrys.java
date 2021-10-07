package model;

public class BlogEntrys {

private Integer entryID;
private String text;
private Integer writerID;

    public BlogEntrys(Integer entryID, String text, Integer writerID) {
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
}
