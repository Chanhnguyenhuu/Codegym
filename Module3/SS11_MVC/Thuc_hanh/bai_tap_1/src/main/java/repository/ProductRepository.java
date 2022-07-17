package repository;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    public static final String SELECT_FROM_PRODUCT = "select * from product";
    public static final String URL = "jdbc:mysql://localhost:3306/product_manager";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "12345678";
    private static List<Product> productList;

//    static {
//        productList = new ArrayList<>();
//        productList.add(new Product(1, "A", 5000.0, "a", "China"));
//        productList.add(new Product(2, "B", 5000.0, "b", "Viet Nam"));
//        productList.add(new Product(3, "C", 5000.0, "c", "Japan"));
//        productList.add(new Product(4, "D", 5000.0, "d", "Korea"));
//    }

    private Connection getConnection() {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    @Override
    public List<Product> findAll() {
        List<Product> listProduct = new ArrayList<>();
        ResultSet resultSet = null;
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(SELECT_FROM_PRODUCT);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String status = resultSet.getString("status");
                String manufacturer = resultSet.getString("manufacturer");
                listProduct.add(new Product(id, name, price, status,manufacturer));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listProduct;
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
