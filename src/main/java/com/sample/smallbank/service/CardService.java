package com.sample.smallbank.service;

import com.sample.smallbank.entity.CardEntity;
import com.sample.smallbank.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<CardEntity> getCardDetailsByCustomerId(Long customerId) {
        return cardRepository.findByCustomer_CustomerId(customerId);
    }
}

