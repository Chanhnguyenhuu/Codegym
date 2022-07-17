package service;

import model.Category;
import repository.CategoryRepository;
import repository.ICategoryRepository;
import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryRepository categoryRepository = new CategoryRepository();

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id);
    }
}
