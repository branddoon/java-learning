package com.lambda.streams.impl;

import com.lambda.util.Car;
import com.lambda.util.Review;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExerciseLambda {

    /*
    * Return true if the stream contains at least one video game with sales number more than 10
    * and not discount or its value more than 9.99. If not, return false
    * */
    public void executeExercise1(Stream<Car> stream){
        boolean r =  stream.filter( e -> e.getTotalSold() == 10)
                .anyMatch( e -> !e.getIsDiscount() || e.getPrice()> 9.99);
        System.out.println("Result: " + r);
    }

    /*
    * Return a stream with all XBOX console titles, during process print all results
    * ignore repetitive results
    *
    * */
    public void executeExercise2(Stream<Car> stream){
        //List<Videogame> r = stream.filter(e -> e.getConsole().equals(Console.XBOX)).sorted((a,b) -> a.getName().compareTo(b.getName())).distinct().toList();
        //r.forEach(System.out::println);
        List<Car> r = stream.filter(distinctByKey(Car::getName)).toList();
        r.forEach(System.out::println);

    }

    public <T>Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor){
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    /*
    * Return video game with more sales number, just review first ten appearances
    * */
    public void executeExercise3(Stream<Car> stream){
        Car car = stream
                .limit(10)
                .max(Comparator.comparing(Car::getTotalSold))
                .orElseThrow( () -> new RuntimeException("No video game found"));
        System.out.println(car);
    }

    /*
    * Return stream with all review comments of each video game.
    * */
    public void executeExercise4(Stream<Car> stream){
        List<Review> r = stream.flatMap(e -> e.getReviews().stream()).toList();
        r.forEach(System.out::println);
    }

    /*
    * Return a stream with all price video game more than 20.0, not using filter operator
    * */
    public void executeExercise5(Stream<Car> stream){
        List<Car> r = stream
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .takeWhile( e -> e.getPrice() > 20)
                .toList();
        r.forEach(System.out::println);
    }

}
