package com.lambda.streams.impl;

import com.lambda.util.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionPartition {

    public void execute(Stream<Car> stream){
        Map<Boolean, List<Car>> r = stream.collect(Collectors.partitioningBy( e -> e.getPrice() > 300000.0));
        r.forEach((k,v) -> System.out.println( k + " - " + v));
    }
}
