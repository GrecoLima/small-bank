package com.sample.smallbank.service;

import com.sample.smallbank.entity.ContactEntity;
import com.sample.smallbank.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactEntity saveContact(ContactEntity contact) {
        contact.setContactId(getServiceReqNumber());
        contact.setCreatedDate(LocalDate.now());
        contact.setActive(true);
        return contactRepository.save(contact);
    }

    private Long getServiceReqNumber() {
        Random random = new Random();
        return random.nextLong(999999999 - 9999) + 9999;
    }
}