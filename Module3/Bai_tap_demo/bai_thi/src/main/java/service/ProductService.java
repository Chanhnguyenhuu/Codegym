package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void edit(Product product) {
        productRepository.edit(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }
}
