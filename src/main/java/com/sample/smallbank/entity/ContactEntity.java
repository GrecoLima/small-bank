package com.sample.smallbank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "contact_messages")
public class ContactEntity extends AbstractModificationAttributesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id", nullable = false)
    private Long contactId;

    @Column(name = "name", nullable = false)
    private String contactName;

    @Column(name = "email", nullable = false)
    private String contactEmail;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "message", nullable = false)
    private String message;

}
