package com.lambda.lambdas.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReference {

    public void execute(){
        List<Integer> numbers = new ArrayList<>(10);
        IntStream intStream = IntStream.range(1,11);
        intStream.forEach(numbers::add);
        System.out.println("Result: " + numbers);
    }
}
