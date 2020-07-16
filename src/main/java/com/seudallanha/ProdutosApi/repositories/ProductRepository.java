package com.seudallanha.ProdutosApi.repositories;

import com.seudallanha.ProdutosApi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
