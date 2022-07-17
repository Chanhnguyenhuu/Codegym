package repository;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    public static final String CREATE_PRODUCT = "INSERT INTO product (name, price, color) VALUES (?, ?, ?);";
    public static final String DELETE = "DELETE FROM product WHERE id = ?;";
    public static final String UPDATE_PRODUCT = "UPDATE product SET name = ?, price = ?, color = ? WHERE id = ?;";
    public static final String FIND_BY_ID = "SELECT * FROM product p inner join categogy c on p.id_categogy = c.id_categogy WHERE id = ?;";
    private final String FIND_ALL_SQL = "select * from product p inner join categogy c on p.id_categogy = c.id_categogy;";

    private final String URL = "jdbc:mysql://localhost:3306/product_manager";
    private final String USER_NAME = "root";
    private final String PASSWORD = "12345678";
    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();

        try (PreparedStatement statement = getConnection().prepareStatement(FIND_ALL_SQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String category = resultSet.getString("name_category");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                String color = resultSet.getString("color");
                Product product = new Product(id, category, name, price, color);
                productList.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        Product product = null;

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID)
        ) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                String category = resultSet.getString("name_category");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                String color = resultSet.getString("color");
                product = new Product(id, category, name, price, color);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public void create(Product product) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CREATE_PRODUCT)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getColor());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(Product product) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getColor());
            preparedStatement.setInt(4, product.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
