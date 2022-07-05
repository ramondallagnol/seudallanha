package com.seudallanha.ProdutosApi.repositories;

import com.seudallanha.ProdutosApi.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BillRepository extends JpaRepository<Bill, Long> {
    Collection<Bill> findByMesAno(String mesAno);
}
