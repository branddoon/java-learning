package com.lambda.util;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class Phone {

    private String name;

    private Double price;

    public Optional<String> getName() {
        return Optional.of(name);
    }

    public Optional<Double> getPrice() {
        return Optional.of(price);
    }
}
