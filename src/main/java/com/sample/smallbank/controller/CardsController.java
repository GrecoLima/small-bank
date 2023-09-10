package com.sample.smallbank.controller;

import com.sample.smallbank.entity.CardEntity;
import com.sample.smallbank.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    private final CardService cardService;

    @Autowired
    public CardsController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/myCards")
    public List<CardEntity> getCardDetails(@RequestParam Long id) {
        return cardService.getCardDetailsByCustomerId(id);
    }
}
