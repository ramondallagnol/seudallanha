package com.seudallanha.ProdutosApi.controllers;

import com.seudallanha.ProdutosApi.models.Bill;
import com.seudallanha.ProdutosApi.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/bills")
public class BillController {
    @Autowired
    private BillService billService;

    @PostMapping
    public ResponseEntity<Bill> create(@RequestBody Bill bill) {
        return ResponseEntity.ok(billService.save(bill));
    }

    @GetMapping
    public ResponseEntity<Collection<Bill>> findAll() {
        return ResponseEntity.ok(billService.findAll());
    }

    @GetMapping("/{mesAno}")
    public ResponseEntity<Collection<Bill>> findById(@PathVariable("mesAno") String mesAno) {
        return ResponseEntity.ok(billService.findByMesANo(mesAno));
    }

}
