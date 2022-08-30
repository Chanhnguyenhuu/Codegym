package vn.codegym.bt_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.bt_1.model.Blog;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
