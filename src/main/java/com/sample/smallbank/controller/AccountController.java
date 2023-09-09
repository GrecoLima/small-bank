package com.sample.smallbank.controller;

import com.sample.smallbank.entity.AccountEntity;
import com.sample.smallbank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/myAccount")
    public List<AccountEntity> getAccountDetails(@RequestParam Long id) {
        List<AccountEntity> accounts = accountRepository.findByCustomer_CustomerId(id);
        return accounts;
    }

}
