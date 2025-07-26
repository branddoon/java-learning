package com.lambda.lambdas.impl;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorApp {

    public void execute(){
        BiFunction<String, String, String> normalizerFunc = (a,b) -> a.toUpperCase() + " - " + b.toLowerCase();
        System.out.println(normalizerFunc.apply("Hello", "World"));
        BinaryOperator<String> normalizer = (a,b) -> a.toLowerCase() + " - " + b.toUpperCase();
        System.out.println(normalizer.apply("Hello", "World"));
    }
}
