package model;

public class Comment {

private Integer commentID;
private Integer PplcommentID;
private String commentText;


    public Comment(Integer commentID, Integer pplcommentID, String commentText) {
        this.commentID = commentID;
        this.PplcommentID = pplcommentID;
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
