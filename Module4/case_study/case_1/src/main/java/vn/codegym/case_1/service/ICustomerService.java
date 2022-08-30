package vn.codegym.case_1.service;

import vn.codegym.case_1.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    void delete(Long id);
}
