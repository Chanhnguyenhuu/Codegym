package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    void create(Product product);

    void delete(int id);

    void update(Product product);

    Product findById(int id);
}
