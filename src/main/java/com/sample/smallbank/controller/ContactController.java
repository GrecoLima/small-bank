package com.sample.smallbank.controller;

import com.sample.smallbank.entity.ContactEntity;
import com.sample.smallbank.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/contact")
    public ContactEntity saveContactInquiryDetails(@RequestBody ContactEntity contact) {
        return contactService.saveContact(contact);
    }
}
