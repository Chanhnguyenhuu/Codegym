package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void create(Product product);
    void update(int id, Product product);
    void delete(int id);
    Product viewProduct(int id);
    Product findByName(String name);
    Product findById(int id);
    void save(Product product);
}
