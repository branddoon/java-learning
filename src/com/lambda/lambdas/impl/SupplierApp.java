package com.lambda.lambdas.impl;

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

class MyProduct {
    Integer price;
    String name;
    public MyProduct(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public String toString() {
        return "MyProduct{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}