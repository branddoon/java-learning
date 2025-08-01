package com.lambda.streams.impl;

import com.lambda.util.Brand;
import com.lambda.util.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionGroupBy {

    public void executeGroupBy(Stream<Car> stream){
        Map<Brand, List<Car>> r = stream.collect(Collectors.groupingBy(Car::getBrand));
        r.forEach((k,v) -> System.out.println( k + " - " + v));
    }

    public void executeGroupBySum(Stream<Car> stream){
        Map<Brand, Integer> r = stream.collect(Collectors.groupingBy(Car::getBrand, Collectors.summingInt(Car::getTotalSold)));
        r.forEach((k,v) -> System.out.println( k + " - " + v));
    }
}
