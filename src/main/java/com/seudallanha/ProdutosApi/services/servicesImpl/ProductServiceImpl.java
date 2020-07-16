package com.seudallanha.ProdutosApi.services.servicesImpl;

import com.seudallanha.ProdutosApi.models.Product;
import com.seudallanha.ProdutosApi.repositories.ProductRepository;
import com.seudallanha.ProdutosApi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Collection<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(long id) {
        
    }
}
