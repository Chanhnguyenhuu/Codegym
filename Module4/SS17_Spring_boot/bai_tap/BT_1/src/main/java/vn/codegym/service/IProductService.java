package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void create(Product product);
    void edit(Product product);
    void delete(int id);
}
