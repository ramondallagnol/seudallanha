package com.seudallanha.ProdutosApi.services;

import com.seudallanha.ProdutosApi.models.Bill;

import java.util.Collection;

public interface BillService {
    Collection<Bill> findAll();
    Bill findById(long id);
    Bill save(Bill bill);
    void delete(long id);
    Collection<Bill> findByMesANo(String mesAno);
}
