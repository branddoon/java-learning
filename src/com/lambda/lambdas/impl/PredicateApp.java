package com.lambda.lambdas.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateApp {

    static Predicate<Integer> isGreaterThanFifty = n -> n > 50;
    static Predicate<Integer> isLessThanTwenty = n -> n < 20;
    static Predicate<Integer> isBetweenTwentyAndFifty = isGreaterThanFifty.or(isLessThanTwenty);

    public void execute(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,25,26,27,50,60,70,100));
        numbers.removeIf(isBetweenTwentyAndFifty);
        System.out.println("Numbers: " + numbers);
    }
}
