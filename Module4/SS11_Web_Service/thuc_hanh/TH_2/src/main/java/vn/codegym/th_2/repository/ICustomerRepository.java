package vn.codegym.th_2.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.th_2.model.Customer;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
