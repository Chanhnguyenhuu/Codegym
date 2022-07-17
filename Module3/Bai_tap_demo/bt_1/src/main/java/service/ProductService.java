package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void create(Product product) {
        iProductRepository.create(product);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.edit(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }
}
