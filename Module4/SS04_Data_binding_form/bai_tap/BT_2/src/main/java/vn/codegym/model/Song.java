package vn.codegym.model;

public class Song {
    private String name;
    private String creator;
    private String category;
    private String link;

    public Song() {
    }

    public Song(String name, String creator, String category, String link) {
        this.name = name;
        this.creator = creator;
        this.category = category;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
