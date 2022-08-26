package vn.codegym.th_3.service;


import vn.codegym.th_3.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
