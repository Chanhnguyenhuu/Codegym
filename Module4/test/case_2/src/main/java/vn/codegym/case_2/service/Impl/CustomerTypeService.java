package vn.codegym.case_2.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_2.model.Customer;
import vn.codegym.case_2.model.CustomerType;
import vn.codegym.case_2.repository.ICustomerTypeRepository;
import vn.codegym.case_2.service.ICustomerTypeService;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeService implements ICustomerTypeService {

    @Autowired
    private ICustomerTypeRepository customerTypeRepository;

    @Override
    public Page<CustomerType> findAll(Pageable pageable) {
        return customerTypeRepository.findAll(pageable);
    }

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(CustomerType customerType) {

    }

    @Override
    public void edit(CustomerType customerType) {

    }

    @Override
    public Optional<CustomerType> findById(int id) {
        return null;
    }
}
