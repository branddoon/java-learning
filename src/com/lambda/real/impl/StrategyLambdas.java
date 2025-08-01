package com.lambda.real.impl;

import lombok.*;

import java.util.List;

public class StrategyLambdas {
    public void execute(){
        var product = Product.builder().id(1L).userType("BASIC").name("Bear").price(150.0).applyDiscountStrategy(Strategies.basicDiscount);
        var product2 = Product.builder().id(1L).userType("PLUS").name("Bear").price(150.0).applyDiscountStrategy(Strategies.plusDiscount);
        var product3 = Product.builder().id(1L).userType("PRIME").name("Bear").price(150.0).applyDiscountStrategy(Strategies.primeDiscount);
        var products = List.of(product, product2, product3);
        products.forEach( p -> {
            System.out.println("Price: " + p.build().getPrice() + " User Type: " + p.build().getUserType() + " Discount: " + p.build().getApplyDiscountStrategy().get(p.build().getPrice()));
        });
    }
}

class Strategies{
    static ApplyDiscountStrategy basicDiscount = p -> p * 0.02;
    static ApplyDiscountStrategy plusDiscount = p -> p * 0.05;
    static ApplyDiscountStrategy primeDiscount = p -> p * 0.10;
}

@FunctionalInterface
interface ApplyDiscountStrategy{
    Double get(Double price);
}

@Builder
@Getter
@Setter
@ToString
class Product{
    private Long id;
    private String userType;
    private String name;
    private Double price;
    private ApplyDiscountStrategy applyDiscountStrategy;
}