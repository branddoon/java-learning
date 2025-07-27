package com.lambda.lambdas.impl;

import com.lambda.lambdas.interfaces.Math;

public class SimpleLambda {

    public void execute(){
        System.out.println("Starting execute lambda method by anonymous function...");
        Math subtract = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a + b;
            }
        };
        System.out.println(subtract.execute(10.0,5.0));
        System.out.println("Starting execute by multiply logic...");
        Math multiply = (a, b) -> a * b;
        System.out.println(multiply.execute(5.0,5.0));
        Math divide = (a, b) -> {
            System.out.println("Starting execute byh divide logic...");
            return a / b;
        };
        System.out.println(divide.execute(10.0,10.0));
    }
}
