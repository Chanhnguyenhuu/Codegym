package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "A", 5000.0, "a", "China"));
        productList.add(new Product(2, "B", 5000.0, "b", "Viet Nam"));
        productList.add(new Product(3, "C", 5000.0, "c", "Japan"));
        productList.add(new Product(4, "D", 5000.0, "d", "Korea"));
    }


    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public void update(int id, Product product) {
        productList.add(id, product);
    }

    @Override
    public void delete(int id) {
        for (Product product: productList) {
            if (product.getId() == id) {
                productList.remove(product);
                break;
            }
        }
    }

    @Override
    public Product viewProduct(int id) {
        for (Product product: productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public Product findById(int id) {
        for (Product product: productList) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }
}
