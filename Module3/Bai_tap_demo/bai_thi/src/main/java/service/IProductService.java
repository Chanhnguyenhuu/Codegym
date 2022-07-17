package service;

import model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void edit(Product product);

    void delete(int id);

    void create(Product product);

    Product findById(int id);
}
