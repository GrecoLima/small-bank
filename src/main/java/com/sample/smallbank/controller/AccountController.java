package com.sample.smallbank.controller;

import com.sample.smallbank.entity.AccountEntity;
import com.sample.smallbank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/myAccount")
    public ResponseEntity<List<AccountEntity>> getAccountDetails(@RequestParam Long id) {
        List<AccountEntity> accounts = accountService.getAccountDetails(id);
        return ResponseEntity.ok(accounts);
    }

}
