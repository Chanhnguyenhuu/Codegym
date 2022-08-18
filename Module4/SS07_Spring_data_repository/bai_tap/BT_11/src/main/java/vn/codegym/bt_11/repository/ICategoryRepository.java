package vn.codegym.bt_11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.bt_11.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
