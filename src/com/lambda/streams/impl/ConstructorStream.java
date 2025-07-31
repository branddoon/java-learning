package com.lambda.streams.impl;

import com.lambda.streams.util.Database;
import com.lambda.streams.util.Car;

import java.util.stream.Stream;

public class ConstructorStream {

    public void execute(){
        Stream<Car> myStream = Database.cars.stream();
        myStream.forEach( System.out::println);
    }
}
