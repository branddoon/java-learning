package com.lambda.concurrency.impl;

import java.util.stream.IntStream;

public class ParallelStreamTimed {

    public void execute(){
        long startTime = System.currentTimeMillis();
        int r = IntStream.rangeClosed(1,200000000).parallel().reduce(0, Integer::sum);
        System.out.println("Result: " + r);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime));
    }
}
