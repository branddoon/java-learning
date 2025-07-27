package com.lambda.real;

import com.lambda.real.impl.ComparatorLambdas;
import com.lambda.real.impl.ConcurrenceLambdas;
import com.lambda.real.impl.ReadFile;
import com.lambda.real.impl.StrategyLambdas;

import java.util.concurrent.ExecutionException;

public class RealApp {

    public static void main(String[] args){
        System.out.println("1. Read file example");
        ReadFile readFile = new ReadFile();
        readFile.execute();
        System.out.println("2. Concurrent example");
        ConcurrenceLambdas concurrenceLambdas = new ConcurrenceLambdas();
        try{
            concurrenceLambdas.execute();
        }catch ( ExecutionException | InterruptedException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("3. Discount example");
        StrategyLambdas strategyLambdas = new StrategyLambdas();
        strategyLambdas.execute();
        System.out.println("3. Comparator example");
        ComparatorLambdas comparatorLambdas = new ComparatorLambdas();
        comparatorLambdas.execute();
    }
}
