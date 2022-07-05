package com.seudallanha.ProdutosApi.services.servicesImpl;

import com.seudallanha.ProdutosApi.models.Bill;
import com.seudallanha.ProdutosApi.repositories.BillRepository;
import com.seudallanha.ProdutosApi.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public Collection<Bill> findAll() {
        return billRepository.findAll();
    }

    @Override
    public Bill findById(long id) {
        return billRepository.getOne(id);
    }

    @Override
    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public void delete(long id) {
        billRepository.deleteById(id);
    }

    @Override
    public Collection<Bill> findByMesANo(String mesAno) {
        return billRepository.findByMesAno(mesAno);
    }
}
