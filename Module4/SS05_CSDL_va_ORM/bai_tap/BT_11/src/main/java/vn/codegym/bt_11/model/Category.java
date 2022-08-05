package vn.codegym.bt_11.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameCategory;

    @OneToMany(mappedBy = "category")
    private Set<Song> song;

    public Category() {
    }

    public Category(int id, String nameCategory) {
        this.id = id;
        this.nameCategory = nameCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Set<Song> getSong() {
        return song;
    }

    public void setSong(Set<Song> song) {
        this.song = song;
    }
}
