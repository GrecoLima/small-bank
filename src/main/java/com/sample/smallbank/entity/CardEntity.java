package com.sample.smallbank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cards")
public class CardEntity extends AbstractModificationAttributesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id", nullable = false)
    private Long cardId;

    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;

    @Column(name = "card_number", nullable = false)
    private String cardNumber;

    @Column(name = "card_type", nullable = false)
    private String cardType;

    @Column(name = "total_limit", nullable = false)
    private Double totalLimit;

    @Column(name = "amount_used", nullable = false)
    private Double amountUsed;

    @Column(name = "available_amount", nullable = false)
    private Double availableAmount;

}
