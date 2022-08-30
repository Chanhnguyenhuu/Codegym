package vn.codegym.bt_1.model;

import javax.persistence.*;

@Entity
@Table(name = "blog_manager")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String date;
    private String category;
    private String content;
    private String img;

    public Blog() {
    }

    public Blog(int id, String name, String date, String category, String content, String img) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.category = category;
        this.content = content;
        this.img = img;
    }

    public Blog(String name, String date, String category, String content, String img) {
        this.name = name;
        this.date = date;
        this.category = category;
        this.content = content;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
