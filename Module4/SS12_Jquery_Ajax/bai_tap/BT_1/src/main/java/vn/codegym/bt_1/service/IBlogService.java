package vn.codegym.bt_1.service;

import vn.codegym.bt_1.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    void create(Blog blog);
    void update(Blog blog);
    Optional<Blog> findById(int id);
    void delete(int id);
}
