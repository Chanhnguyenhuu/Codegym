package vn.codegym.bt_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.bt_1.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
