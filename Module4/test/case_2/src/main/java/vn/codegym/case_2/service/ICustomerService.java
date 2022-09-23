package vn.codegym.case_2.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_2.model.Customer;

public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findAllByCustomerNameContaining(String name, Pageable pageable);

    Page<Customer> findAllByCustomerGenderContaining(String value, Pageable pageable);
    Page<Customer> find(String key, String value, Pageable pageable);
}
