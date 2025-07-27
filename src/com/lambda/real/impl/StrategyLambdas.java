package com.lambda.real.impl;

import java.util.List;

public class StrategyLambdas {
    public void execute(){
        var product = new Product(1L,"BASIC","Bear",150.0);
        var product2 = new Product(1L,"PLUS","Bear",150.0);
        var product3 = new Product(1L,"PRIME","Bear",150.0);
        var products = List.of(product, product2, product3);
        products.forEach(p -> {
            switch (p.getUserType()){
                case "BASIC": p.setApplyDiscountStrategy(Strategies.basicDiscount); break;
                case "PLUS": p.setApplyDiscountStrategy(Strategies.plusDiscount); break;
                case "PRIME": p.setApplyDiscountStrategy(Strategies.primeDiscount); break;
            }
        });
        products.forEach( p -> {
            System.out.println("Price: " + p.getPrice() + " User Type: " + p.getUserType() + " Discount: " + p.getApplyDiscountStrategy().get(p.getPrice()));
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

class Product{
    private Long id;
    private String userType;
    private String name;
    private Double price;
    private ApplyDiscountStrategy applyDiscountStrategy;

    public Product(){
    }

    public Product(Long id, String userType, String name, Double price) {
        this.id = id;
        this.userType = userType;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ApplyDiscountStrategy getApplyDiscountStrategy() {
        return applyDiscountStrategy;
    }

    public void setApplyDiscountStrategy(ApplyDiscountStrategy applyDiscountStrategy) {
        this.applyDiscountStrategy = applyDiscountStrategy;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}