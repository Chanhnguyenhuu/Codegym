package repository;

import model.Category;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static final String UPDATE_PRODUCT = "UPDATE product SET name = ?, price = ?, quantity = ?, color = ?, descri = ?, id_category = ? WHERE id = ?";
    private ICategoryRepository categoryRepository = new CategoryRepository();

    public static final String CREATE_PRODUCT = "INSERT INTO product (id_category, name, price, quantity, color, descri) VALUE (?,?,?,?,?,?);";
    public static final String FIND_BY_ID = "SELECT * FROM product WHERE id = ?;";
    private final String FIND_ALL_SQL = "select * from product p inner join category c on p.id_category = c.id_category;";
    public static final String DELETE = "DELETE FROM product WHERE id = ?;";

    private final String URL = "jdbc:mysql://localhost:3306/product_bt2";
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
                int id_category = resultSet.getInt("id_category");
                String name_category = resultSet.getString("name_category");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String describe = resultSet.getString("descri");
                Category category = new Category(id_category, name_category);
                Product product = new Product(id, name, price, amount, color, describe, category);
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
    public void create(Product product) {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(CREATE_PRODUCT)) {
            statement.setString(2, product.getName());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getAmount());
            statement.setString(5, product.getColor());
            statement.setString(6, product.getDescribe());
            statement.setInt(1, product.getCategory().getId());
            statement.executeUpdate();
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

    @Override
    public void update(Product product) {
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT)) {
                statement.setString(1,product.getName());
                statement.setDouble(2,product.getPrice());
                statement.setInt(3, product.getAmount());
                statement.setString(4, product.getColor());
                statement.setString(5, product.getDescribe());
                statement.setInt(6, product.getCategory().getId());
                statement.setInt(7, product.getId());
                statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try (PreparedStatement statement = getConnection().prepareStatement(FIND_BY_ID)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                int id_category = resultSet.getInt("id_category");
                //String name_category = resultSet.getString("name_category");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String describe = resultSet.getString("descri");
                Category category = categoryRepository.findById(id_category);
                product = new Product(id, name, price, amount, color, describe, category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return product;
    }
}

