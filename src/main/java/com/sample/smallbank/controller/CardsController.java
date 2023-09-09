package com.sample.smallbank.controller;

import com.sample.smallbank.entity.CardEntity;
import com.sample.smallbank.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/myCards")
    public List<CardEntity> getCardDetails(@RequestParam Long id) {
        return cardRepository.findByCustomer_CustomerId(id);
    }
}
