package com.lambda.streams.impl;

import com.lambda.streams.util.Brand;
import com.lambda.streams.util.Car;
import com.lambda.streams.util.Review;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseCollector {

    /*
    * Return list of reviews
    * */
    public void executeExercise1(Stream<Car> stream){
        List<Review> r = stream.flatMap( e -> e.getReviews().stream()).toList();
        r.forEach(System.out::println);
    }

    /*
    * Return a map with true values of all cars that have url website longitude more than fifteen,
    * If that condition is not satisfied return all elements that don't apply in false list
    * */
    public void executeExercise2(Stream<Car> stream){
        Map<Boolean, List<Car>> r = stream.collect(Collectors.partitioningBy( e -> e.getOfficialWebsite().length() > 10));
        r.forEach((k,v) -> System.out.println(k + " - " + v));
    }

    /*
    * Return a map with sales average of all cars
    * key needs to be Brand and value the average
    * */
    public void executeExercise3(Stream<Car> stream){
        Map<Brand, Integer> r = stream.collect(Collectors.groupingBy(Car::getBrand,Collectors.summingInt(Car::getTotalSold)));
        r.forEach((k,v) -> System.out.println(k + " - " + v));
    }

}
