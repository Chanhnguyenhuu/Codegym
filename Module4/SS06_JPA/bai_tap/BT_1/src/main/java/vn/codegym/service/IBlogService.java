package vn.codegym.service;

import vn.codegym.model.Blog;

import java.util.List;

public interface IBlogService {
    void create(Blog blog);
    List<Blog> findAll();
    void edit(Blog blog);
    void delete(int id);
}
