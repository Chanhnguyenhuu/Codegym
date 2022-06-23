package service;

import model.Customer;
import repository.CustomerRepository;
import repository.IsCustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements IsCustomerService {
    private IsCustomerRepository isCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(isCustomerRepository.findAll());
    }

    @Override
    public void save(Customer customer) {
        isCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return isCustomerRepository.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        isCustomerRepository.update(id, customer);
    }

    @Override
    public void remove(int id) {
        isCustomerRepository.remove(id);
    }
}
