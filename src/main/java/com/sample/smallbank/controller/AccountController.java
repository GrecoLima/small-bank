package com.sample.smallbank.controller;

import com.sample.smallbank.dto.AccountDTO;
import com.sample.smallbank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/myAccount")
    public ResponseEntity<AccountDTO> getAccountDetails(@RequestParam Long id) {
        AccountDTO accountDTO = accountService.getAccountDetails(id);
        return ResponseEntity.ok(accountDTO);
    }

}
