package vn.codegym.bt_11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.bt_11.model.Blog;


public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
