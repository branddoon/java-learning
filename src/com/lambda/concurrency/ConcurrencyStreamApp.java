package com.lambda.concurrency;

import com.lambda.concurrency.impl.ParallelStream;
import com.lambda.concurrency.impl.ParallelStreamTimed;

public class ConcurrencyStreamApp {

    public static void main (String[] args){
        System.out.println("1. Parallel stream");
        ParallelStream parallelStream = new ParallelStream();
        parallelStream.execute();
        System.out.println("2. Parallel stream timed");
        ParallelStreamTimed parallelStreamTimed = new ParallelStreamTimed();
        parallelStreamTimed.execute();
    }
}
