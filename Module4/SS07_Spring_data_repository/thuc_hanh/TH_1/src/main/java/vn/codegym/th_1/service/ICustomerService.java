package vn.codegym.th_1.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.th_1.model.Customer;
import vn.codegym.th_1.model.Province;

public interface ICustomerService extends IGeneralService<Customer>{

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
