package com.sample.smallbank.controller;

import com.sample.smallbank.entity.LoanEntity;
import com.sample.smallbank.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @GetMapping("/myLoans")
    public List<LoanEntity> getLoanDetails(@RequestParam Long id) {
        return loanRepository.findByCustomer_CustomerIdOrderByCreatedDateDesc(id);
    }


}
