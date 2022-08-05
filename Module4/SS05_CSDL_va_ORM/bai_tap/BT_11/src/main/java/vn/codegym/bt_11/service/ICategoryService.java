package vn.codegym.bt_11.service;

import vn.codegym.bt_11.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();
    void create(Category category);
}
