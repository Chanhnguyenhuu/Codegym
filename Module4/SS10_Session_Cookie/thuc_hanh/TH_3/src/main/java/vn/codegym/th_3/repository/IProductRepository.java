package vn.codegym.th_3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.th_3.model.Product;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
