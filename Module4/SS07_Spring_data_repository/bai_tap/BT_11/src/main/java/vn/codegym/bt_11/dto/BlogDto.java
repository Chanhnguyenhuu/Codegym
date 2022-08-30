package vn.codegym.bt_11.dto;

import org.springframework.format.annotation.DateTimeFormat;
import vn.codegym.bt_11.model.Category;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BlogDto {
    private int id;
    @NotBlank
    @Size(max = 5, min = 45, message = "Tên nhập không đúng")
    private String name;
    private String writer;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private String date;
    private String content;
    private Category category;

    public BlogDto() {
    }

    public BlogDto(int id, String name, String writer, String date, String content, Category category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.date = date;
        this.content = content;
        this.category = category;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
