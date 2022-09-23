package vn.codegym.case_2.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_2.model.Customer;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    Page<T> findAll(Pageable pageable);
    List<T> findAll();
    void delete(int id);
    void create(T t);
    void edit(T t);
    Optional<T> findById(int id);
}
