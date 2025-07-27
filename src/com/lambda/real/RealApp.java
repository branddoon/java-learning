package com.lambda.real;

import com.lambda.real.impl.ConcurrenceLambdas;
import com.lambda.real.impl.ReadFile;

import java.util.concurrent.ExecutionException;

public class RealApp {

    public static void main(String[] args){
        System.out.println("1. Read file");
        ReadFile readFile = new ReadFile();
        readFile.execute();
        System.out.println("2. Concurrent lambda");
        ConcurrenceLambdas concurrenceLambdas = new ConcurrenceLambdas();
        try{
            concurrenceLambdas.execute();
        }catch ( ExecutionException | InterruptedException exception){
            System.out.println(exception.getMessage());
        }
    }
}
