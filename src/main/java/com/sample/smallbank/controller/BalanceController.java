package com.sample.smallbank.controller;

import com.sample.smallbank.entity.AccountTransactionEntity;
import com.sample.smallbank.service.AccountTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    private final AccountTransactionService accountTransactionService;

    @Autowired
    public BalanceController(AccountTransactionService accountTransactionService) {
        this.accountTransactionService = accountTransactionService;
    }

    @GetMapping("/myBalance")
    public ResponseEntity<List<AccountTransactionEntity>> getBalanceDetails(@RequestParam Long id) {
        List<AccountTransactionEntity> transactions = accountTransactionService.getBalanceDetails(id);
        return ResponseEntity.ok(transactions);
    }
}
