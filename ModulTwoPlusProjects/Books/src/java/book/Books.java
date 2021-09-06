package book;

import java.util.List;

public class Books {
    private String category;
    private List<String> autors;
    private String title;
    private String publisher;
    private int published;
    private String bookcode;

    public Books(){};

    public Books(String category, List<String> autors, String title, String publisher, int published, String bookcode) {
        this.category = category;
        this.autors = autors;
        this.title = title;
        this.publisher= publisher;
        this.published = published;
        this.bookcode = bookcode;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getAutors() {
        return autors;
    }

    public void setAutors(List<String> autors) {
        this.autors = autors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }
}
