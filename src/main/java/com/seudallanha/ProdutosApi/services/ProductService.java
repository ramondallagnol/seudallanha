package com.seudallanha.ProdutosApi.services;

import com.seudallanha.ProdutosApi.models.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface ProductService {
    Collection<Product> findAll();
    Product findById(long id);
    Product save(Product product);
    void delete(long id);
}
