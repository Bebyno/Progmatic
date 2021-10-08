package model;

public class Comment {
    // is it necessery?

private Integer commentID;
private Integer PplcommentID;
private String commentText;


    public Comment(Integer commentID, Integer pplcommentID, String commentText) {
        this.commentID = commentID;
        PplcommentID = pplcommentID;
        this.commentText = commentText;
    }

    public Comment(String commentText) {
        this.commentText = commentText;
    }

    public Integer getCommentID() {
        return commentID;
    }

    public Integer getPplcommentID() {
        return PplcommentID;
    }

    public String getCommentText() {
        return commentText;
    }
}
