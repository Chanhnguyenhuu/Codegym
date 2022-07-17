package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    void create(Product product);

    void edit(Product product);

    void delete(int id);
}
