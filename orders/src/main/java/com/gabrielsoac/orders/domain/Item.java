package com.gabrielsoac.orders.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public record Item(
        @Column(name = "item_id") Long id,
        @Column(name = "price") Double price,
        @Column(name = "amount") Integer amount,
        @Column(name = "partial_amount") Double partialAmount
)
{}
