package com.lambda.streams.impl;

import com.lambda.streams.util.Car;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToCollection {

    public void execute(Stream<Car> stream, String type){
        if(type.equals("LIST")){
          System.out.println(stream.toList().getClass().getName());
        }else if (type.equals("SET")){
            System.out.println(stream.collect(Collectors.toSet()).getClass().getName());
        }else if (type.equals("MAP")){
            System.out.println(stream.distinct().collect(Collectors.toMap(Car::getName,Car::getPrice)));
        }
    }
}
