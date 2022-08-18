package vn.codegym.bt_11.service;


import vn.codegym.bt_11.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    void create(Blog blog);
    List<Blog> findAll();
    void edit(Blog blog);
    void delete(int id);
    Optional<Blog> findById(int id);
}
