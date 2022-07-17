package service;

import model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void create(Product product);

    void delete(int id);

    void update(Product product);

    Product findById(int id);
}

