package com.lambda.concurrency.impl;

import java.util.List;

public class ParallelStream {

    public void execute(){
        List<Integer> numbers = List.of(1,2,3,4,5);
        numbers.parallelStream().forEach( n ->
                System.out.println(n + " - " + Thread.currentThread().getName()));
    }
}
