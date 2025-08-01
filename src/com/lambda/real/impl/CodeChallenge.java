package com.lambda.real.impl;

public class CodeChallenge {

    public void executeIsOdd(int n){
        boolean r = n % 2 == 0;
        System.out.println("Number: " + n + (r ? " is odd":" is not odd"));
    }

    public void executeIsPrime(int n){
        System.out.println("Number: " + n + (isPrime(n) ? " is prime" : " is not prime"));
    }

    private boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 ==0) return false;

        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
