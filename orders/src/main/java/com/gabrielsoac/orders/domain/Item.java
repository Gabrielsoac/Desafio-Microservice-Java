package com.gabrielsoac.orders.domain;

public record Item(
        Long id,
        Double price,
        Integer amount,
        Double partialAmount
)
{}
