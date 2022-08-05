package vn.codegym.bt_11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.bt_11.model.Category;
import vn.codegym.bt_11.repository.ICategoryRepository;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void create(Category category) {
        categoryRepository.save(category);
    }
}
