package com.lambda.lambdas.impl;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierApp {

    static Supplier<Integer> randomInt = () -> new Random().nextInt(100);

    static Supplier<MyProduct> productSupplier = () -> new MyProduct(100, "Phone");

    public void execute(){
        System.out.println(randomInt.get());
        System.out.println(randomInt.get());
        System.out.println(productSupplier.get());
    }
}

@AllArgsConstructor
@ToString
class MyProduct {
    Integer price;
    String name;
}