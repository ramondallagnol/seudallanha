package com.seudallanha.ProdutosApi.services.servicesImpl;

import com.seudallanha.ProdutosApi.models.Category;
import com.seudallanha.ProdutosApi.models.Product;
import com.seudallanha.ProdutosApi.repositories.CategoryRepository;
import com.seudallanha.ProdutosApi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Collection<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(long id) {

    }
}
