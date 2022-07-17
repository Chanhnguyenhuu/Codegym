package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    void edit(Product product);

    void delete(int id);

    void create(Product product);

    Product findById(int id);
}
