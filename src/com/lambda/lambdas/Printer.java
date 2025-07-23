package com.lambda.lambdas;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
