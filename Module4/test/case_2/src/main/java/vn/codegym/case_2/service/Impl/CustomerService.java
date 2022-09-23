package vn.codegym.case_2.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_2.model.Customer;
import vn.codegym.case_2.repository.ICustomerRepository;
import vn.codegym.case_2.service.ICustomerService;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    public Page<Customer> findAllByCustomerNameContaining(String name, Pageable pageable) {
        return customerRepository.findAllByCustomerNameContaining(name, pageable);
    }

    @Override
    public Page<Customer> findAllByCustomerGenderContaining(String value, Pageable pageable) {
        return customerRepository.findAllByCustomerNameContaining(value, pageable);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void edit(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    public Page<Customer> find(String key, String value, Pageable pageable) {
        switch (key.toLowerCase()) {
            case "name":
                return findAllByCustomerNameContaining(value, pageable);
            case "gender":
                return findAllByCustomerGenderContaining(value, pageable);
            default:
                return findAll(pageable);
        }
    }
}
