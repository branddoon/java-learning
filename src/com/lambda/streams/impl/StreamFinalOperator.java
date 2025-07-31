package com.lambda.streams.impl;

import com.lambda.streams.util.Car;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinalOperator {

    public void executeCount(Stream<Car> stream){
        System.out.println("Result: " + stream.count());
    }

    public void executeAnyMatch(Stream<Car> stream){
        boolean r = stream.anyMatch( e -> e.getTotalSold() > 1);
        System.out.println("Result: " + r);
    }

    public void executeAllMatch(Stream<Car> stream){
        boolean r = stream.allMatch( e -> e.getTotalSold() > 150);
        System.out.println("Result: " + r);
    }

    public void executeNonMatch(Stream<Car> stream){
        boolean r = stream.noneMatch( Car::getIsDiscount);
        System.out.println("Result: " + r);
    }

    public void executeFindFirst(Stream<Car> stream){
        Optional<Car> r = stream.findFirst();
        System.out.println(r);
    }

    public void executeAnyOperator(Stream<Car> stream){
        Optional<Car> r = stream.findAny();
        System.out.println(r);
    }

    public void executeReduceOperator(Stream<Car> stream){
        Optional<Integer> r = stream.filter(Car::getIsDiscount)
                .map(Car::getTotalSold)
                .reduce(Integer::sum);
        System.out.println(r);
    }

    public void executeMaxOperator(Stream<Car> stream){
        Optional<Car> r = stream.max((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(r.get().getName());
    }

    public void executeMinOperator(Stream<Car> stream){
        Optional<Car> r = stream.min((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(r.get().getName());
    }

}
