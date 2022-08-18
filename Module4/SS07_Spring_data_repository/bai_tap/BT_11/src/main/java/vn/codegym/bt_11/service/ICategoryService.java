package vn.codegym.bt_11.service;

import vn.codegym.bt_11.model.Blog;
import vn.codegym.bt_11.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    void create(Category category);
    List<Category> findAll();
    void edit(Category category);
    void delete(int id);
    Optional<Category> findById(int id);
}
