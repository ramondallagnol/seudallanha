package com.seudallanha.ProdutosApi.services;

import com.seudallanha.ProdutosApi.models.Category;
import com.seudallanha.ProdutosApi.models.Product;

import java.util.Collection;

public interface CategoryService {
    Collection<Category> findAll();
    Category findById(long id);
    Category save(Category category);
    void delete(long id);
}
