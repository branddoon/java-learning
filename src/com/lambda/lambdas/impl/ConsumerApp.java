package com.lambda.lambdas.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConsumerApp {

    public void execute(){
        Set<Integer> numbers= Set.of(1,2,4,5,6);
        List<Integer> squares = new LinkedList<>();
        numbers.forEach(n -> squares.add( n * n));
        System.out.println(squares);
        Map<Boolean, String> map = Map.of(true,"This is the true", false, "This is a lie");
        map.forEach((k,v) -> System.out.println("Key: " + k + " , Value: " + v));
    }
}
