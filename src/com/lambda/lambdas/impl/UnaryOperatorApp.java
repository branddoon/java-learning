package com.lambda.lambdas.impl;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorApp {

    static Function<String, String> functionToUpper =  String::toUpperCase;
    static UnaryOperator<String> unaryOperator =  String::toUpperCase;
    static UnaryOperator<Integer> unaryInt =  n -> n * n;
    static IntUnaryOperator intUnaryOperator = n -> n * n;

    public void execute(){
        String arg = "This is code!";
        System.out.println("Function: " + functionToUpper.apply(arg));
        System.out.println("Unary: " + unaryOperator.apply(arg));
        System.out.println("Unary int: " + unaryInt.apply(10));
        System.out.println("IntUnaryOperator: " + intUnaryOperator.applyAsInt(10));
    }
}
