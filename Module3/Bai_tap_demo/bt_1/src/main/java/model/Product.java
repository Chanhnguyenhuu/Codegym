package model;

import java.util.Locale;

public class Product {
    private int id;
    private String category;
    private String name;
    private Double price;
    private String color;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(String category, String name, Double price, String color) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public Product(int id, String category, String name, Double price, String color) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
