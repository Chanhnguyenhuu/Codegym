package vn.codegym.case_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.case_2.model.CustomerType;

@Repository
public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
