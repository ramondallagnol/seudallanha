package com.seudallanha.ProdutosApi.controllers;

import com.seudallanha.ProdutosApi.models.Category;
import com.seudallanha.ProdutosApi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @GetMapping
    public Collection<Category> getAll() {
        return categoryService.findAll();
    }
}
