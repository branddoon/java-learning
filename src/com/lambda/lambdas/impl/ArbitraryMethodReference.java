package com.lambda.lambdas.impl;

import java.util.function.BiPredicate;

public class ArbitraryMethodReference {
    public void execute(){
        BiPredicate<String, String> equalsByLambda = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> equalsByReference = String::equals;
        boolean isEqualsByLambda= equalsByLambda.test("a","a");
        boolean isEqualsByReference = equalsByReference.test("a","a");
        System.out.println("Lambda: " + isEqualsByLambda);
        System.out.println("Reference: " + isEqualsByReference);
    }
}
