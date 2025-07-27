package com.lambda.lambdas.interfaces;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
