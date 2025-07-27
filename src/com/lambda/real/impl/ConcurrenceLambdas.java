package com.lambda.real.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ConcurrenceLambdas {

    static Runnable printerSum = () -> {
        long total =0;
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 1000000; i++){
            total += i;
        }
        System.out.println("Total: " + total);
    };

    static Callable<Long> getSum = () -> {
        long total =0;
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 1000000; i++){
            total += i;
        }
        return total;
    };

    public void execute() throws ExecutionException, InterruptedException {
        var simpleExec = Executors.newSingleThreadExecutor();
        simpleExec.submit(printerSum);
        simpleExec.shutdown();
        var execWithResult = Executors.newSingleThreadExecutor();
        var result = execWithResult.submit(getSum);
        System.out.println(result.get());
        execWithResult.shutdown();
    }


}
