package repository;

import model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryRepository{

    public static final String FIND_ALL_CATEGORY = "SELECT * FROM category;";
    public static final String FIND_BY_ID_CATEGORY = "SELECT * FROM category WHERE id_category = ?;";

    private final String URL = "jdbc:mysql://localhost:3306/test";
    private final String USER_NAME = "root";
    private final String PASSWORD = "12345678";

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

    @Override
    public List<Category> findAll() {

        List<Category> categoryList = new ArrayList<>();
        try (PreparedStatement statement = getConnection().prepareStatement(FIND_ALL_CATEGORY)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id_category = resultSet.getInt("id_category");
                String name_category = resultSet.getString("name_category");
                Category category = new Category(id_category, name_category);
                categoryList.add(category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return categoryList;

    }

    @Override
    public Category findById(int id) {

        Category category = null;
        try (PreparedStatement statement = getConnection().prepareStatement(FIND_BY_ID_CATEGORY)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id_category = resultSet.getInt("id_category");
                String name_category = resultSet.getString("name_category");
                category = new Category(id_category, name_category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return category;

    }
}
