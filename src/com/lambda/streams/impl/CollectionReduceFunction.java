package com.lambda.streams.impl;

import com.lambda.util.Car;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionReduceFunction {

    public void executeAvg(Stream<Car> stream){
        Double avg = stream.collect(Collectors.averagingDouble(Car::getPrice));
        System.out.println(avg);
    }

    public void executeSummarizingInt(Stream<Car> stream){
        IntSummaryStatistics r = stream.collect(Collectors.summarizingInt(e -> e.getReviews().size()));
        System.out.println("Sum: " + r.getSum());
        System.out.println("Max: " + r.getMax());
        System.out.println("Min: " + r.getMin()) ;
        System.out.println("Avg: " + r.getAverage());
    }

    public void executeJoin(Stream<Car> stream) {
        String r = stream.map(Car::toString)
                .collect(Collectors.joining("\n"));
        System.out.println("Result: " + r);
    }
}
