package com.sample.smallbank.controller;

import com.sample.smallbank.entity.AccountTransactionEntity;
import com.sample.smallbank.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    @GetMapping("/myBalance")
    public List<AccountTransactionEntity> getBalanceDetails(@RequestParam Long id) {
        return accountTransactionRepository.
                findByCustomer_CustomerIdOrderByTransactionDtDesc(id);
    }
}
