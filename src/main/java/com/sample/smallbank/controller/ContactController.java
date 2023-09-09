package com.sample.smallbank.controller;

import com.sample.smallbank.entity.ContactEntity;
import com.sample.smallbank.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Random;

@RestController
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/contact")
    public ContactEntity saveContactInquiryDetails(@RequestBody ContactEntity contact) {
        contact.setContactId(getServiceReqNumber());
        contact.setCreatedDate(LocalDate.now());
        return contactRepository.save(contact);
    }

    public Long getServiceReqNumber() {
        Random random = new Random();
        return random.nextLong(999999999 - 9999) + 9999;
    }
}
