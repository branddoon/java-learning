package com.lambda.lambdas.impl;

import java.util.function.BiPredicate;

public class BiPredicateApp {

    static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equals("HelloWorld");

    public void execute(){
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(myEquals.test(s1,s2));
    }

}
