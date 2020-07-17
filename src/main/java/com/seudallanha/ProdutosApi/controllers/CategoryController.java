package com.seudallanha.ProdutosApi.controllers;

import com.seudallanha.ProdutosApi.models.Category;
import com.seudallanha.ProdutosApi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category) {
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Collection<Category>> getAll() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }
}
