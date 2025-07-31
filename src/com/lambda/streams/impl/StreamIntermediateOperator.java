package com.lambda.streams.impl;

import com.lambda.streams.util.BasicCar;
import com.lambda.streams.util.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperator {

    public void executeDistinct(Stream<Car> stream){
        System.out.println(stream.distinct().count());
    }

    public void executeLimit(Stream<Car> stream){
        List<Car> r = stream.limit(5).toList();
        r.forEach(System.out::println);
    }

    public void executeSkip(Stream<Car> stream){
        List<Car> r = stream.skip(19).toList();
        r.forEach(System.out::println);
    }

    public void executeFilter(Stream<Car> stream){
        List<Car> r = stream.filter(e -> e.getPrice() > 12.0)
                .filter( e -> !e.getIsDiscount())
                .filter(e -> e.getOfficialWebsite().contains("forza"))
                .toList();
        r.forEach(System.out::println);
    }

    public void executeMap(Stream<Car> stream){
        List<BasicCar> r = stream
                .map( e -> BasicCar.builder()
                        .name(e.getName())
                        .price(e.getPrice())
                        .brand(e.getBrand())
                        .build()).toList();
        System.out.println("-------Basic video games-------");
        r.forEach(System.out::println);
        List<String> titles = r.stream().map(BasicCar::getName).toList();
        System.out.println("-----Titles------");
        titles.forEach(System.out::println);
    }

    public void executeFlatMap(Stream<Car> stream){
        var r = stream.flatMap( e -> e.getReviews().stream()).toList();
        System.out.println(r);
    }

    public void moreMapAndFlatMap(Stream<Car> stream){
        /*
        var totalReviews = stream.map( e -> v.getReviews().stream()).count()
        var totalReviews = stream.flatMap(e -> v.getReviews().stream()).count();
        */
        var totalReviews = stream.mapToLong(e -> e.getReviews().size()).sum();
        System.out.println(totalReviews);
    }

    public void executePeek(Stream<Car> stream){
        /*
        stream.peek( e -> e.setName("")).forEach(System.out::println);
        */
        stream.peek(System.out::println);
    }

    public void executeSort(Stream<Car> stream){
        List<Car> listSorted = stream
                .sorted( Comparator.comparingInt(e -> e.getReviews().size()))
                .toList();
        listSorted.forEach(System.out::println);
    }

    public void executeTakeWhile(Stream<Car> stream){
        List<Car> listSorted = stream
                .sorted(Comparator.comparing(Car::getName))
                .takeWhile( e -> !e.getName().startsWith("M"))
                .toList();
        listSorted.forEach(System.out::println);
    }

    public void executeDropWhile(Stream<Car> stream){
        List<Car> listSorted = stream
                .sorted(Comparator.comparing(Car::getName))
                .dropWhile( e -> !e.getName().startsWith("M"))
                .toList();
        listSorted.forEach(System.out::println);
    }
}
