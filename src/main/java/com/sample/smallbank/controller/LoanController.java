package com.sample.smallbank.controller;

import com.sample.smallbank.entity.LoanEntity;
import com.sample.smallbank.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {
    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/myLoans")
    public List<LoanEntity> getLoanDetails(@RequestParam Long id) {
        return loanService.getLoanDetailsByCustomerId(id);
    }
}
